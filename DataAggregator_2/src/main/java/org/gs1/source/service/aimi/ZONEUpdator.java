package org.gs1.source.service.aimi;

import java.io.IOException;
import java.util.Properties;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.gs1.source.service.type.TSDIndexMaintenanceRequestType;
import org.gs1.source.service.type.TSDIndexMaintenanceResponseType;
import org.gs1.source.service.util.ZONEConvertor;

public class ZONEUpdator implements AggregatorIndexMaintenanceInterface {

	private static final String PROPERTY_PATH = "aggregator.properties";

	private String ons_ip;
	private String admin_username;
	private String admin_password;

	public ZONEUpdator() throws IOException {

		Properties prop = new Properties();
		prop.load(getClass().getClassLoader().getResourceAsStream(PROPERTY_PATH));
		ons_ip = prop.getProperty("ons_update_ip");
		admin_username = prop.getProperty("admin_username");
		admin_password = prop.getProperty("admin_password");
	}

	/**
	 * Add zone in ONS
	 * @param request
	 * @return
	 * @throws ClientProtocolException 
	 * @throws IOException
	 */
	public TSDIndexMaintenanceResponseType add(TSDIndexMaintenanceRequestType request) throws IOException {

		String url = ons_ip + "atomiadns.json/AddZone";
		String token = login();
		HttpClient client = HttpClientBuilder.create().build();

		HttpPost postRequest = new HttpPost(url);

		String zone_name = (new ZONEConvertor()).convert(request.getGtin());
		String parameters = "\"" + zone_name + "\", " + "0" + ", \"" + "ns." + zone_name + ".\", \"" + "root." + zone_name + ".\", "
				+ "10800, 3600, 604800, 86400" + ", " + "[\"" + "ns." + zone_name + ".\"]" + ", \"" + admin_username + "\"";

		postRequest.setHeader("X-Auth-Username", admin_username);
		postRequest.setHeader("X-Auth-Token", token);
		postRequest.setEntity(new StringEntity("[ " + parameters + " ]"));

		client.execute(postRequest);

		System.out.println("zone is added");

		RecordUpdator record = new RecordUpdator();
		record.add(request, token);

		return null;

	}

	public TSDIndexMaintenanceResponseType change(TSDIndexMaintenanceRequestType request){


		return null;

	}

	public TSDIndexMaintenanceResponseType correct(TSDIndexMaintenanceRequestType request){


		return null;

	}

	//Delete zone in ONS
	public TSDIndexMaintenanceResponseType delete(TSDIndexMaintenanceRequestType request) throws IOException{

		String url = ons_ip + "atomiadns.json/DeleteZone";

		String token = login();

		HttpClient client = HttpClientBuilder.create().build();

		HttpPost postRequest = new HttpPost(url);

		String parameters = "\"" + (new ZONEConvertor()).convert(request.getGtin()) + "\"";

		postRequest.setHeader("X-Auth-Username", admin_username);
		postRequest.setHeader("X-Auth-Token", token);
		postRequest.setEntity(new StringEntity("[ " + parameters + " ]"));

		client.execute(postRequest);

		System.out.println("zone is deleted");

		return null;

	}

	public String login() throws IOException {

		String url = ons_ip + "atomiadns.json/Noop";

		HttpClient client = HttpClientBuilder.create().build();

		HttpPost postRequest = new HttpPost(url);

		postRequest.setHeader("X-Auth-Username", admin_username);
		postRequest.setHeader("X-Auth-Password", admin_password);

		HttpResponse response = client.execute(postRequest);

		String token = response.getFirstHeader("X-Auth-Token").getValue();

		System.out.println("login is done");

		return token;

	}

}
