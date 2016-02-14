package org.gs1.source.service.mongo;

import java.util.Properties;

import org.gs1.source.service.Test;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.MongoClient;

@Configuration
public class MongoConfiguration {
	
	private static final String PROPERTY_PATH = "aggregator.properties";
	
	public @Bean MongoTemplate mongoTemplate() throws Exception{
		
		Properties prop = new Properties();
		prop.load(Test.class.getClassLoader().getResourceAsStream(PROPERTY_PATH));
		String DBname = prop.getProperty("DBname");
		String DBaddr = prop.getProperty("DBaddr");
		String DBport = prop.getProperty("DBport");
		
		MongoTemplate mongoTemplate = new MongoTemplate(new MongoClient(DBaddr, Integer.parseInt(DBport)), DBname);
		return mongoTemplate;
		
	}
}
