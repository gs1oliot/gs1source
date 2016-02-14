package org.gs1.source.service.aaqi;

import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.Properties;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;

import org.gs1.source.service.Test;

public class TLSConnection {

	private static final String PROPERTY_PATH = "aggregator.properties";
	
	/**
	 * Connect client to server using TLS method
	 * @return
	 * @throws Exception
	 */
	public SSLContext clientConnection() throws Exception {
		
		Properties prop = new Properties();
		prop.load(Test.class.getClassLoader().getResourceAsStream(PROPERTY_PATH));
		String keystore = prop.getProperty("keystore");
		String password = prop.getProperty("password");

		KeyStore keyStore = KeyStore.getInstance("JKS");
		keyStore.load(new FileInputStream(keystore), password.toCharArray());

		KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
		kmf.init(keyStore, password.toCharArray());
		
		TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");
		tmf.init(keyStore);
		
		SSLContext sslContext = SSLContext.getInstance("TLS");
		sslContext.init(kmf.getKeyManagers(), tmf.getTrustManagers(), new SecureRandom());

		return sslContext;
	}
	
}
