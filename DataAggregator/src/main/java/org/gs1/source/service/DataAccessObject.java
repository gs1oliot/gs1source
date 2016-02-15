package org.gs1.source.service;

import org.gs1.source.tsd.CountryCodeType;
import org.gs1.source.tsd.TSDQueryByGTINResponseType;

public abstract class DataAccessObject {
	
	protected DataCache cache;
	protected String key;
	
	public DataAccessObject() {
		cache = DataCache.getInstance();
	}

	public TSDQueryByGTINResponseType queryCache(String gtin, String targetMarketValue) {
		
		key = gtin + targetMarketValue;
		TSDQueryByGTINResponseType rs = cache.find(key);
		
		return rs;
	}
	
	public void insertCache(TSDQueryByGTINResponseType rs) {
		
		cache.put(key, rs);
	}
	
	public abstract TSDQueryByGTINResponseType queryDB(String gtin, CountryCodeType targetMarket);
	public abstract TSDQueryByGTINResponseType queryDB(String gtin);
	
	public abstract void insertDB(TSDQueryByGTINResponseType rs);
	
}
