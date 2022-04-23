package org.testRun;

import org.base.ReportGeneration;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"src\\test\\resources\\BookingAdactin.feature" }, glue = "org.hotelStepRef", monochrome = true, plugin = {
				"pretty", "json:D:\\eclipse-workspace\\CucuberBassclass\\Reports\\new.json",
				"junit:C:\\eclipse-workspace\\CucuberBassclass\\Reports\\new.xml" })

public class TestRunner {

	@AfterClass
	public static void afterClass() {
		ReportGeneration.reportGenerte("D:\\eclipse-workspace\\CucuberBassclass\\Reports\\new.json");

	}

}
