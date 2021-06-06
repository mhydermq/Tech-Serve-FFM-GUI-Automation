package com.ffm.stepDefinitions;

import com.ffm.utils.TestBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksSteps extends TestBase {
	
	//Global Hooks
	@Before
	public void setup() {
		initializeDriver();
		
	}
	
//	@Before("@AfterLogin")
//	public void loginFFMOTMember() {
//		
//	}
	
	@After
	public void tearDown() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
	}

}
