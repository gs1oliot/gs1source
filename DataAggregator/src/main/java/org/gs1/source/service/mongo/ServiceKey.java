package org.gs1.source.service.mongo;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import org.gs1.source.service.type.ServiceKeyType;
import org.springframework.data.mongodb.core.MongoOperations;

public class ServiceKey {
	
private MongoOperations mongoOps;
	
	public ServiceKey() {
		
		MongoInstance mongo = MongoInstance.getInstance();
		mongoOps = mongo.getMongoOps();
		
	}
	
	public void insertKey(String key){

		ServiceKeyType map = new ServiceKeyType();
		map.setKey(key);

		mongoOps.insert(map, "serviceKeys");

	}
	
	public boolean queryKey(String key){

		ServiceKeyType map = mongoOps.findOne(query(where("key").is(key)), ServiceKeyType.class, "serviceKeys");

		if(map == null) {
			return false;
		}
		return true;
	}

}
