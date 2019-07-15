package com.amazon.test.steps;

import org.jbehave.core.annotations.*;

import com.amazon.test.pages.ATPlpPdpPage;

public class ATPlpPdpPageStep {
	private ATPlpPdpPage atplppdppage;
	@When("the user search for $subMenue from departments")
	public void clickOnSubMenue(String subMenue) {
		atplppdppage.clickOnSubMenue(subMenue);
	}
	@Then("the user click on $item from the page")
	public void clickOnItem(String item) {
		atplppdppage.clickOnItem(item);
	}
	@When("the user select first available product and click on add to cart")
	public void selectFirctProduct() {
		atplppdppage.selectFirctProduct();
		atplppdppage.clickOnAddToCartBtn();
	}
	@Then("the user verify product successfully added to cart")
	public void verifyProductAddedTocart() {
		atplppdppage.verifyProductAddedTocart();
	}
	@When("the user search for the product from search bar")
	public void searchForTheProduct() {
		atplppdppage.searchForTheProduct();
	}
	@Then("the user click on second product from the search list")
	public void clickOnSecondProduct() {
		atplppdppage.clickOnSecondProduct();
	}
	@When("the user select quantity two and click on add to cart")
	public void selectQty2AndClickOnAddToCart() {
		atplppdppage.clickOnQty2();
		atplppdppage.clickOnAddToCartBtn();
	}
}
