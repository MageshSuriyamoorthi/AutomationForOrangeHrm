package com.Selenium.UtilityPackage;


	import java.util.Scanner;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

	@Test
	public class Browser {
	public void BrowserTest() {

	WebDriver driver;
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the browser");
	String browser = scan.nextLine();
	switch (browser) {

	case "":
	driver = new ChromeDriver();
	driver.get("http://google.com");
	System.out.println(driver.getTitle());

	case "firefox":
	driver = new FirefoxDriver();
	driver.get("http://firefox.com");
	System.out.println(driver.getTitle());

	case "ie":
		System.setProperty("webdriver.ie.driver",
				"D:\\new\\eclipse-workspace\\AutomationTesting\\lib\\IEDriverServer.exe");
	driver = new InternetExplorerDriver();
	driver.get("http://www.msn.com");
	System.out.println(driver.getTitle());
	
	case "edge":
		System.setProperty("webdriver.edge.driver",
				"D:\\new\\eclipse-workspace\\AutomationTesting\\lib\\MicrosoftWebDriver.exe");
	driver = new EdgeDriver();
	driver.get("http://www.google.com");
	System.out.println(driver.getTitle());
	
	}
	}
	}


