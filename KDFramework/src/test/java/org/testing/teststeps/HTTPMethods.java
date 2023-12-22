package org.testing.teststeps;

import java.util.Properties;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HTTPMethods {
	Properties pr;
	
	public HTTPMethods(Properties pr) {
		this.pr=pr;
	}
	
	public void PostMethod(String jsonRequestBody, String uriKeyName) {
		String uriValue=pr.getProperty(uriKeyName);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(jsonRequestBody)
		.when()
		
		.post(uriValue);
		
		System.out.println("Status Code is" + res.getStatusCode());
		
	}

	
	//GetAll Request
	public void GetAllMethod(String uriKeyName) {
		String uriValue=pr.getProperty(uriKeyName);
		Response res=
		given()
		.contentType(ContentType.JSON)
		
		.when()
		
		.get(uriValue);
		
		System.out.println("Status Code is" + res.getStatusCode());
		
	}
}
