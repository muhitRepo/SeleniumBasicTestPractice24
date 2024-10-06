package com.facebook_webElementCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.facebook_base.BaseTest1;

public class DropDown extends BaseTest1{
	
	/*How do you manage/ handle drop down in selenium? == By select method. Selenium has inbuilt method called Select
	==> Select select = new Select(nested WebElement); 
	Here:  Select(month); is nested WebElement is the variable. Import Select method. 
	Inside the Select method we are importing another method in it. 
	*/
	
	//@Test	
	public void selectByvisibleText() {
		WebElement newAccnt=driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")); // bringing to the Sign up page.
		newAccnt.click();
		
		WebElement month =driver.findElement(By.id("month"));
		month.click();
		
		Select select = new Select(month);   //Select(month); is nested WebElement
		
		select.getFirstSelectedOption(); //  by default what is selected. 
		System.out.println(select.getFirstSelectedOption());
		
		//select.selectByVisibleText("Mar");
		select.selectByVisibleText("Nov");
		
	}
	//@Test
	public void selectByVisibleIndex() {
		
		WebElement newAccnt=driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")); 
		newAccnt.click();
		
		WebElement day=driver.findElement(By.id("day"));
		day.click();
		Select select = new Select(day);   
		//select.selectByIndex(25); >> Index starts from zero. so 25 would be 26. 
		select.selectByIndex(0); //1st day of the month
		
		
	}
@Test
public void selectByValue() {
		
		WebElement newAccnt=driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")); 
		newAccnt.click();
		
		WebElement year=driver.findElement(By.id("year"));
		year.click();
		Select select = new Select(year);
		select.selectByValue("2019");
		
		
	}
	
}
