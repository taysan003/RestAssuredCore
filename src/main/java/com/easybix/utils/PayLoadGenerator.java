package com.easybix.utils;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.apache.log4j.Logger;



public class PayLoadGenerator {
	
	final static Logger log = Logger.getLogger(PayLoadGenerator.class);
	
public static String generateString(String filename) {
		log.info("Inside PayLoadConverter function");
		String filePath = System.getProperty("user.dir")+"\\resources\\"+filename; // place where resorces are located
		try {
			return new String (Files.readAllBytes(Paths.get(filePath)));
		} catch (Exception e) {
			log.error(e);
			return null;
		}
		
	}
/*public static String generateString(String filePath) throws IOException {
	
	return new String (Files.readAllBytes(Paths.get(filePath)));
	
}*/

}
