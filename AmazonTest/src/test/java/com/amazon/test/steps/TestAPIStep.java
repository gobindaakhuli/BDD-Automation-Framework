package com.amazon.test.steps;

import org.jbehave.core.annotations.*;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import com.amazon.test.pages.APITest;

public class TestAPIStep {
	APITest ap;// = new APITest();
	
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
	@Given("test the api with showing value")
	public void testTheApiForGet() {
		ap.testTheApiForGet();
	}
}
