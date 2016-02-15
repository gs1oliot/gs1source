package org.gs1.source.service.util;

public class MacUrlGenerator {
	
	private String mac_url;
	
	public MacUrlGenerator(String gtin, String targetMarketValue, String dataVersion, String clientGln) {
		
		this.mac_url = "v1/ProductData/gtin/" + gtin + "?targetMarket=" + targetMarketValue
				+ "&dataVersion=" + dataVersion + "&clientGln=" + clientGln;
	}

	public String getMacUrl() {
		
		return mac_url;
	}
}
