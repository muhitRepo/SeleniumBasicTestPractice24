package com.facebook_base;

import org.testng.annotations.Test;

public class IfAndElseCondition {
	
	@Test
	public void verifyIf() {		// If need condition
		
		int age = 18;
		
		if(age <= 16) {				// if it meets the condition then the curser will come here. if it doesn't meet the condion it will go to else. And 
									// print the else condition
		System.out.println("you can vote");     
		
		} else {
			System.out.println("I can't vote");
		}
		
		
	}
}
