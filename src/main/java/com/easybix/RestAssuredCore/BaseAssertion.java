package com.easybix.RestAssuredCore;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.easybix.utils.TestUtils;

import io.restassured.response.Response;


public class BaseAssertion {
	
	final static Logger log = Logger.getLogger(RESTCalls.class);
	
	public static void verifyTrue(boolean flag) {
		
		Assert.assertTrue(flag); // if true return true 
	}
	
	public static void verifyFalse(boolean flag) {
			
			Assert.assertFalse(flag); // if false return true 
	}
	
	public static void verifyStatusCode(Response response, int status) {
		
		Assert.assertEquals(TestUtils.getStatusCode(response), status); // Equals status of response what we are getting and compare what we want to
	}
	
	public static void verifyStatusMesssge(Response response, String status) {
		
		Assert.assertEquals(TestUtils.getStatusCode(response), status); // Equals status of response what we are getting and compare what we want to
	}
}
