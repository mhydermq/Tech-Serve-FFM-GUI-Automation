package com.ffm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ffm.utils.TestBase;

public class OTMember_Login_POM extends TestBase{
	
	//Email field
	@FindBy(id="login")
	WebElement emailFieldElement;
	
	//Password field
	@FindBy(id="password")
	WebElement passwordFieldElement;
	
	//Login button
	@FindBy(xpath="//*[@id=\"formContent\"]/form/input[3]")
	WebElement loginButtonElement;
	
	//Login panel header
	@FindBy(xpath="//*[@id=\"formContent\"]/div/h3")
	WebElement loginHeaderElement;
	
	
	//FFM platform element
	@FindBy(xpath="//*[@id=\"kt_content\"]/div/div[1]/h2")
	WebElement verifyFFMPlatformElement;
	
	//Initialize the web elements
	public OTMember_Login_POM() {
		PageFactory.initElements(driver, this);
	}
	
	//Verify the login panel header
	public void verifyLoginHeader() {
		loginButtonElement.isDisplayed();
	}
	
	//Verify the ffm platform element
	public void verifyFFMPlatform() {
		verifyFFMPlatformElement.isDisplayed();
	}
	
	
	//Give email and password
	public void loginOTmember(String email, String password) {
		emailFieldElement.sendKeys(email);
		passwordFieldElement.sendKeys(password);
	}
	
	//Click on the login button
	public void clickLoginBtn() {
		loginButtonElement.click();
	}
	

}
