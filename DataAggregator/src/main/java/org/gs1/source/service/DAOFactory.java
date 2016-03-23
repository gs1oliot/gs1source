package org.gs1.source.service;

import org.gs1.source.service.mongo.MongoDAO;

public class DAOFactory {

	/**
	 * Get Data Access Object according to the type
	 * @param type
	 * @return
	 */
	public DataAccessObject getDAO(String type) {

		DataAccessObject dataAccessObject = null;

		//get mongoDB DAO
		if(type.equals("mongo")) {
			dataAccessObject = new MongoDAO();
		}

		return dataAccessObject;
	}

}
