package org.gs1.source.service.aaqi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.net.ssl.HttpsURLConnection;

import org.gs1.source.service.DAOFactory;
import org.gs1.source.service.DataAccessObject;
import org.gs1.source.service.aiqi.AIQIProcessor;
import org.gs1.source.service.mongo.MongoClientKey;
import org.gs1.source.service.type.TSDQueryByGTINRequestType;
import org.gs1.source.service.type.TSDQueryIndexByGTINRequestType;
import org.gs1.source.service.type.TSDQueryIndexByGTINResponseType;
import org.gs1.source.service.util.CheckBit;
import org.gs1.source.service.util.MacEncode;
import org.gs1.source.service.util.MacUrlGenerator;
import org.gs1.source.service.util.POJOConvertor;
import org.gs1.source.service.util.TSDExceptionGenerator;
import org.gs1.source.tsd.CountryCodeType;
import org.gs1.source.tsd.TSDInvalidGTINExceptionType;
import org.gs1.source.tsd.TSDInvalidRequestExceptionType;
import org.gs1.source.tsd.TSDInvalidTargetMarketExceptionType;
import org.gs1.source.tsd.TSDNoDataExceptionType;
import org.gs1.source.tsd.TSDQueryByGTINResponseType;
import org.gs1.source.tsd.TSDSecurityExceptionType;
import org.gs1.source.tsd.TSDUnsupportedVersionExceptionType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Process query containing AAQI
 * @author Hyeeun
 *
 */
public class QueryProcessor implements AggregatorAggregatorQueryInterface {

	private static final Logger logger = LoggerFactory.getLogger(QueryProcessor.class);

	private static final String PROPERTY_PATH = "aggregator.properties";

	private DAOFactory factory;
	private String DBtype;
	private TSDQueryByGTINRequestType request;
	private String aggregatorUrl;
	private String gtin;
	private CountryCodeType targetMarket;
	private String clientGln;

	public QueryProcessor(DAOFactory factory, String DBtype, TSDQueryByGTINRequestType request, String clientGln) {

		this.factory = factory;
		this.DBtype = DBtype;
		this.request = request;
		this.gtin = request.getGtin();
		this.targetMarket = request.getTargetMarket();
		this.aggregatorUrl = null;
		this.clientGln = clientGln;
	}

	/**
	 * query to cache and backend repository
	 * call AIQI
	 * process AAQI by call for queryByGtin method
	 * @return
	 * @throws Exception
	 */
	public String query() throws Exception {

		TSDQueryByGTINResponseType rs = new TSDQueryByGTINResponseType();
		
		String targetMarketValue = request.getTargetMarket().getValue();

		TSDExceptionGenerator exceptionGenerator = new TSDExceptionGenerator();
		
		//Check whether GTIN is valid
		CheckBit checkBit = new CheckBit();
		if(gtin.length() < 14 || checkBit.check(gtin) == false) {
			
			TSDInvalidGTINExceptionType exception = (TSDInvalidGTINExceptionType) exceptionGenerator.generateInvalidGTINException();
			rs.setInvalidGTINException(exception);
			
			logger.info("Invalid GTIN");

		//Check whether Target Market is valid
		} else if(targetMarketValue.length() != 3) {
			
			TSDInvalidTargetMarketExceptionType exception = (TSDInvalidTargetMarketExceptionType) exceptionGenerator.generateInvalidTargetMarketException();
			rs.setInvalidTargetMarketException(exception);
			
			logger.info("Invalid TargetMarket");

		} else {

			DataAccessObject dao = factory.getDAO(DBtype);

			//query to cache
			rs = dao.queryCache(gtin, targetMarketValue);

			if(rs != null) {
				logger.info("Get Data from Cache");
			} else {
				
				//query to backend repository
				rs = dao.queryDB(gtin, targetMarket);
				if(rs != null) {
					logger.info("Get Data from Mongo");
					dao.insertCache(rs);
				} else {
					//Call AIQI
					TSDQueryIndexByGTINRequestType aiqiRequest = new TSDQueryIndexByGTINRequestType();
					aiqiRequest.setGtin(gtin);
					aiqiRequest.setTargetMarket(targetMarket);

					AIQIProcessor aiqiProcessor = new AIQIProcessor();
					TSDQueryIndexByGTINResponseType aiqiResponse = aiqiProcessor.queryByGtin(aiqiRequest);
					if(aiqiResponse == null) {
						//This means No Data Aggregator that has desired product data.
						logger.info("No Data in GS1 Source");

						TSDNoDataExceptionType exception = (TSDNoDataExceptionType) exceptionGenerator.generateNoDataException();

						rs = new TSDQueryByGTINResponseType();
						rs.setNoDataException(exception);

					} else {
						aggregatorUrl = aiqiResponse.getIndexEntry().getDataAggregatorService().getBaseUrl();
						Properties prop = new Properties();
						prop.load(getClass().getClassLoader().getResourceAsStream(PROPERTY_PATH));
						String thisUrl = prop.getProperty("aggregatorUrl");
						if(aggregatorUrl.compareTo(thisUrl) == 0) {
							//This means that the data of the GTIN exists, but not supports desired Target Market.
							logger.info("This data is not supported with this target market.");

							TSDNoDataExceptionType exception = (TSDNoDataExceptionType) exceptionGenerator.generateNoDataException();

							rs = new TSDQueryByGTINResponseType();
							rs.setNoDataException(exception);

						} else {
							//process AAQI
							rs = queryByGtin(request);
							if(rs.getProductData() != null) {
								logger.info("Get Data from AAQI");
								dao.insertCache(rs);
							} else {
								//There is exception, so query failed.
								logger.info("Data Query Failed by Exception");
							}
						}
					}
				}
			}
		}

		//Marshal data to string
		POJOConvertor convertor = new POJOConvertor();
		String str = convertor.marshal(rs);
		logger.info("Marshalling");

		return str;

	}

	/**
	 * AAQI query
	 * @param request
	 * @param aggregatorUrl
	 * @return
	 * @throws Exception
	 */
	public TSDQueryByGTINResponseType queryByGtin(TSDQueryByGTINRequestType request) throws Exception{

		TSDQueryByGTINResponseType rs = new TSDQueryByGTINResponseType();

		String gtin = request.getGtin();
		String targetMarketValue = request.getTargetMarket().getValue();
		String dataVersion = request.getDataVersion();

		TSDExceptionGenerator exceptionGenerator = new TSDExceptionGenerator();
		
		//Check whether the request is valid
		if(gtin == null || request.getTargetMarket() == null || dataVersion == null) {
			
			TSDInvalidRequestExceptionType exception = (TSDInvalidRequestExceptionType) exceptionGenerator.generateInvalidRequestException();
			rs.setInvalidRequestException(exception);
			
			return rs;
		}

		Properties prop = new Properties();
		prop.load(getClass().getClassLoader().getResourceAsStream(PROPERTY_PATH));
		String currentDataVersion = prop.getProperty("dataVersion");

		//Check whether requested version is supported
		if(Float.parseFloat(dataVersion) > Float.parseFloat(currentDataVersion)) {

			TSDUnsupportedVersionExceptionType exception = (TSDUnsupportedVersionExceptionType) exceptionGenerator.generateUnsupportedVersionException();
			rs.setUnsupportedVersionException(exception);
			
			return rs;
		}

		//Get client key
		MongoClientKey client= new MongoClientKey();
		String key = client.queryKey(aggregatorUrl);

		//clientGln of this Data Aggregator

		String clientGln = prop.getProperty("clientGln");

		//URL which is a parameter of MacEncode
		MacUrlGenerator macUrlGenerator = new MacUrlGenerator(gtin, targetMarketValue, dataVersion, clientGln);
		String mac_url = macUrlGenerator.getMacUrl();

		//Generate MAC
		MacEncode macEncode = new MacEncode();
		String mac = macEncode.encode(key, mac_url);

		String url = aggregatorUrl + mac_url + "&mac=" + mac;

		//set Https Connection
		HttpsURLConnection con = HttpsConnection.connect(url);

		if(con.getResponseCode() != 200) {
			System.out.println("Failed : HTTP error code : " + con.getResponseCode());
		}

		//Print response headers
		System.out.println("\nResponse Headers:\n");
		Map<String, List<String>> map = con.getHeaderFields();
		for(Map.Entry<String, List<String>> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		//Get response body and print it
		BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
		String output;
		StringBuffer response = new StringBuffer();

		System.out.println("\nResponse Body:\n");

		while ((output = br.readLine()) != null) {
			System.out.println(output);
			response.append(output);
			if(output.compareTo("") != 0)
				response.append("\n");
		}
		br.close();

		con.disconnect();

		//Response does not contain data
		if(response.toString().contains("Exception")) {

			TSDSecurityExceptionType exception = (TSDSecurityExceptionType) exceptionGenerator.generateSecurityException();
			rs.setSecurityException(exception);
			
			return rs;
		}

		//Generate MAC of payload
		String mac_payload = macEncode.encode(key, response.toString());

		//Check whether payload is reliable
		if(response.length() == 0 || mac_payload.compareTo(con.getHeaderField("GS1-MAC")) != 0) {
			System.out.println("Exception: payload is not identical.");
			
			TSDNoDataExceptionType exception = (TSDNoDataExceptionType) exceptionGenerator.generateNoDataException();
			rs.setNoDataException(exception);
			
			return rs;
		}

		//Unmarshall product data of xml form
		POJOConvertor convertor = new POJOConvertor();
		rs = convertor.unmarshal(response.toString());

		return rs;

	}

	/**
	 * Check the query from Data Aggregator through AAQI
	 * @return
	 */
	public boolean isAAQI() {

		if(clientGln.compareTo("0") != 0) {
			return true;
		}

		return false;
	}

}
