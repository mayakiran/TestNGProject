package com.training.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	FileInputStream fileinput;
	
	public String getpropertiesfile(String key) {
	String filepath="C:\\automationtestNG\\workspacetestNG\\TestNGMainProject\\properties\\propertyfiles";
		try {
			fileinput=new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop=new Properties();
		try {
			prop.load(fileinput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value=prop.getProperty(key);
		return value;
	}
       
}
