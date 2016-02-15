package org.gs1.source.service.aaqi;

import org.gs1.source.service.DAOFactory;
import org.gs1.source.service.type.TSDQueryByGTINRequestType;
import org.gs1.source.tsd.CountryCodeType;

public class QueryReceiver {
	
	private String gtin;
	private String targetMarketValue;
	private String dataVersion;
	private String clientGln;
	private String mac;
	
	public QueryReceiver(String gtin, String targetMarketValue, String dataVersion, String clientGln, String mac) {
		
		this.gtin = gtin;
		this.targetMarketValue = targetMarketValue;
		this.dataVersion = dataVersion;
		this.clientGln = clientGln;
		this.mac = mac;
	}
	
	public QueryProcessor getProcessor() throws Exception {
		
		CountryCodeType targetMarket = new CountryCodeType();
		targetMarket.setCodeListVersion("1.1");
		targetMarket.setValue(targetMarketValue);
		
		TSDQueryByGTINRequestType request = new TSDQueryByGTINRequestType();
		request.setGtin(gtin);
		request.setTargetMarket(targetMarket);
		request.setDataVersion(dataVersion);
		
		DAOFactory factory = new DAOFactory();
		QueryProcessor processor = new QueryProcessor(factory, "mongo", request);
		processor.setClientGln(clientGln);
		
		return processor;
	}
	
	public Authenticator getAuthenticator() {
		
		Authenticator authenticator = new Authenticator(gtin, targetMarketValue, dataVersion, clientGln, mac);
		
		return authenticator;
	}

}
