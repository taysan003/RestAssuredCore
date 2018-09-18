package com.easybix.utils;

public class URL {
	
	public static final String URL ="http://localhost:8087"; // should be assecceable from anywhere
	
	public static String getEndPoint() {
		return URL;
	}
	
	public static String getEndPoint(String resource) { // whe we need URL + resources
		return URL + resource;
	}
}
