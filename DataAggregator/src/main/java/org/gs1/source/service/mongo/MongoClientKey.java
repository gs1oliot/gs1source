package org.gs1.source.service.mongo;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import org.gs1.source.service.type.ClientKeyType;
import org.springframework.data.mongodb.core.MongoOperations;

public class MongoClientKey {
	
	private MongoOperations mongoOps;
	
	public MongoClientKey() {
		
		MongoInstance mongo = MongoInstance.getInstance();
		mongoOps = mongo.getMongoOps();
	}
	
	public void insertKey(String serviceUrl, String key){

		ClientKeyType map = new ClientKeyType();
		map.setServiceUrl(serviceUrl);
		map.setKey(key);

		mongoOps.insert(map, "clientKeys");

	}

	public String queryKey(String serviceUrl){

		ClientKeyType map = mongoOps.findOne(query(where("serviceUrl").is(serviceUrl)), ClientKeyType.class, "clientKeys");

		return map.getKey();
	}
	
}
