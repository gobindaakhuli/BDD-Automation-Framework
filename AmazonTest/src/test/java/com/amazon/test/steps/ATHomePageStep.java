package com.amazon.test.steps;

import org.jbehave.core.annotations.*;

import com.amazon.test.pages.ATHomePage;

public class ATHomePageStep {
	private ATHomePage athomepage;
	@Given("the user is on amazon home page")
	public void userIsOnHomePage() {
		athomepage.open();
		athomepage.maximizeBrowser();
	}
	
	@When("the user click on login link")
	public void clickOnLoginLink() {
		athomepage.clickOnLoginLink();
	}

} 
