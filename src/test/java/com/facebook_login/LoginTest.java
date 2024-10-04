package com.facebook_login;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.facebook_base.BaseTest;

public class LoginTest extends BaseTest {

	//@Test
	
	public void practiceLoginTest() {
		driver.findElement(By.id("email")).sendKeys("ey7fjsnfvkm@link.com");
		System.out.println("working");
	}
	
	@Test
	public void validLoginTest() {
		driver.findElement(By.id("email")).sendKeys("ey7fjsnfvkm@link.com");
		driver.findElement(By.name("pass")).sendKeys("fsjf");
		driver.findElement(By.name("login")).click();
		
		System.out.println("validLoginTest");
	}
	@Test
	public void invaidLoginTest() {
		driver.findElement(By.id("email")).sendKeys("ey7fjsnfvkm@link.com");
		driver.findElement(By.name("pass")).sendKeys("fsjf");
		driver.findElement(By.name("login")).click();
		
		System.out.println("InvalidTest");
	}
}
