package com.easybix.RestAssuredCore;
import java.io.IOException;
import org.testng.annotations.Test;
import com.easybix.utils.PayLoadConverter;
import com.easybix.utils.URL;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class LoginTest {
	
	Response response;
	
	@Test
	public void doLogin() throws IOException {
		
		String loginPayLoad = PayLoadConverter.generateString("JiraLogin.json");
		
		String endPointURI = URL.getEndPoint("/rest/auth/1/session");
		response = RESTCalls.POSTRequest(endPointURI, loginPayLoad);
		String strResponse = response.getBody().asString(); // converting response to string
		System.out.println("**********Response JSON**************");
		System.out.println(strResponse);
		
		JsonPath jsonRes = new JsonPath(strResponse); // we are parsing to json 
		String sessionId = jsonRes.getString("session.value"); //getting 
	}
}
