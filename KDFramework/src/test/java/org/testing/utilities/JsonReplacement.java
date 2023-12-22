package org.testing.utilities;

import java.util.regex.Pattern;

//input parameters --complete json, variable name,variable value
//purpose of this method ---to assign the variable value in the string
//output parameter ---after replacement it will give the updated string
public class JsonReplacement {
	
	public static String jsonVariableAssign(String requestBody, String variableName) {
		
	requestBody.replaceAll(Pattern.quote("{{"+variableName+"}}"),variableName);
	return requestBody;
	}

}
