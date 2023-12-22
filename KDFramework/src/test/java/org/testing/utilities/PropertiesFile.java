package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//input parameters -- the file path
//purpose of the method --- to load the properties file
//output parameter ---will return the properties class object

public class PropertiesFile {
	
	public static Properties LoadProperties(String filePath) throws IOException {
		File f = new File(filePath); //create a connection with File using file path
		FileInputStream fi=new FileInputStream(f);
		Properties pr=new Properties();
		pr.load(fi);
		return pr;
		
	}
	
	

}
