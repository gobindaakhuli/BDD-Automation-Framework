package com.amazon.test.steps;

import org.jbehave.core.annotations.*;

import com.amazon.test.pages.ATFullCartPage;

public class ATFullCartPageStep {
	private ATFullCartPage atfullcartpage;
	@When("the user click on cart icon on top nav")
	public void clickOnCartIcon() {
		atfullcartpage.clickOnCartIcon();
	}
	@Then("the user should navigate to full cart page")
	public void validateFullcartPage() {
		atfullcartpage.validateFullcartPage();
	}
	@Then("the user remove the first added product")
	public void removeFirstAddedProduct() {
		atfullcartpage.removeFirstAddedProduct();
	}
	@Then("reduce the quantity to one for the first product")
	public void reduceTheQty() {
		atfullcartpage.reduceTheQty();
	}
	@When("the user click on proceed to checkout button on full cart page")
	public void clickOnProceedToCheckout() {
		atfullcartpage.clickOnProceedToCheckout();
	}
	@When("the user fill the billing address and click on continue")
	public void fillShippingAddress() {
		atfullcartpage.fillShippingAddress();
	}
	@Then("the user navigate to shipping page")
	public void validateShippingPage() {
		atfullcartpage.validateShippingPage();
	}

}
