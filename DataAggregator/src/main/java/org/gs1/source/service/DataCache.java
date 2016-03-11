package org.gs1.source.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.gs1.source.tsd.TSDQueryByGTINResponseType;

public class DataCache {

	private static DataCache instance;

	public static final int CACHE_SIZE = 5;

	private HashMap<String, TSDQueryByGTINResponseType> keyMap;
	private ArrayList<TSDQueryByGTINResponseType> cacheList;
	private int cacheSize = CACHE_SIZE;

	private DataCache() {
		keyMap = new HashMap<String, TSDQueryByGTINResponseType>();
		cacheList = new ArrayList<TSDQueryByGTINResponseType>(cacheSize);
	}

	public static DataCache getInstance() {
		if(instance == null) {
			instance = new DataCache();
		}

		return instance;
	}

	public TSDQueryByGTINResponseType find(String key) {

		TSDQueryByGTINResponseType rs = (TSDQueryByGTINResponseType) keyMap.get(key);

		if(rs != null) {
			cacheList.remove(rs);
			cacheList.add(0, rs);
		}

		return rs;
	}

	public void put(String key, TSDQueryByGTINResponseType rs) {

		if(cacheSize == cacheList.size()) {
			TSDQueryByGTINResponseType last_rs = (TSDQueryByGTINResponseType) cacheList.remove(cacheSize-1);
			keyMap.remove(last_rs.getProductData().getGtin() + last_rs.getProductData().getTargetMarket().getValue());
		}

		keyMap.put(key, rs);
		cacheList.add(0, rs);
	}

}
