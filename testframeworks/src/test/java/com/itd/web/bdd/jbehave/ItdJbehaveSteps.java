package com.itd.web.bdd.jbehave;

import org.jbehave.core.annotations.BeforeStory;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.*;

/**
 * steps matching those in scenarios in story file
 */
public class ItdJbehaveSteps {
	public static final String BROWSER_PATH = "A:/Portables/phantomjs-2.1.1-windows/bin/phantomjs.exe";
	public static final String BROWSER_PROP_NAME = "phantomjs.binary.path";

	@BeforeStory
	public void beforeStory() {
		System.setProperty(BROWSER_PROP_NAME, BROWSER_PATH);
		System.setProperty("selenide.browser", "phantomjs");
	}

	@Given("user browses to $url")
	public void givenUserBrowsesToUrl(String url) {
		open(url);
	}

	@When("user enters $keyWord in input with name $searchInputName")
	public void whenUserEntersKeyWordInInputWithNameSearch(String keyWord, String searchInputName) {
		$(By.name(searchInputName)).setValue(keyWord);
	}

	@When("user clicks button with name $search")
	public void whenUserClicksButtonWithName(String searchButtonName) {
		$(By.name(searchButtonName)).click();
	}

	@Then("website title starts with $keyWord")
	public void thenWebsiteTitleStartsWithITDesigners(String keyWord) {
		assertThat(title(), startsWith(keyWord));
	}

}
