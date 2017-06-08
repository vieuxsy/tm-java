package com.itd.web;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Demo for web tdd framework Selenium.
 * complex and low level config
 */
public class SeleniumTest {

    @Before
    public void setUp() {
        System.setProperty(Constants.BROWSER_PROP_NAME, Constants.BROWSER_PATH);
    }

    @Test
    public void whenSearchKeywordInWikipediaThenPageTitleStartsWithKeyword() {

        // create WebDriver using PhantomJSDriver
        WebDriver driver = new PhantomJSDriver();

        // browse to url using driver.get
        driver.get(Constants.URL);

        // create WebElement referencing the search input text box using driver.findElement and write keyword in it usind sendKeys
        WebElement searchInput = driver.findElement(By.name(Constants.SEARCH_INPUT_NAME));
        searchInput.sendKeys(Constants.KEYWORD);

        // create WebElement referencing the search button using driver.findElement and click it using click
        WebElement searchButton = driver.findElement(By.name(Constants.SEARCH_BUTTON_NAME));
        searchButton.click();

        // assertThat website title startsWith keyword using getTitle
        assertThat(driver.getTitle(), startsWith(Constants.KEYWORD));

        // close driver using quit
        driver.quit();
    }
}
