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
	public static final String BROWSER_PATH = "A:/Portables/phantomjs-2.1.1-windows/bin/phantomjs.exe";
	public static final String BROWSER_PROP_NAME = "phantomjs.binary.path";

//	static {
//		System.setProperty(BROWSER_PROP_NAME, BROWSER_PATH);
//		System.setProperty("selenide.browser", "phantomjs");
//	}

//	@Given("^user browses to (.*)$")
//	public void givenUserBrowsesToUrl(String url) throws Throwable {
//		System.setProperty(BROWSER_PROP_NAME, BROWSER_PATH);
//		System.setProperty("selenide.browser", "phantomjs");
//		open(url);
//	}
//
//	@When("^user enters (.*) in input with name (.*)$")
//	public void whenUserEntersKeyWordInInputWithNameSearch(String keyWord, String searchInputName) {
//		$(By.name(searchInputName)).setValue(keyWord);
//	}
//
//	@When("^user clicks button with name (.*)$")
//	public void whenUserClicksButtonWithName(String searchButtonName) {
//		$(By.name(searchButtonName)).click();
//	}
//
//	@Then("^website title starts with (.*)$")
//	public void thenWebsiteTitleStartsWithITDesigners(String keyWord) {
//		assertThat(title(), startsWith(keyWord));
//	}

}
