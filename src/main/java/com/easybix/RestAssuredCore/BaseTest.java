package com.easybix.RestAssuredCore;

import org.apache.log4j.Logger;

import com.easybix.utils.PayLoadGenerator;
import com.easybix.utils.TestUtils;
import com.easybix.utils.URL;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class BaseTest { // contain functions which are used in most of all test cases
		
	final static Logger log = Logger.getLogger(BaseTest.class);
	
	public static String doLogin() { // This function is need for getting the session id
		Response response;
		log.info("Startig Test Case : doLogin");
		String loginPayLoad = PayLoadGenerator.generateString("JiraLogin.json");
		log.info(loginPayLoad);
		String endPointURI = URL.getEndPoint("/rest/auth/1/session");
		response = RESTCalls.POSTRequest(endPointURI, loginPayLoad);
		log.info(response.getBody().asString());
		String strResponse = TestUtils.getResponseString(response); // converting response to string
		
		JsonPath jsonRes = TestUtils.jsonParser(strResponse); // we are parsing to json 
		String sessionId = jsonRes.getString("session.value"); //getting 
		log.info("Jira JSession ID : " + sessionId);
		return sessionId;
	}
}
