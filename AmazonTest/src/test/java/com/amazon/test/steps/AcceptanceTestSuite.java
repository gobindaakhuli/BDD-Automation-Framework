package com.amazon.test.steps;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.amazon.test.reusable.Reusable;
import net.serenitybdd.jbehave.SerenityStories;

public class AcceptanceTestSuite extends SerenityStories {
	public static Logger APP_LOGS = LogManager.getLogger(AcceptanceTestSuite.class);
	public AcceptanceTestSuite() throws IOException {
		try {
			APP_LOGS.info("start to fetch properties file");
			Reusable.initProperties();
			APP_LOGS.info("Property files loads successfully");
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		//runSerenity().inASingleSession();
		//findStoriesCalled() to specify story
		
	}

}
