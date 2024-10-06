package com.facebook_webElementCommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HowToOpenBrowserAndApp {

	WebDriver driver; // here, this driver is instance variable
	
	public static void main(String[] args) {
		//driver = new ChromeDriver(); // and this driver is in static method so it's not gonna work in static method
		
		HowToOpenBrowserAndApp op= new HowToOpenBrowserAndApp();
		op.openApp();
		op.closeApp();
		
	}
	
	public void openApp() {
		driver = new ChromeDriver(); // HOW to open the browser
		//driver = new SafariDriver();
		driver.get("https://www.facebook.com/"); // How to open application
	}
	
	//@Test
	public void getTitle() {
		System.out.println("FACEBOOK");
	}
	

	public void closeApp() {
		driver.quit();
		
	}
}
