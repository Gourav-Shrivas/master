package com.qa.test;


import java.io.IOException;

import org.json.JSONException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;

public class GetAPITest extends TestBase {
	
	

	public GetAPITest() throws IOException {
		super();
		
	}

	TestBase testbase;
	RestClient restclient;
	String url;
	String apiurl;
	String serviceurl;
	
	
	@BeforeMethod
	public void setup() throws IOException {
		testbase=new TestBase();
	    serviceurl=prop.getProperty("URL");
		apiurl=prop.getProperty("serviceURL");
	    url=serviceurl+apiurl;
		
		
	}
	
	@Test()
	public void getAPITest() throws JSONException {
		restclient=new RestClient();
		restclient.get(url);
	}
	
}
