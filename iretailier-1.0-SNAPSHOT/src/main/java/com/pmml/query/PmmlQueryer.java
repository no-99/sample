package com.pmml.query;

import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class PmmlQueryer {
	public static void main(String[] args) throws Exception {
		HttpGet get = new HttpGet("http://localhost:9080/openscoring-webapp-1.2.0/model/DecisionTreeIris");
		
		CloseableHttpClient client = HttpClients.createDefault();
		HttpResponse response = client.execute(get);
		StatusLine statusLine = response.getStatusLine();
		int statusCode = statusLine.getStatusCode();
		System.out.println(statusCode);
		String string = EntityUtils.toString(response.getEntity());
		System.out.println(string);
	}
}
