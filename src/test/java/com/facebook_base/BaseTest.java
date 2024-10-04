package com.facebook_base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {

	public WebDriver driver;

	public String browser = "kfjvsk"; /*
										 * instance method; like int age= 18; 
										   if(age==18) {
										       System.out.println("i am adult"); 
										  } else if(age >17) {
										 		System.out.println("i am Teen"); }
										 */

	@BeforeMethod
	public void openApp() {

		if (browser.equalsIgnoreCase("chrome")) { // if the browser equal ignore case is chrome, then go inside this
													// block and open Chrome b)
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("safari")) { // if the browser equal ignore case is safari, then go inside
															// this block and open safari browser)
			driver = new SafariDriver();

		} else if (browser.equalsIgnoreCase("FireFox")) { // equalsIgnoreCase used for String datatype; means ignore
															// upper or lower case- CHrome etc.
			driver = new FirefoxDriver();
		} else {
			System.out.println("<<** wrong browser>> **"); // this is default msg if the browser is misspelled or null
															// or sth.
			driver = new ChromeDriver();

		}

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	} // ** WITHOUT a @Test annotation application will not run. It has to have {OpepApp, Test, CloseApp}

	@AfterMethod
	public void closeApp() {
		if (driver != null) { // where driver is not null, then driver quit.
			driver.quit();
		}
	}

}
