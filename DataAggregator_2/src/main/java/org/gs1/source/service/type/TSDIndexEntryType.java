package org.gs1.source.service.type;

import org.gs1.source.tsd.CountryCodeType;

public class TSDIndexEntryType {
	
	protected String gtin;
	protected CountryCodeType targetMarket;
	protected TSDServiceReferenceType dataAggregatorService;
	
	public String getGtin() {
		
		return gtin;
	}
	
	public void setGtin(String value) {
		
		this.gtin = value;
	}
	
	public CountryCodeType getTargetMarket() {
		
		return targetMarket;
	}
	
	public void setTargetMarket(CountryCodeType value) {
		
		this.targetMarket = value;
	}
	
	public TSDServiceReferenceType getDataAggregatorService() {
		
		return dataAggregatorService;
	}
	
	public void setDataAggregatorService(TSDServiceReferenceType value) {
		
		this.dataAggregatorService = value;
	}

}
