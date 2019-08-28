package com.Selenium.Testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Selenium.UtilityPackage.mostWanted;

public class MavenNewAutomation extends mostWanted {

	@Test(priority = 0)
	void chromeOpen() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		System.out.println("Chrome driver connected and opened");
		Thread.sleep(3000);
	}

	@Test(priority = 1)
	void MavenOpen() throws InterruptedException {

		driver.get("https://mvnrepository.com/");
		driver.manage().window().maximize();
		System.out.println("Maven Repository link opened and maxmized");
		Thread.sleep(3000);
	}

	@Test(priority = 2)
	void openingPolymer() {
		driver.findElement(By.xpath("//a[text()='Polymer']")).click();
		System.out.println("Polymer link opened");
	}

	@Test(priority = 3)
	void openingJcenter() {
		driver.findElement(By.xpath("//div[@id='snippets'] //ul[@class='tabs']//li//a[contains(text(),'JCenter')]"))
				.click();
		System.out.println("J center link opened");
	}

	@Test(priority = 4)
	void openingMCentral() {
		driver.findElement(By.xpath("//div[@id='snippets'] //ul[@class='tabs']//li//a[contains(text(),'Central')]"))
				.click();
		System.out.println("Central link opened");
	}

	@Test(priority = 5)
	void openingSubLink1() {
		driver.findElement(By.xpath("//a[text()='2.8.0']")).click();
		System.out.println("sub link-1 opened");

	}

	@Test(priority = 6)
	void openingSubLink2() {
		driver.findElement(By.xpath("//a[text()='Maven']")).click();
		System.out.println("sub link-2 opened");
	}

	@Test(priority = 7)
	void openingSubLink3() {
		driver.findElement(By.xpath("//a[text()='Gradle']")).click();
		System.out.println("sub link-3 opened");
	}

	@Test(priority = 8)
	void openingSubLink4() {
		driver.findElement(By.xpath("//a[text()='SBT']")).click();
		System.out.println("sub link-4 opened");
	}

	@Test(priority = 9)
	void openingSubLink5() {
		driver.findElement(By.xpath("//a[text()='Ivy']")).click();
		System.out.println("sub link-5 opened");
	}

	@Test(priority = 10)
	void openingSubLink6() {
		driver.findElement(By.xpath("//a[text()='Grape']")).click();
		System.out.println("sub link-6 opened");
	}

	@Test(priority = 11)
	void openingSubLink7() {
		driver.findElement(By.xpath("//a[text()='Leiningen']")).click();
		System.out.println("sub link-7 opened");
	}

	@Test(priority = 12)
	void openingSubLink8() {
		driver.findElement(By.xpath("//a[text()='Buildr']")).click();
		System.out.println("sub link-8 opened");
	}

	@Test(priority = 13)
	void clickingCheckBox() {
		driver.findElement(By.id("includelink")).click();
		System.out.println("Check-Box clicked");
	}

	@Test(priority = 14)
	void typingOnSearchBox() {
		driver.findElement(By.name("q")).sendKeys("selenium for java");
		System.out.println("'Selenium for java' were typed in search box");

	}

	@Test(priority = 15)
	void clickingSearch() {
		driver.findElement(By.xpath("//input[@class='button']")).click();
		System.out.println("Search button has been clicked");
	}

	@Test(priority = 16)
	void clickingByPopular() {
		driver.findElement(By.xpath("//a[text()='popular']")).click();
		System.out.println("sort by popular is clicked");
	}

	@Test(priority = 17)
	void clickingByNewest() {
		driver.findElement(By.xpath("//a[text()='newest']")).click();
		System.out.println("sort by Newest is clicked");
	}

	@Test(priority = 18)

	void clickingByRelevance() {
		driver.findElement(By.xpath("//a[text()='relevance']")).click();
		System.out.println("sort by relevance is clicked");
	}

	@Test(priority = 19)

	void clickingTheSeleniumJava() {
		driver.findElement(By.xpath("//a[text()='Selenium Java']")).click();
		System.out.println("sort by relevance is clicked");
	}

}
