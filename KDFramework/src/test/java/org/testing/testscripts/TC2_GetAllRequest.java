package org.testing.testscripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.PropertiesFile;

public class TC2_GetAllRequest {
	
	@Test
	public void tc2() throws IOException {
	
	Properties pr= PropertiesFile.LoadProperties("../KDFramework/src/test/java/Uri.properties");
	HTTPMethods http1=new HTTPMethods(pr);
	http1.GetAllMethod("QA2_URI");
}
}
