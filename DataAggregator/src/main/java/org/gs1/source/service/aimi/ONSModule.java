package org.gs1.source.service.aimi;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.xml.bind.DatatypeConverter;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.gs1.source.service.type.TSDIndexMaintenanceRequestSuccessType;
import org.gs1.source.service.type.TSDIndexMaintenanceRequestType;
import org.gs1.source.service.type.TSDIndexMaintenanceResponseType;
import org.gs1.source.service.util.DomainConvertor;
import org.gs1.source.service.util.TSDExceptionGenerator;
import org.gs1.source.tsd.Description200Type;
import org.gs1.source.tsd.TSDImplementationExceptionType;
import org.json.JSONException;
import org.json.JSONObject;

public class ONSModule implements AggregatorIndexMaintenanceInterface {

	private static final String PROPERTY_PATH = "aggregator.properties";

	private String onsServiceUrl;
	private String onsServerIP;
	private String username;
	private String password;

	public ONSModule() throws IOException {

		Properties prop = new Properties();
		prop.load(getClass().getClassLoader().getResourceAsStream(PROPERTY_PATH));
		onsServiceUrl = prop.getProperty("ons_service_url");
		onsServerIP = prop.getProperty("ons_server_ip");
		username = prop.getProperty("admin_username");
		password = prop.getProperty("password");
	}

	/**
	 * Add zone in ONS
	 * @param request
	 * @return
	 * @throws ClientProtocolException 
	 * @throws IOException
	 */
	public TSDIndexMaintenanceResponseType add(TSDIndexMaintenanceRequestType request) throws IOException {
		
		TSDIndexMaintenanceResponseType rs = new TSDIndexMaintenanceResponseType();
		
		String domain = (new DomainConvertor()).convert(request.getGtin());
		
		String token = onsLogin();
		
		TSDExceptionGenerator exceptionGenerator = new TSDExceptionGenerator();

		if(token == null) {
			System.out.println("add is failed");
			TSDImplementationExceptionType exception = (TSDImplementationExceptionType) exceptionGenerator.generateImplementationException();
			rs.setImplementationException(exception);
			
			return rs;
		}
		
		if(addDomain(domain, token)) {
			if(addRecords(domain, token, request.getDataAggregatorService().getBaseUrl())) {
				System.out.println("add is done");
				TSDIndexMaintenanceRequestSuccessType indexMaintenanceRequestSuccess = new TSDIndexMaintenanceRequestSuccessType();
				Description200Type description = new Description200Type();
				description.setLanguageCode("en");
				description.setCodeListVersion("1.1");
				description.setValue("Success");
				indexMaintenanceRequestSuccess.setSuccess(description);
				rs.setIndexMaintenanceRequestSuccess(indexMaintenanceRequestSuccess);
				
				return rs;
			} else {
				System.out.println("add is failed");
				TSDImplementationExceptionType exception = (TSDImplementationExceptionType) exceptionGenerator.generateImplementationException();
				rs.setImplementationException(exception);
				
				return rs;
			}
		} else {
			System.out.println("add is failed");
			TSDImplementationExceptionType exception = (TSDImplementationExceptionType) exceptionGenerator.generateImplementationException();
			rs.setImplementationException(exception);
			
			return rs;
		}

	}

	public TSDIndexMaintenanceResponseType change(TSDIndexMaintenanceRequestType request){


		return null;

	}

	public TSDIndexMaintenanceResponseType correct(TSDIndexMaintenanceRequestType request){


		return null;

	}

	//Delete domain in ONS
	public TSDIndexMaintenanceResponseType delete(TSDIndexMaintenanceRequestType request) throws IOException{
		
		TSDIndexMaintenanceResponseType rs = new TSDIndexMaintenanceResponseType();

		String domain = (new DomainConvertor()).convert(request.getGtin());
		
		String token = onsLogin();
		
		TSDExceptionGenerator exceptionGenerator = new TSDExceptionGenerator();
		
		if(token == null) {
			System.out.println("delete is failed");
			TSDImplementationExceptionType exception = (TSDImplementationExceptionType) exceptionGenerator.generateImplementationException();
			rs.setImplementationException(exception);
			
			return rs;
		}
		
		if(deleteDomain(domain, token)) {
			System.out.println("delete is done");
			TSDIndexMaintenanceRequestSuccessType indexMaintenanceRequestSuccess = new TSDIndexMaintenanceRequestSuccessType();
			Description200Type description = new Description200Type();
			description.setLanguageCode("en");
			description.setCodeListVersion("1.1");
			description.setValue("Success");
			indexMaintenanceRequestSuccess.setSuccess(description);
			rs.setIndexMaintenanceRequestSuccess(indexMaintenanceRequestSuccess);
			
			return rs;
		} else {
			System.out.println("delete is failed");
			TSDImplementationExceptionType exception = (TSDImplementationExceptionType) exceptionGenerator.generateImplementationException();
			rs.setImplementationException(exception);
			
			return rs;
		}

	}

	private String onsLogin() throws IOException {

		String url = onsServiceUrl + "oauth/token";

		HttpClient client = HttpClientBuilder.create().build();

		HttpPost postRequest = new HttpPost(url);

		String clientId = username.replace(".", "").replace("@","");
		byte[] message = (clientId + ":" + password).getBytes("UTF-8");
		String encoded = DatatypeConverter.printBase64Binary(message);

		String auth = "Basic " + encoded;

		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("grant_type", "password"));
		params.add(new BasicNameValuePair("username", username));
		params.add(new BasicNameValuePair("password", password));

		postRequest.setHeader("Authorization", auth);
		postRequest.setHeader("Content-type", "application/x-www-form-urlencoded");
		postRequest.setEntity(new UrlEncodedFormEntity(params));

		HttpResponse response = client.execute(postRequest);

		String entity = EntityUtils.toString(response.getEntity());

		try {
			JSONObject jobj = new JSONObject(entity);

			String token = jobj.getString("access_token");
			System.out.println("login is done");
			return token;
		} catch (JSONException e) {
			e.printStackTrace();
		}

		System.out.println("login is failed");

		return null;

	}
	
	private boolean deleteDomain(String domain, String token) throws UnsupportedEncodingException {
		
		boolean result = true;

		String queryUrl = onsServiceUrl + "company/" + username + "/server/" + onsServerIP + "/unOwnerOf";

		HttpClient client = HttpClientBuilder.create().build();

		HttpDel delRequest = new HttpDel(queryUrl);
		
		String auth = "Bearer " + token;

		String parameters = "\"domainname\":" + "\"" +  domain + "\"";

		delRequest.setHeader("Authorization", auth);
		delRequest.setHeader("Content-type", "application/json");
		delRequest.setEntity(new StringEntity("{ " + parameters + " }"));

		try {
			client.execute(delRequest);
		} catch (ClientProtocolException e) {
			result = false;
			e.printStackTrace();
		} catch (IOException e) {
			result = false;
			e.printStackTrace();
		}

		return result;
		
	}
	
	private boolean addDomain(String domain, String token) throws UnsupportedEncodingException {
		
		boolean result = true;

		String queryUrl = onsServiceUrl + "company/" + username + "/server/" + onsServerIP + "/map";

		HttpClient client = HttpClientBuilder.create().build();

		HttpPost postRequest = new HttpPost(queryUrl);

		String auth = "Bearer " + token;

		String parameters = "\"domainname\":" + "\"" +  domain + "\"";

		postRequest.setHeader("Authorization", auth);
		postRequest.setHeader("Content-type", "application/json");
		postRequest.setEntity(new StringEntity("{ " + parameters + " }"));

		try {
			client.execute(postRequest);
		} catch (ClientProtocolException e) {
			result = false;
			e.printStackTrace();
		} catch (IOException e) {
			result = false;
			e.printStackTrace();
		}

		return result;
		
	}
	
	private boolean addRecords(String domain, String token, String url) throws UnsupportedEncodingException {
		
		boolean result = true;

		String queryUrl = onsServiceUrl + "company/" + username + "/domain/" + domain + "/newRecords";

		HttpClient client = HttpClientBuilder.create().build();

		HttpPost postRequest = new HttpPost(queryUrl);

		String auth = "Bearer " + token;
		String rdata = "0 0 \\\"U\\\" \\\"http://www.ons.gs1.org/cmsp\\\" \\\"!^.*$!"
				+ url + "!\\\" .";
		
		String parameters = "\"records\":[{\"id\":\"-1\",\"name\":\"" +  domain + "\",\"type\":\"NAPTR\",\"ttl\":\"0\",\"content\":\"" + rdata + "\"},"
				+ "{\"id\":\"-1\",\"name\":\"" +  domain + "\",\"type\":\"A\",\"ttl\":\"0\",\"content\":\"" + onsServerIP + "\"}]";

		postRequest.setHeader("Authorization", auth);
		postRequest.setHeader("Content-type", "application/json");
		postRequest.setEntity(new StringEntity("{ " + parameters + " }"));

		try {
			client.execute(postRequest);
		} catch (ClientProtocolException e) {
			result = false;
			e.printStackTrace();
		} catch (IOException e) {
			result = false;
			e.printStackTrace();
		}

		return result;

	}

}