package org.stepdef;

import org.base.Base;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass extends Base {

	@Before
	public void beforeExecution() {
		launch();
		maxWindow();
		System.out.println("Started Chrome Successfully");

	}
	
	
	@After
	public void afterExecutionGroup(Scenario s) {
		if (s.isFailed()) {
			TakesScreenshot ts=(TakesScreenshot) driver;
			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshotAs, "image/png");
			System.out.println(s.getName()+ "***ScenarioFailed***");
			
		}
		System.out.println("ScenarioEnds");
		driver.quit();

	}

	
}