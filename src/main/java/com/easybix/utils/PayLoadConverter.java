package com.easybix.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PayLoadConverter {
	
public static String generateString(String filename) throws IOException {
		String filePath = System.getProperty("user.dir")+"\\resources\\"+filename; // place where resorces are located
		return new String (Files.readAllBytes(Paths.get(filePath)));
		
	}
}
