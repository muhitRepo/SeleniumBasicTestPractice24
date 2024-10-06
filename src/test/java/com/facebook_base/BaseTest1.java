package com.facebook_base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest1 {
	public WebDriver driver;

	public String browser = "chrome";

	@BeforeTest
	public void openApp() {
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			
		}else if (browser.equalsIgnoreCase("Safari")) {
			driver= new SafariDriver();
			
		}else if (browser.equalsIgnoreCase("Firefox")) {
			driver= new FirefoxDriver();
			
		}else {
			driver = new ChromeDriver();
			System.out.println("wrong browser");
		}

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	//@AfterMethod
	public void closeApp() {
		if(driver!=null) {
			driver.quit();
			
		}
	}

}
