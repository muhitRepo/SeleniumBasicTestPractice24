package com.facebook_webElementCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.facebook_base.BaseTest;

public class WebElementCommand extends BaseTest {

	// @Test
	public void inputBox() {

		// How many ways can you manage input box/ send button?

		driver.findElement(By.id("email")).sendKeys("fks@likemail.com");
		driver.findElement(By.id("email")).clear();
	}

	// @Test
	public void inputBoxWithVariables() {

		WebElement userName = driver.findElement(By.id("email"));
		userName.clear();
		userName.sendKeys("jfnjs@likemail.com");

	}

	// @Test
	public void button() {
		// How many ways can you click login button?

		WebElement loginButton = driver.findElement(By.name("login"));
		// loginButton.click();
		// loginButton.submit();
		loginButton.sendKeys((Keys.ENTER));
	}

	public void linkButton() {
		// driver.findElement(By.linkText("Forgot password?")).click(); OR
		WebElement linkText = driver.findElement(By.linkText("Forgot password?"));
		linkText.click();
	}

	@Test
	public void partiallinkButton() {
		WebElement contact = driver.findElement(By.partialLinkText("Contact"));
		contact.click();
	}


}
