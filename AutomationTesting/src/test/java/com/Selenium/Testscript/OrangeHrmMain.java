package com.Selenium.Testscript;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Selenium.Java.ReadingXlsxFile;
import com.Selenium.UtilityPackage.Properyutil;
import com.Selenium.UtilityPackage.UrlUtil;
import com.Selenium.UtilityPackage.mostWanted;

public class OrangeHrmMain extends mostWanted  {
	UrlUtil url = new UrlUtil();
	Properyutil prop = new Properyutil();

	public class Orangehrm extends ReadingXlsxFile{
		ReadingXlsxFile xlxs=new ReadingXlsxFile();
		
		@Test(priority = 0)
		public void urltest() throws FileNotFoundException {
			driver.get(url.readPropFile("locators.url"));
		}

		@Test(priority = 1)
		public void contactSales() throws FileNotFoundException {
			driver.findElement(By.xpath(prop.readPropertiesFile("locators.button.contactSales"))).click();
		}

		@Test(priority = 2)
		public void textArea() throws IOException {
			String val[];
			val=xlxs.xlxsReturn();
			
			driver.findElement(By.name(prop.readPropertiesFile("locators.textarea.firstname"))).sendKeys(val[0]);

			driver.findElement(By.name(prop.readPropertiesFile("locators.textarea.lastname"))).sendKeys(val[1]);

			driver.findElement(By.name(prop.readPropertiesFile("locators.textarea.companyname")))
					.sendKeys(val[2]);

			driver.findElement(By.name(prop.readPropertiesFile("locators.textarea.numemployees"))).sendKeys(val[3]);

			driver.findElement(By.name(prop.readPropertiesFile("locators.textarea.phone"))).sendKeys(val[4]);

			driver.findElement(By.name(prop.readPropertiesFile("locators.textarea.jobtitle")))
					.sendKeys(val[5]);

			driver.findElement(By.name(prop.readPropertiesFile("locators.textarea.email"))).sendKeys(val[6]);

			driver.findElement(By.name(prop.readPropertiesFile("locators.textarea.country"))).sendKeys(val[7]);
			try {
				Thread.sleep(50000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.close();

		}
	}
}