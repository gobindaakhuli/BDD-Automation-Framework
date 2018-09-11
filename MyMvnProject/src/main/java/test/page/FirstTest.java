package test.page;

import net.serenitybdd.core.pages.PageObject;
import reusable.ReusableClass;

public class FirstTest extends PageObject {

	public void openBrowser() {
		System.out.println("I am on page file");
	}
	public void maximizeBrowser() {
		System.out.println("Maximize the browser");
		System.out.println("Text from property file :"+ ReusableClass.p.getProperty("Name"));
		getDriver().manage().window().maximize();
	}
	public void clickonLogin() {
		System.out.println("Click on sign in");
		$("(//*[@class='nav-line-1'])[3]").click();
	}
}
