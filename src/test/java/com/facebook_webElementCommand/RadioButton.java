package com.facebook_webElementCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.facebook_base.BaseTest;
import com.facebook_base.BaseTest1;

public class RadioButton extends BaseTest1{

	@Test
	public void createNewAccntMethod() {
		WebElement newAccnt=driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
		newAccnt.click();
	}
	//@Test
	
	public void firstNameInput() {
		//driver.findElement(By.name("firstname")).sendKeys("fhszjhn@likmail.com"); didn't find it by normal css formula
		//driver.findElement(By.xpath("//*[@name='firstname']")); didn't work standard xpath formula
		
		WebElement fn=driver.findElement(By.xpath("//input[starts-with(@id, 'u_0_8_')]"));
		fn.sendKeys("firstName");
	}
	//@Test
	public void lastNameInput() {
		 
		WebElement ln =driver.findElement(By.xpath("//input[starts-with(@id,'u_0_a_')]"));
		ln.sendKeys("lastname");
		
		//WebElement lastName =driver.findElement(By.xpath("//*[@name='lastname']")); didn't work with normal xpath.
		//lastName.sendKeys("fjhjdsf");
		
	}
	@Test

	/*
	 * what is radio button: only 1 option is clickable. 
	 * For Checkbox multiple options is clickable
	 * How do we select radio button or check box ? == (.click)
	 * Radio button most of the time boolean condion (True or False)
	 */
	
	public void radioButtonTest() {
		WebElement female=driver.findElement(By.id("sex"));
		female.click();
		boolean gender=female.isSelected(); // is it female selected or not? == true or false
		System.out.println(gender);
		
		//System.out.println(female.isSelected() + " yeah it female sex selected");
		
		if(gender) {
			System.out.println("user is female");
		}else  {
			System.out.println("user is male");
		}
	}
	
	
}
