package com.amazon.test.pages;

import com.amazon.test.reusable.Reusable;

import net.serenitybdd.core.pages.PageObject;

public class ATPlpPdpPage extends PageObject {

	public void clickOnSubMenue(String subMenue) {
		Reusable.mouseHoverUsingAction(getDriver(), Reusable.OR_AT_PLPPDP_PAGE.getProperty("Department"));
		String menue = Reusable.OR_AT_PLPPDP_PAGE.getProperty("menueFromDept");
		menue=menue+"[contains(text(),'"+subMenue+"')]";
		$(menue).click();
	}

	public void clickOnItem(String item) {
		String menue = Reusable.OR_AT_PLPPDP_PAGE.getProperty("itemsOnElectronicPage");
		menue=menue+"[contains(text(),'"+item+"')]";
		$(menue).click();
	}

	public void selectFirctProduct() {
		String forstProduct = Reusable.OR_AT_PLPPDP_PAGE.getProperty("firstProductOnHeadphone");
		$(forstProduct).click();
	}
	public void clickOnAddToCartBtn() {
		String addToCartBtn = Reusable.OR_AT_PLPPDP_PAGE.getProperty("addToCartBtn");
		$(addToCartBtn).click();
	}
	public void clickOnQty2() {
		String qtyDropDown = Reusable.OR_AT_PLPPDP_PAGE.getProperty("qtyDropDown");
		$(qtyDropDown).click();
		String pdpqty2 = Reusable.OR_AT_PLPPDP_PAGE.getProperty("pdpqty2");
		Reusable.waitUntilelementIsClickable(pdpqty2, getDriver());
		$(pdpqty2).click();
	}

	public void verifyProductAddedTocart() {
		String successMsgAddToCart = Reusable.OR_AT_PLPPDP_PAGE.getProperty("successMsgAddToCart");
		assert($(successMsgAddToCart).isVisible());	
	}

	public void searchForTheProduct() {
		String product="";
		try {
			product=Reusable.readExcel("product1"); //read from excel data
		}catch(Exception ex) {}

		//String product="Macbook pro";
		String searchBox = Reusable.OR_AT_PLPPDP_PAGE.getProperty("searchBox");
		$(searchBox).sendKeys(product);
		String searchBtnIcon = Reusable.OR_AT_PLPPDP_PAGE.getProperty("searchBtnIcon");
		$(searchBtnIcon).click();
	}

	public void clickOnSecondProduct() {
		String secondProductOnSearchList = Reusable.OR_AT_PLPPDP_PAGE.getProperty("secondProductOnSearchList");
		$(secondProductOnSearchList).click();

	}

}
