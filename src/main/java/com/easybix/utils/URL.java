package com.easybix.utils;
import org.apache.log4j.Logger;

public class URL {
	final static Logger log = Logger.getLogger(URL.class);
	public static final String URL ="http://localhost:8087"; // should be assecceable from anywhere
	
	public static String getEndPoint() {
		log.info("Base URI : " +URL);
		return URL;
	}
	
	public static String getEndPoint(String resource) { // whe we need URL + resources
		log.info("URI End point : " + URL + resource);
		return URL + resource;
	}
}
