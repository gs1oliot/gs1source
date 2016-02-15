package org.gs1.source.service.aimi;

import java.io.IOException;
import java.util.Properties;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.gs1.source.service.Test;
import org.gs1.source.service.type.TSDIndexMaintenanceRequestType;
import org.gs1.source.service.util.ZONEConvert;

public class RecordUpdator {
	
	private static final String PROPERTY_PATH = "aggregator.properties";

	public void add(TSDIndexMaintenanceRequestType request, String token) throws ClientProtocolException, IOException {

		Properties prop = new Properties();
		prop.load(Test.class.getClassLoader().getResourceAsStream(PROPERTY_PATH));
		String ons_ip = prop.getProperty("ons_update_ip");
		
		String url = ons_ip + "atomiadns.json/AddDnsRecords";

		HttpClient client = HttpClientBuilder.create().build();

		HttpPost postRequest = new HttpPost(url);

		
		String admin_username = prop.getProperty("admin_username");
		String zone_name = (new ZONEConvert()).convert(request.getGtin());
		//NAPTR record
		String rdata_1 = "0 0 \\\"U\\\" \\\"http://www.ons.gs1.org/tsd/servicetype-aaqi\\\" \\\"!^.*$!"
				+ request.getAggregatorUrl() + "!\\\" .";
		//Server IP address
		String rdata_2 = "52.69.212.96";
		String parameters = "\"" + zone_name + "\", [ { \"" + "ttl" + "\" : \"" + "0" + "\", \"" + "label" + "\" : \"" + "@" + "\", \""
				+ "class" + "\" : \"" + "IN" + "\", \"" + "type" + "\" : \"" + "NAPTR" + "\", \"" + "rdata"	+ "\" : \"" + rdata_1
				+ "\" }, { \"" + "ttl" + "\" : \"" + "0" + "\", \"" + "label" + "\" : \"" + "ns" + "\", \"" + "class" + "\" : \"" + "IN"
				+ "\", \"" + "type" + "\" : \"" + "A" + "\", \"" + "rdata"	+ "\" : \"" + rdata_2 + "\" } ]";

		postRequest.setHeader("X-Auth-Username", admin_username);
		postRequest.setHeader("X-Auth-Token", token);
		postRequest.setEntity(new StringEntity("[ " + parameters + " ]"));

		client.execute(postRequest);

		System.out.println("record is added");

	}

}
