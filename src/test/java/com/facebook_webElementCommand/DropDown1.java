package com.facebook_webElementCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.facebook_base.BaseTest1;

public class DropDown1 extends BaseTest1{

	@Test
	public void signUpMethod() {
		WebElement newAccnt=driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")); // bringing to the Sign up page.
		newAccnt.click();
		
		WebElement fn=driver.findElement(By.xpath("//input[starts-with(@id,'u_0_8_')]"));
		fn.sendKeys("firstname");
		
		WebElement ln=driver.findElement(By.xpath("//*[starts-with(@id,'u_0_a_')]"));
		ln.sendKeys("lastname");
		
		WebElement month=driver.findElement(By.id("month"));
		Select select = new Select(month);
		select.getFirstSelectedOption();
		System.out.println(select.getFirstSelectedOption()+ " selected month by default");
		select.selectByVisibleText("Nov");
		
		WebElement day=driver.findElement(By.id("day"));
		Select daySelect = new Select(day);
		
		daySelect.getFirstSelectedOption();
		System.out.println(daySelect.getFirstSelectedOption());
		daySelect.selectByIndex(22);
		
		WebElement year=driver.findElement(By.id("year"));
		Select yearSelect= new Select(year);
		yearSelect.selectByValue("1990");
		
		WebElement male=driver.findElement(By.xpath("//input[@name='sex' and @value='2']"));
		male.click();
		boolean gender=male.isSelected();
		//System.out.println(gender + " user is male");
		if(gender) {
			System.out.println("user is male");
			
		}else {
			System.out.println("user is female");
		}
		
		
		
		WebElement mobileNum=driver.findElement(By.xpath("//input[starts-with(@id,'u_0_h_')]"));
		mobileNum.sendKeys("8873");
		boolean numOrEmail=mobileNum.isSelected();
		
		if(numOrEmail) {
			System.out.println("mobile");
		}else {
			System.out.println("email");
		}
		
		
		WebElement newPasswd=driver.findElement(By.xpath("//input[@id='password_step_input']"));
		newPasswd.sendKeys("efjjlIeji");
		
		WebElement sigupButton=driver.findElement(By.xpath("//button[@name='websubmit']"));
		sigupButton.click();  //sigupButton.submit();// submit() ; does not work
		
	}
	
	
}
