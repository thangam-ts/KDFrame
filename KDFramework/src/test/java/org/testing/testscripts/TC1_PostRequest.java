package org.testing.testscripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.JsonFile;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesFile;
import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public class TC1_PostRequest {
	
	@Test
	public void tc1() throws IOException {
//1. POST REQUEST
//		Properties pr= PropertiesFile.LoadProperties("../KDFramework/src/test/java/Uri.properties");
//		String requestBody=JsonFile.LoadJsonData("../KDFramework/src/test/java/org/testing/resources/inputRequest.json");
//		HTTPMethods http=new HTTPMethods(pr);
//		http.PostMethod(requestBody, "QA1_URI");
		
		
//2. using dynamic variables thro' utility ->jsonVariableAssign
		System.out.println("Please enter the value of id");
		Scanner input= new Scanner(System.in);
		Integer idvalue=input.nextInt();
		
		Properties pr= PropertiesFile.LoadProperties("../KDFramework/src/test/java/Uri.properties");
		String requestBody=JsonFile.LoadJsonData("../KDFramework/src/test/java/org/testing/resources/inputRequest.json");
		requestBody=JsonReplacement.jsonVariableAssign(requestBody, idvalue.toString());
		System.out.println("Response Body is : " + requestBody);
		HTTPMethods http=new HTTPMethods(pr);
		http.PostMethod(requestBody, "QA1_URI");
		//returnidValue=JsonParsingUsingJsonPath.json
	}

	
	
	
}
