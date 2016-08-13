package org.gs1.source.service.aimi;

import org.apache.http.client.methods.HttpPost;

public class HttpDel extends HttpPost {
	
	public HttpDel(String url){
        super(url);
    }
    @Override
    public String getMethod() {
        return "DELETE";
    }

}
