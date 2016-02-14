package org.gs1.source.service.type;

import org.gs1.source.tsd.CountryCodeType;

public class TSDIndexMaintenanceRequestType {

	protected String gtin;
	protected CountryCodeType targetMarket;
	protected String aggregatorUrl;
	
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
	
	public String getAggregatorUrl(){
		return aggregatorUrl;
	}
	
	public void setAggregatorUrl(String value){
		this.aggregatorUrl = value;
	}
	
}
