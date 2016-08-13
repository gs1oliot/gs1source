package org.gs1.source.service.aaqi;

import java.net.URL;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;

public class HttpsConnection {
	
	public static HttpsURLConnection connect(String url) throws Exception {

		URL obj = new URL(url);
		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

		con.setHostnameVerifier(new HostnameVerifier() {
			public boolean verify(String arg0, SSLSession arg1) {

				return true;
			}
		});

		//Set TLS connection
		TLSConnection tls = new TLSConnection();
		SSLContext sslContext = tls.clientConnection();

		con.setSSLSocketFactory(sslContext.getSocketFactory());
		con.setRequestMethod("GET");
		con.connect();
		
		return con;
	}

}
