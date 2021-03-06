package com.itd.web.bdd.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * CucumberRunner: parse features, run ItdCucumberSteps and generate reports
 */
@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"stories"}, // Features path
	glue = {"com.itd.web.bdd.cucumber"}, // Steps package
	format = {"pretty", "html:target/cucumber"} // Reports output path
	)
public class CucumberRunner {
}
