package com.itd.web;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Demo for web tdd framework Selenide.
 * more readable
 * hides WebDriver and configuration
 */
public class SelenideTest {

    @Before
    public void setUp() {
        System.setProperty(Constants.BROWSER_PROP_NAME, Constants.BROWSER_PATH);
        System.setProperty("selenide.browser", "phantomjs");
    }

    @Test
    public void whenSearchKeywordInWikipediaThenPageTitleStartsWithKeyword() {

        // browse to url using open()
        open(Constants.URL);

        // write keyword in search textbox using $(By.name().setValue
        $(By.name(Constants.SEARCH_INPUT_NAME)).setValue(Constants.KEYWORD);

        // click search button using $(By.name().click
        $(By.name(Constants.SEARCH_BUTTON_NAME)).click();

        // assertThat website title startsWith keyword using title()
        assertThat(title(), startsWith(Constants.KEYWORD));

        // should close Driver automatically, if not use WebDriverRunner.getWebDriver().quit();
    }
}
