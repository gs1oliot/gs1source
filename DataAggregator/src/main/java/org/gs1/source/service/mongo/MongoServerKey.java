package org.gs1.source.service.mongo;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import org.gs1.source.service.type.ServerKeyType;
import org.springframework.data.mongodb.core.MongoOperations;

public class MongoServerKey {
	
	private MongoOperations mongoOps;
	
	public MongoServerKey() {
		
		MongoInstance mongo = MongoInstance.getInstance();
		mongoOps = mongo.getMongoOps();
		
	}
	
	public void insertKey(String clientGln, String key){

		ServerKeyType map = new ServerKeyType();
		map.setClientGln(clientGln);
		map.setKey(key);

		mongoOps.insert(map, "serverKeys");

	}
	
	public String queryKey(String clientGln){

		ServerKeyType map = mongoOps.findOne(query(where("clientGln").is(clientGln)), ServerKeyType.class, "serverKeys");

		return map.getKey();
	}

}
