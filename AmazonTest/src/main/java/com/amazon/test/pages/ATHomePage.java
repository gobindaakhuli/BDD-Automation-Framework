package com.amazon.test.pages;

import org.openqa.selenium.WebDriver;

import com.amazon.test.reusable.Reusable;

import net.thucydides.core.pages.PageObject;

public class ATHomePage extends PageObject {
	
	/***
	 * maximizeBrowser() method will help to maximize the browser 
	 * 
	 */
	public void maximizeBrowser() {
		getDriver().manage().window().maximize();
	}

	public void clickOnLoginLink() {
		String loginLink=Reusable.OR_AT_HOME_PAGE.getProperty("HomePageLoginLink");
		System.out.println("Login xpath is :"+ loginLink);
		$(loginLink).click();	
	}

}
