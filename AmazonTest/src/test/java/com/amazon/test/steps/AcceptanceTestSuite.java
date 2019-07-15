package com.amazon.test.steps;

import java.io.IOException;

import com.amazon.test.reusable.Reusable;

import net.serenitybdd.jbehave.SerenityStories;

public class AcceptanceTestSuite extends SerenityStories {
	public AcceptanceTestSuite() throws IOException {
		//runSerenity().inASingleSession();
		//findStoriesCalled() to specify story
		Reusable.initProperties();
	}

}
