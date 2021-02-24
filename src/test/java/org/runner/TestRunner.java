package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reports.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources", glue="org.stepdef", plugin="json:src\\test\\resources\\Reports\\fb.json")

public class TestRunner {
	
	@AfterClass
	public static void reportGeneration() {
		
		JVMReport.generateJVMReport(System.getProperty("user.dir")+ "\\src\\test\\resources\\Reports\\fb.json");
		

	}
	

}