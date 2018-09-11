package site.testStep;

import org.jbehave.core.annotations.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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

}
