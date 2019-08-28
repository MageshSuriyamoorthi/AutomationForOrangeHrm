package com.Selenium.UtilityPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class UrlUtil {
	public String readPropFile(String elements) throws FileNotFoundException {
		Properties prop=new Properties();

		FileInputStream input=new FileInputStream("D:\\new\\eclipse-workspace\\AutomationTesting\\src\\test\\resources\\Configure\\Config.properties");
		try {
		prop.load(input);

		}
		catch(Exception e) {
		e.printStackTrace();
		}

		String data =prop.getProperty(elements);
		return data;

		}

}
