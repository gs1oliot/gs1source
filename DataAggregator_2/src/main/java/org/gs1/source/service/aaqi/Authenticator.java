package org.gs1.source.service.aaqi;

import org.gs1.source.service.util.MacEncode;
import org.gs1.source.service.util.MacUrlGenerator;

public class Authenticator {
	
	public static final int AUTHENTICATED = 0;
	public static final int NOT_AUTHENTICATED = 1;

	private String gtin;
	private String targetMarketValue;
	private String clientGln;
	private String dataVersion;
	private String mac;
	
	public Authenticator(String gtin, String targetMarketValue, String dataVersion, String clientGln, String mac) {
		
		this.gtin = gtin;
		this.targetMarketValue = targetMarketValue;
		this.clientGln = clientGln;
		this.dataVersion = dataVersion;
		this.mac = mac;
	}
	
	public int authenticate(MacEncode macEncode, String key) throws Exception {

		MacUrlGenerator macUrlGenerator = new MacUrlGenerator(gtin, targetMarketValue, dataVersion, clientGln);
		String mac_url = macUrlGenerator.getMacUrl();
		
		String mac_check = macEncode.encode(key, mac_url);

		if(mac.compareTo(mac_check) != 0) {
			return NOT_AUTHENTICATED;
		}

		return AUTHENTICATED;
	}

}
