package com.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTest {
	
	WebDriver driver; // Hey WebDriver get the driver. This is instance variable
	
	
	@Test
	
	public void LoginTest() {
		
		System.out.println("This is the Test site");
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
}
