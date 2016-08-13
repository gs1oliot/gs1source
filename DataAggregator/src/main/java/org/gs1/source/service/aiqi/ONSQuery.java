package org.gs1.source.service.aiqi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.gs1.source.service.util.DomainConvertor;
import org.xbill.DNS.Lookup;
import org.xbill.DNS.Record;
import org.xbill.DNS.SimpleResolver;
import org.xbill.DNS.Type;

public class ONSQuery {
	
	private static final String PROPERTY_PATH = "aggregator.properties";
	
	/**
	 * Query to ONS
	 * @param gtin
	 * @return
	 * @throws IOException 
	 */
	public List<String> query(String gtin) throws IOException{
		
		Properties prop = new Properties();
		prop.load(getClass().getClassLoader().getResourceAsStream(PROPERTY_PATH));
		String ons_ip = prop.getProperty("ons_query_ip");
		
		String domain = (new DomainConvertor()).convert(gtin);
		List<String> res = new ArrayList<String>();
		Record[] result = null;
		
		try {
			Lookup lookup = new Lookup(domain, Type.NAPTR);
			//KAIST IP address
			lookup.setResolver(new SimpleResolver(ons_ip));
			lookup.setCache(null);
			result = lookup.run();
			int code = lookup.getResult();
			if (code == Lookup.SUCCESSFUL) {
				for(Record r : result){
					res.add(r.rdataToString());
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}

}
