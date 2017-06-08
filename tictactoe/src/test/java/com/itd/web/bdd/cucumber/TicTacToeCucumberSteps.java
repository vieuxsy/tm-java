package com.itd.web.bdd.cucumber;

import com.itd.web.Constants;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

/**
 * steps matching those in scenarios in feature file
 */
public class TicTacToeCucumberSteps {

	WebDriver driver;

	@Given("^user browses to (.*)/$")
	public void givenUserBrowsesToTicTacToeUrl(String url) throws Throwable {
		driver = new HtmlUnitDriver();
		driver.get(url);
		assertThat(driver.getTitle(), is(Constants.APP_TITLE));
	}

	@When("^user enters (\\d+) in input (.*) and (\\d+) in input (.*)$")
	public void whenUserEntersXandY(int x, String xField, int y, String yField) throws Throwable {
		WebElement eltX = driver.findElement(By.name(xField));
		eltX.clear();
		eltX.sendKeys("" + x);

//		WebElement eltY = ...
//		...
//		...
	}

	@When("^user clicks button (.*)$")
	public void whenUserClicksButtonPlay(String btnPlay) throws Throwable {
		WebElement playButton = driver.findElement(By.name(btnPlay));
		playButton.submit();
	}

	@Then("^content of field (.*) is (.*)$")
	public void thenHistoryFieldContainsRoundInfo(String fieldName, String fieldValue) throws Throwable {
		WebElement gameHistory = driver.findElement(By.name(Constants.FIELD_NAME_HISTORY));
//		assertThat(...
	}

}
