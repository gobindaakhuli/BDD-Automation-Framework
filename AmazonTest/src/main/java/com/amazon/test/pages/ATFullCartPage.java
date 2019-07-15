package com.amazon.test.pages;

import com.amazon.test.reusable.Reusable;

import net.serenitybdd.core.pages.PageObject;

public class ATFullCartPage extends PageObject {

	public void clickOnCartIcon() {
		String topNavCart = Reusable.OR_AT_FULLCART_PAGE.getProperty("topNavCart");
		$(topNavCart).click();
		
	}

	public void validateFullcartPage() {
		assert(getDriver().getTitle().equalsIgnoreCase("Amazon.com Shopping Cart"));	
	}

	public void removeFirstAddedProduct() {
		String deleteSecondproduct = Reusable.OR_AT_FULLCART_PAGE.getProperty("deleteSecondproduct");
		$(deleteSecondproduct).click();
		
	}

	public void reduceTheQty() {
		String qtyDropDown = Reusable.OR_AT_PLPPDP_PAGE.getProperty("qtyDropDown");
		$(qtyDropDown).click();
		String pdpqty1 = Reusable.OR_AT_PLPPDP_PAGE.getProperty("pdpqty2");
		Reusable.waitUntilelementIsClickable(pdpqty1, getDriver());
		$(pdpqty1).click();
	}

	public void clickOnProceedToCheckout() {
		String proceedToCheckout = Reusable.OR_AT_FULLCART_PAGE.getProperty("proceedToCheckout");
		$(proceedToCheckout).click();
	}

	public void fillShippingAddress() {
		String AddressLine1="",City="",State="",ZIP="",Phone="";
		try {
			AddressLine1=Reusable.readExcel("AddressLine1");
			City=Reusable.readExcel("City");
			State=Reusable.readExcel("State");
			ZIP=Reusable.readExcel("ZIP");
			Phone=Reusable.readExcel("Phone");
		}catch(Exception ex) {}
		
		$(Reusable.OR_AT_FULLCART_PAGE.getProperty("addressLine1")).type(AddressLine1);
		$(Reusable.OR_AT_FULLCART_PAGE.getProperty("city")).type(City);
		$(Reusable.OR_AT_FULLCART_PAGE.getProperty("state")).type(State);
		$(Reusable.OR_AT_FULLCART_PAGE.getProperty("zip")).type(ZIP);
		$(Reusable.OR_AT_FULLCART_PAGE.getProperty("phone")).sendKeys(Phone);
		
		String continue1 = Reusable.OR_AT_FULLCART_PAGE.getProperty("continue");
		$(continue1).click();
		
	}

	public void validateShippingPage() {
		assert(getDriver().getTitle().equalsIgnoreCase("Select Shipping Options - Amazon.com Checkout"));
	}

}
