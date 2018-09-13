package site.testStep;

import java.io.IOException;

import org.jbehave.core.annotations.*;

import test.page.FirstTest;

public class TestStepFirst {
	FirstTest ft= new FirstTest();
	@Given("the user open browser")
	public void openBrowser() {
		System.out.println("hello on given test");
		ft.open();
	}
	@Then("the user maximize the browser")
	public void maximizeBrowser() throws InterruptedException {
		System.out.println("Maximize the browser");
		ft.maximizeBrowser();
	}
	@When("the user click on login")
	public void clickOnLogin() {
		System.out.println("Click on Login button on homepage");
		ft.clickonLogin();
	}
	@Then("the user should be navigate to login page")
	public void verifyLoginPage() {
		ft.verifyLoginPage();
	}
	@When("the user enter subscribe $username and <'password'>")
	public void enterSubscribeCredential(String username,String password) {
		ft.enterCredential(username, password);
	}
	@When("click on submit button")
	public void clickOnSubmit() {
		ft.clickonSubmit();
	}
	@Then("the user navigate to billing page")
	public void navigateToBillingPage() {
		ft.navigateToBillingPage();
	}
	@When("the user enter user information")
	public void enterUsrInfo() throws IOException {
		ft.enterUsrInfo();
	}
	@When("the user click on cesurePurchase button")
	public void clickOnPurchaseBtn() {
		ft.clickOnPurchaseBtn();
	}
	@Then("the user should be on booking confirmation page")
	public void verifyBookingConfPage() {
		ft.verifyBookingConfPage();
	}
}
