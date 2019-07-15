package com.amazon.test.pages;

import com.amazon.test.reusable.Reusable;

import net.thucydides.core.pages.PageObject;

public class ATLoginPage  extends PageObject {

	public void verifyLoginPage() {
		String titleText="Amazon Sign In";
		System.out.println("Title is: "+ getDriver().getTitle());
		assert(getDriver().getTitle().equalsIgnoreCase(titleText));
	}

	public void enterIdAndPassword(String subscribedID, String validPassword) {
		String mailId=Reusable.OR_AT_LOGIN_PAGE.getProperty("EmailIdBox");
		String password=Reusable.OR_AT_LOGIN_PAGE.getProperty("PasswordBox");
		$(mailId).type(subscribedID);
		$(password).type(validPassword);
		
	}

	public void clickOnSignInButton() {
		String signInButton=Reusable.OR_AT_LOGIN_PAGE.getProperty("SignInButton");
		$(signInButton).click();
		
	}

	public void verifyLoginProperly() {
		String signin = Reusable.OR_AT_HOME_PAGE.getProperty("HomePageLoginLink");
		Reusable.mouseHoverUsingAction(getDriver(), signin);
		
		String signOut=Reusable.OR_AT_LOGIN_PAGE.getProperty("SignOutText");
		assert($(signOut).isVisible());
		
	}

	public void clickOnLogOutLink() {
		String signin = Reusable.OR_AT_HOME_PAGE.getProperty("HomePageLoginLink");
		Reusable.mouseHoverUsingAction(getDriver(), signin);
		
		String signOut=Reusable.OR_AT_LOGIN_PAGE.getProperty("SignOutLink");
		$(signOut).click();
		
	}

}
