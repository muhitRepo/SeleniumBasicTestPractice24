package com.facebook_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MaximizeScreen {

	WebDriver driver;

	@BeforeTest

	public void openApp() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@Test(priority = 0)
	public void getFbTitle() {
		String expectedTitle = driver.getTitle();
		String actualTitle = "Facebook - log in or sign up";
		System.out.println(expectedTitle + "<< This is FB Title");

		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 1)
	public void getFbUrl() {

		String expectedUrl = driver.getCurrentUrl();
		String actualUrl = "https://www.facebook.com/";
		System.out.println(expectedUrl + " ** This is FB Url");

		Assert.assertEquals(actualUrl, expectedUrl);

	}

	@AfterTest
	public void closeApp() {
		driver.quit();
	}

}
