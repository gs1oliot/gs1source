package org.gs1.source.service.type;

import org.gs1.source.tsd.CountryCodeType;

public class TSDQueryByGTINRequestType {

	protected String gtin;
	protected CountryCodeType targetMarket;
	protected String dataVersion;

	public String getGtin(){
		return gtin;	
	}

	public void setGtin(String value){
		this.gtin = value;
	}
	
	public CountryCodeType getTargetMarket(){
		return targetMarket;
	}

	public void setTargetMarket(CountryCodeType value){
		this.targetMarket = value;
	}
	
	public String getDataVersion(){
		return dataVersion;
	}
	
	public void setDataVersion(String value){
		this.dataVersion = value;
	}
}
