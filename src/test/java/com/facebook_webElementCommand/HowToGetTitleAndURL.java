package com.facebook_webElementCommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HowToGetTitleAndURL {
	
	WebDriver driver;
	
	
	public static void main(String[] args) {
		HowToGetTitleAndURL gtu = new HowToGetTitleAndURL();
		gtu.openApp();
		gtu.getFbTtile();
		gtu.getAssertTitle();
		gtu.getFbUrl();
		gtu.closeApp();
		
	}

	public void openApp() {
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	public void getFbTtile() {
		String fbTitle =driver.getTitle();
		System.out.println(fbTitle);
	}
	
	public void getAssertTitle() {
		String expectedTitle =driver.getTitle();
		String actualTitle = "Facebook - log in or sign up";
		
	System.out.println("FB title is >>" + expectedTitle);
    Assert.assertEquals(actualTitle, expectedTitle, "* * didn't match  * *");
		
	}
	
	public void getFbUrl() {
		//String facebookCurrentUrl =driver.getCurrentUrl();
		//System.out.println(facebookCurrentUrl);
		
		String expectedUrl =driver.getCurrentUrl();
		String actulUrl = "https://www.facebook.co";
		System.out.println(expectedUrl + ">>verifiying fb url<<");
		
		Assert.assertEquals(actulUrl, expectedUrl, " ** wrong Url **");
		
		
	}
	
	public void closeApp() {
		driver.quit();
	}
}
