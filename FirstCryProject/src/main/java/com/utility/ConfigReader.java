package com.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static Properties getPropertyObject() throws IOException {
		
		FileInputStream fp = new FileInputStream("./TestData\\config.properties");
		Properties p = new Properties();
		p.load(fp);
		return p;
	}
	
	public static String getUrl() throws IOException {
		return getPropertyObject().getProperty("baseURL");
	}
	
	public static String getMobileNum() throws IOException {
		return getPropertyObject().getProperty("MobileNum");
	}
	
	public static String getSearchItem() throws IOException {
		return getPropertyObject().getProperty("searchItem");
	}
}
