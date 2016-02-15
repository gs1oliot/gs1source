package org.gs1.source.service.type;

public class ClientKeyType {

	protected String serviceUrl;
	protected String key;
	
	public String getServiceUrl(){
		
		return serviceUrl;
	}
	
	public void setServiceUrl(String serviceUrl){
		
		this.serviceUrl = serviceUrl;
	}
	
	public String getKey(){
		
		return key;
	}
	
	public void setKey(String key){
		
		this.key = key;
	}
}
