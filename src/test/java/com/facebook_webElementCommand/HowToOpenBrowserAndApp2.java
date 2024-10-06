package com.facebook_webElementCommand;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class HowToOpenBrowserAndApp2 {

	WebDriver driver;
	
	public static void main(String[] args) {
		HowToOpenBrowserAndApp2 op = new HowToOpenBrowserAndApp2();  // Class c = new Class; op variable bring me the method 'openBroswer, and op bring me the method openApp
		
		op.openBrowser();
		op.openApp();
		op.getTitle();
		
	}

	public void openBrowser() {             // Open Browser method
		
		driver = new ChromeDriver();        // How to open browser
		//driver = new SafariDriver();
		
	}
	
	public void openApp() {                // Open the application method
		
		driver = new ChromeDriver();		// How to Open Browser & Application. These 2 lines of code
		driver.get("https://www.facebook.com/"); // How to open app
	}

	public void getTitle() {
		driver = new ChromeDriver();  // Open Chrome browser
		driver.get("https://www.facebook.com/");
		driver.getTitle();
	}
	
	
}
