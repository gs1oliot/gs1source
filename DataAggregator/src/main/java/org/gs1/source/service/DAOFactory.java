package org.gs1.source.service;

import org.gs1.source.service.mongo.MongoDAO;

public class DAOFactory {

	public DataAccessObject getDAO(String type) {

		DataAccessObject dataAccessObject = null;

		if(type.equals("mongo")) {
			dataAccessObject = new MongoDAO();
		}

		return dataAccessObject;
	}

}
