package com.itd.web;

/**
 * Demo for web tdd framework Selenide.
 * more readable
 * hides WebDriver and configuration
 */
public class SelenideTest {

    public void setUp() {
        // set browser path

        // change selenide browser from default to phantomjs
        System.setProperty("selenide.browser", "phantomjs");
    }

    public void whenSearchKeywordInWikipediaThenPageTitleStartsWithKeyword() {

        // browse to url using open()

        // write keyword in search textbox using $(By.name().setValue

        // click search button using $(By.name().click

        // assertThat website title startsWith keyword using title()

        // should close Driver automatically, if not use WebDriverRunner.getWebDriver().quit();
    }
}
