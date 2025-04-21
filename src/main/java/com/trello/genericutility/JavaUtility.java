package com.trello.genericutility;

import java.io.FileInputStream;
import java.util.Properties;

public class JavaUtility {

	public String readDataFromPropertyFile(String key) throws Throwable {

		Properties properties = new Properties();

		properties.load(new FileInputStream("src/main/resources/trellodata.properties"));

		String value = properties.getProperty(key);

		return value;
	}

}
