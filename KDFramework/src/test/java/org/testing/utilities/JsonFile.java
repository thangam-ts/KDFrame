package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

//input parameter ---json file path
//Purpose of this method -- to read the json file
//output parameter---String json data
public class JsonFile {
	
	public static String LoadJsonData(String filePath) throws FileNotFoundException {
		File f=new File(filePath);
		FileReader fr=new FileReader(f);
		JSONTokener js=new JSONTokener(fr);
		JSONObject j=new JSONObject(js);
		return j.toString();
		
	}

}
