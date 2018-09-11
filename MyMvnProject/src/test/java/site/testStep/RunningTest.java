package site.testStep;

import net.serenitybdd.jbehave.SerenityStories;
import reusable.ReusableClass;
public class RunningTest extends SerenityStories {
	public RunningTest() {
		try {
			ReusableClass.initProperties();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
