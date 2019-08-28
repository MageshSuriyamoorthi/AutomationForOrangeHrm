package com.Selenium.UtilityPackage; 
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.Properties;

public class Properyutil {

public String readPropertiesFile(String elements) throws FileNotFoundException {
Properties prop=new Properties();

FileInputStream input=new FileInputStream("D:\\new\\eclipse-workspace\\AutomationTesting\\src\\test\\resources\\locator\\locators.properties");
try {
prop.load(input);

}
catch(Exception e) {
e.printStackTrace();
}

String data =prop.getProperty(elements);
return data;

}

/*import java.io.FileInputStream; import
* java.io.FileNotFoundException; import java.io.FileOutputStream; import
* java.util.Properties;
* 
* import org.openqa.selenium.WebDriver; import
* org.openqa.selenium.chrome.ChromeDriver;
* 
* public class mostWanted { static Properties prop=new Properties(); static
* String browser; protected static WebDriver driver;
* 
* 
* public static void readPropFile() {
* 
* try { FileInputStream fis = new FileInputStream(
* "D:\\new\\eclipse-workspace\\AutomationTesting\\src\\test\\resources\\Configure\\Config.properties"
* ); prop.load(fis); prop.getProperty("browser");
* 
* } catch (Exception e) {
* 
* e.printStackTrace(); } }
* 
* 
* public static void writePropFile() { try { FileOutputStream fos=new
* FileOutputStream(
* "D:\\new\\eclipse-workspace\\AutomationTesting\\src\\test\\resources\\Configure\\Config.properties"
* );
* 
* } catch (FileNotFoundException e) { // TODO Auto-generated catch block
* e.printStackTrace(); } }
* 
* 
* public static void browser() { browser="chrome"; } public static void
* browserConfig() { driver=new ChromeDriver(); } }
*/



}

