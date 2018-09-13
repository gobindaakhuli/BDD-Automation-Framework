package test.page;

import java.io.IOException;

import org.openqa.selenium.interactions.Pause;

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
		String singonlink=ReusableClass.p.getProperty("signOnLink");
		$(singonlink).click();
	}
	public void verifyLoginPage() {
		String msg=ReusableClass.p.getProperty("loginPage");
		String msgContains=$(msg).getText().trim();
		System.out.println("Text from Page is :"+msgContains);
		assert(msgContains.contains("Welcome back to Mercury Tours!"));
	}
	public void enterCredential(String username, String password) {
		System.out.println("User name : "+username+" Password : "+password);
		String uname=ReusableClass.p.getProperty("username");
		$(uname).type(username);
		
		String pass=ReusableClass.p.getProperty("password");
		$(pass).type(password);
	}
	public void clickonSubmit() {
		String submitBtn=ReusableClass.p.getProperty("submitbtn");
		$(submitBtn).click();
		
	}
	public void navigateToBillingPage() {
		String ContinueOne=ReusableClass.p.getProperty("ContinueOne");
		$(ContinueOne).click();
		String ContinueTwo=ReusableClass.p.getProperty("ContinueTwo");
		$(ContinueTwo).click();
		
	}
	public void enterUsrInfo() throws IOException {
		String firstname=ReusableClass.readExcel(System.getProperty("user.dir"), "TestData.xls", "Sheet1", "FirstName");
		System.out.println("First name from excel :"+firstname);
		String fname=ReusableClass.p.getProperty("FirstNameOnPD");
		$(fname).type(firstname);
		
		String lastname=ReusableClass.readExcel(System.getProperty("user.dir"), "TestData.xls", "Sheet1", "LastName");
		System.out.println("Last name from excel :"+lastname);
		String lname=ReusableClass.p.getProperty("LastNameOnPD");
		$(lname).type(lastname);
		
	}
	public void clickOnPurchaseBtn() {
		String purchase=ReusableClass.p.getProperty("SecurePurchase");
		$(purchase).click();
	}
	public void verifyBookingConfPage() {
		String msg=ReusableClass.p.getProperty("bookinConfirmationPage");
		String msgContains=$(msg).getText().trim();
		System.out.println("Text from Booking conf page :"+msgContains);
		assert(msgContains.contains("Your itinerary has been booked!"));
		
	}
}
