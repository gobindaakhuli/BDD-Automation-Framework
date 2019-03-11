package site.testStep;

import org.jbehave.core.annotations.*;

import test.page.APITest;

public class TestAPIStep {
	APITest ap = new APITest();
	
	@Given("the user create a place")
	public void testAPI() {
		ap.createPlaceAPI();
	}
	@When("the the fetch the place")
	public void fetchThePlace() {
		//ap.checkPlaceFirstApi();
	}
	@Then("the user delete the place")
	public void deleteThePlace() {
		ap.deleteplace();
	}
}
