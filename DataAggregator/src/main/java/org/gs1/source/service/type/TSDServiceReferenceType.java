package org.gs1.source.service.type;

public class TSDServiceReferenceType {
	
	protected String baseUrl;
	
	public TSDServiceReferenceType(String value) {
		
		this.baseUrl = value;
	}
	
	public String getBaseUrl() {
		
		return baseUrl;
	}
	
	public void setBaseUrl(String value) {
		
		this.baseUrl = value;
	}

}
