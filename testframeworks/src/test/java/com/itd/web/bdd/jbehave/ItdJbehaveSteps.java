package com.itd.web.bdd.jbehave;

import org.jbehave.core.annotations.BeforeStory;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * steps matching those in scenarios in story file
 */
public class ItdJbehaveSteps {

	@BeforeStory
	public void beforeStory() {
		// set browser path

		// change selenide browser from default to phantomjs
	}

	@Given("user browses to $url")
	public void givenUserBrowsesToUrl(String url) {

	}

	@When("user enters $keyWord in input with name $searchInputName")
	public void whenUserEntersKeyWordInInputWithNameSearch(String keyWord, String searchInputName) {
	}

	@When("user clicks button with name $search")
	public void whenUserClicksButtonWithName(String searchButtonName) {
	}

	@Then("website title starts with $keyWord")
	public void thenWebsiteTitleStartsWithITDesigners(String keyWord) {
	}

}
