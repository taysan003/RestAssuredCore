package com.easybix.issue;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.easybix.RestAssuredCore.BaseAssertion;
import com.easybix.RestAssuredCore.BaseTest;
import com.easybix.RestAssuredCore.RESTCalls;
import com.easybix.utils.PayLoadGenerator;
import com.easybix.utils.URL;

import io.restassured.response.Response;


public class CreateIssue {
	
	final static Logger log = Logger.getLogger(CreateIssue.class);
	private String sessionId;
	Response response;
	
	@BeforeMethod // will execute before every method in this particular class
	public void setUp() {
		sessionId = BaseTest.doLogin(); // create Log In what  return session ID
	}
	
	@Test
	public void createIssue() {
		log.info("Starting Create Issue Test");
		String URI = URL.getEndPoint("/rest/api/2/issue/");
		String createIssuePayLoad = PayLoadGenerator.generateString("CreateBug.json");
		response = RESTCalls.POSTRequest(URI, createIssuePayLoad, sessionId);
		BaseAssertion.verifyStatusCode(response, 201);
	}
}
