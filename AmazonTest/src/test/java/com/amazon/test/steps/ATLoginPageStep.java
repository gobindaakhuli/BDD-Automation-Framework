package com.amazon.test.steps;
import org.jbehave.core.annotations.*;

import com.amazon.test.pages.ATLoginPage;
public class ATLoginPageStep {
	private ATLoginPage atloginpage;
	@Then("verify the user is on login page")
	public void verifyLoginPage() {
		atloginpage.verifyLoginPage();
	}
	@When("the user enter <SubscribedID> and <ValidPassword>")
	public void enterValidIDPassword(String SubscribedID,String ValidPassword) {
		atloginpage.enterIdAndPassword(SubscribedID,ValidPassword);
	}
	
	@When("click on sign in button")
	public void clickOnSignInButton() {
		atloginpage.clickOnSignInButton();
	}
	
	@Then("the user verify login properly")
	public void verifyLoginProperly() {
		atloginpage.verifyLoginProperly();
	}
	@When("the user click on logout link")
	public void clickOnLogOutLink() {
		atloginpage.clickOnLogOutLink();
	}
	@Then("the user verify logout properly")
	public void verifyLogoutProperly() {
		atloginpage.verifyLoginPage();
	}

}
