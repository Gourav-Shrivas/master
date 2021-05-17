package com.qa.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;



public class RestClient {

	public void get(String url) throws JSONException {
		CloseableHttpClient httpclient=HttpClients.createDefault();
		HttpGet httpget=new HttpGet(url);
		try {
			CloseableHttpResponse closeableHttpResponse=httpclient.execute(httpget); //hit the get url
			int StatusCode=closeableHttpResponse.getStatusLine().getStatusCode();
			System.out.println("status code is: "+StatusCode);
			String responsestring=EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
			JSONObject responsejson=new JSONObject(responsestring);
			System.out.println("Response json from API: "+responsejson);
		Header[] headerarray=closeableHttpResponse.getAllHeaders();
		HashMap<String, String> allheaders=new HashMap<String, String>();
		for(Header header: headerarray) {
			allheaders.put(header.getName(), header.getValue());
		}
		System.out.println("Headers aray---->"+allheaders);
			
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
