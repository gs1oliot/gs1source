package org.gs1.source.service.registration;

import java.io.IOException;
import java.util.Properties;

import javax.xml.bind.JAXBException;

import org.gs1.source.service.DAOFactory;
import org.gs1.source.service.DataAccessObject;
import org.gs1.source.service.aimi.ONSModule;
import org.gs1.source.service.mongo.ServiceKey;
import org.gs1.source.service.type.TSDIndexMaintenanceRequestType;
import org.gs1.source.service.type.TSDServiceReferenceType;
import org.gs1.source.service.util.CheckBit;
import org.gs1.source.service.util.POJOConvertor;
import org.gs1.source.tsd.CountryCodeType;
import org.gs1.source.tsd.TSDQueryByGTINResponseType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Registerar {

	private static final Logger logger = LoggerFactory.getLogger(Registerar.class);
	
	private static final String PROPERTY_PATH = "aggregator.properties";

	public static final int NOT_AUTHENTICATED = 0;
	public static final int NODATA = 1;
	public static final int NOT_VALID = 2;
	public static final int EXISTED = 3;
	public static final int INSERTED = 4;

	private DAOFactory factory;
	private String DBtype;

	public Registerar(DAOFactory factory, String DBtype) {
		this.factory = factory;
		this.DBtype = DBtype;
	}

	public int register(String key, String xmldata) throws JAXBException, IOException {

		ServiceKey serviceKey = new ServiceKey();
		
		if(!serviceKey.queryKey(key)) {
			logger.info("Service Key is not authenticated");
			return NOT_AUTHENTICATED;
		}
		
		//Check whether the data is empty
		if (xmldata == "") {
			logger.info("Data is empty");
			return NODATA;
		}

		//Check whether the data satisfies XML schema
		XmlValidator validator = new XmlValidator();
		if (validator.xmlValidate(xmldata) == false) {
			logger.info("Not satisfy XML schema");
			return NOT_VALID;
		}

		//Unmarshall productData of xml form
		POJOConvertor convertor = new POJOConvertor();
		TSDQueryByGTINResponseType rs = convertor.unmarshal(xmldata);
		String gtin = rs.getProductData().getGtin();
		CountryCodeType targetMarket = rs.getProductData().getTargetMarket();
		
		//Check whether GTIN and TargetMarket is valid
		CheckBit checkBit = new CheckBit();
		if(gtin.length() < 14 || checkBit.check(gtin) == false) {
			logger.info("Invalid GTIN");
			return NOT_VALID;

		} else if(targetMarket.getValue().length() != 3) {
			logger.info("Invalid TargetMarket");
			return NOT_VALID;
		}

		//Check whether there exists already same data
		DataAccessObject dao = factory.getDAO(DBtype);
		TSDQueryByGTINResponseType rs_check = dao.queryDB(gtin, rs.getProductData().getTargetMarket());
		if(rs_check != null) {
			logger.info("Existing Data");
			return EXISTED;
		}
		
		dao.insertDB(rs);

		//ONS Domain Update
		rs_check = dao.queryDB(gtin);
		if(rs_check == null) {

			Properties prop = new Properties();
			prop.load(getClass().getClassLoader().getResourceAsStream(PROPERTY_PATH));
			String aggregatorUrl = prop.getProperty("aggregatorUrl");

			TSDIndexMaintenanceRequestType request = new TSDIndexMaintenanceRequestType();
			request.setGtin(gtin);
			request.setDataAggregatorService(new TSDServiceReferenceType(aggregatorUrl));

			ONSModule onsModule = new ONSModule();
			onsModule.add(request);
		}
		
		return INSERTED;
	}

}
