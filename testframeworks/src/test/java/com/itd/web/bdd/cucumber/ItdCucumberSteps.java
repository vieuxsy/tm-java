package com.itd.web.bdd.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.*;

/**
 * steps matching those in scenarios in feature file
 */
public class ItdCucumberSteps {

	@Given("^user browses to (.*)$")
	public void givenUserBrowsesToUrl(String url) throws Throwable {
		// set browser path

		// change selenide browser from default to phantomjs

	}

}
