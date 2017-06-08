package com.itd.web;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

/**
 * Demo for framework Selenium.
 */
public class TicTacToeGameUiTest {

	// http://docs.seleniumhq.org/docs/03_webdriver.jsp#user-input-filling-in-forms
	WebDriver driver;

//	@Before
	public void setUp() {
		// init driver using HtmlUnitDriver()
	}

//	@Test
	public void whenPlayAndWholeHorizontalLineFilledThenWinner() throws Exception {

		// browse to url using driver.get
		driver.get(Constants.APP_URL);

		// check Page tittle using getTitle()
		assertThat(driver.getTitle(), is(Constants.APP_TITLE));

		// implement play method

		WebElement gameHistory;

		// play 1,1 find history element using findElement(By.name and check its end using getText
		play(1, 1); // X
		gameHistory = driver.findElement(By.name(Constants.FIELD_NAME_HISTORY));
		assertThat(gameHistory.getText(), endsWith("X (1,1) - In progress"));

		// play 1,2 find history element and check its end
		play(1, 2); // O
		gameHistory = driver.findElement(By.name(Constants.FIELD_NAME_HISTORY));
		assertThat(gameHistory.getText(), endsWith("O (1,2) - In progress"));

		// play 2,1 2,2 3,1 find history element and check its end
		play(2, 1); // X
		play(2, 2); // O
		play(3, 1); // X
//		gameHistory = ...
//		assertThat(gameHistory.getText(), endsWith(...
	}

	private void play(int x, int y) throws Exception {

		// search element x using findElement(By.name and write the value in it using sendKeys
		WebElement eltX = driver.findElement(By.name(Constants.FIELD_NAME_X));
		// ...
		eltX.sendKeys("" + x);
		// check content of eltX.getAttribute("value"). you may need to clear the element first

		// search element y using findElement(By.name and write the value in it using sendKeys
		//...
		//...
		//...

		// search search button play using findElement(By.name and click it using submit()
//		WebElement playButton = ...
//		playButton.submit();
	}

}
