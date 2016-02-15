package org.gs1.source.service.type;

public class ServerKeyType {

	protected String clientGln;
	protected String key;
	
	public String getClientGln(){
		
		return clientGln;
	}
	
	public void setClientGln(String clientGln){
		
		this.clientGln = clientGln;
	}
	
	public String getKey(){
		
		return key;
	}
	
	public void setKey(String key){
		
		this.key = key;
	}
}
