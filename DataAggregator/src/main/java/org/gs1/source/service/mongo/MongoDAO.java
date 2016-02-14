package org.gs1.source.service.mongo;

import static org.springframework.data.mongodb.core.query.Criteria.where;

import org.gs1.source.service.DataAccessObject;
import org.gs1.source.tsd.CountryCodeType;
import org.gs1.source.tsd.TSDQueryByGTINResponseType;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;

public class MongoDAO extends DataAccessObject {

	private MongoOperations mongoOps;

	public MongoDAO() {

		MongoInstance mongo = MongoInstance.getInstance();
		mongoOps = mongo.getMongoOps();
	}

	public TSDQueryByGTINResponseType queryDB(String gtin, CountryCodeType targetMarket) {

		//Query Setting
		Query query = new Query();
		query.addCriteria(where("productData.gtin").is(gtin));
		query.addCriteria(where("productData.targetMarket").is(targetMarket));

		//Data Query
		TSDQueryByGTINResponseType response = mongoOps.findOne(query, TSDQueryByGTINResponseType.class, "productData");

		return response;
	}

	public TSDQueryByGTINResponseType queryDB(String gtin) {

		//Query Setting
		Query query = new Query();
		query.addCriteria(where("productData.gtin").is(gtin));

		//Data Query
		TSDQueryByGTINResponseType rs = mongoOps.findOne(query, TSDQueryByGTINResponseType.class, "productData");

		return rs;

	}

	public void insertDB(TSDQueryByGTINResponseType rs) {

		mongoOps.insert(rs, "productData");
	}

}
