package com.ffm.stepDefinitions;

import com.ffm.pages.OTMember_Login_POM;
import com.ffm.utils.TestBase;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FFM_OTMember_Login_Steps extends TestBase {
	OTMember_Login_POM loginPOM;
	
	@Given("I should be able to view the FFM login panel")
	public void i_should_be_able_to_view_the_ffm_login_panel() {
	    // Write code here that turns the phrase above into concrete actions
		loginPOM=new OTMember_Login_POM();
		loginPOM.verifyLoginHeader();
	   
	}
	
	/*Regular expressions
	 * 1. \"(.*)\"
	 * 2. \"([^\"]*)\"
	 * */

//	@When("I should be able to give valid email and password")
//	public void i_should_be_able_to_give_valid_email_and_password(String email, String password) {
//	    // Write code here that turns the phrase above into concrete actions
//		loginPOM.loginOTmember(email,password);
//	    
//	}
	
	@When("I should be able to give valid {string} and {string}")
	public void i_should_be_able_to_give_valid_and(String email, String password) {
	    // Write code here that turns the phrase above into concrete actions
		loginPOM.loginOTmember(email,password);
	}

	@And("I should be able to click on the login button")
	public void i_should_be_able_to_click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		loginPOM.clickLoginBtn();
	    
	}

	@Then("I should be able to view the FFM platform")
	public void i_should_be_able_to_view_the_ffm_platform() {
	    // Write code here that turns the phrase above into concrete actions
		loginPOM.verifyFFMPlatform();
	    
	}
}
