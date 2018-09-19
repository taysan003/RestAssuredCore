package com.easybix.utils;

import org.apache.log4j.Logger;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class TestUtils {
	final static Logger log = Logger.getLogger(PayLoadConverter.class);
	
	public static String getResponseString(Response response) {
		log.info("Converting Response to String");
		String strResponse = response.getBody().asString(); // converting response to string
		log.debug(strResponse);
		return strResponse; 
	}
	
	public static JsonPath jsonParser(String response) { // persing String to JSON
		log.info("Parsing Response String to JSON");
		JsonPath jsonResponse = new JsonPath(response);
		log.debug(jsonResponse);
		return jsonResponse;
	}
	
	public static XmlPath xmlParser(String response) { // persing String to XML
		log.info("Parsing Response String to XML");
		XmlPath xmlResponse = new XmlPath(response);
		log.debug(xmlResponse);
		return xmlResponse;
	}
	
	public static int getStatusCode(Response response) {
		int statusCode = response.getStatusCode();
		log.debug(statusCode);
		return statusCode;
	}
	
	public static String getStatusMassege(Response response) {
		String statusMessege = response.getStatusLine();
		log.debug(statusMessege);
		return statusMessege;
	}
}
