package org.gs1.source.service.mongo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

public class MongoInstance {
	
	private static MongoInstance instance;
	
	private ConfigurableApplicationContext ctx;
	private MongoOperations mongoOps;
	
	private MongoInstance() {
		
		ctx = new AnnotationConfigApplicationContext(MongoConfiguration.class);
		mongoOps = (MongoOperations) ctx.getBean("mongoTemplate");
	}
	
	public static MongoInstance getInstance() {
		if(instance == null) {
			instance = new MongoInstance();
		}
		
		return instance;
	}
	
	public MongoOperations getMongoOps() {
		
		return mongoOps;
	}
	
	public void close() {
		
		ctx.close();
		instance = null;
	}

}
