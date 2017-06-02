package com.itd.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

/**
 * Demo for web tdd framework Selenium.
 * complex and low level config
 */
public class SeleniumTest {

    public void setUp() {
        // set browser path
        System.setProperty(Constants.BROWSER_PROP_NAME, Constants.BROWSER_PATH);
    }

    public void whenSearchKeywordInWikipediaThenPageTitleStartsWithKeyword() {

        // create WebDriver using PhantomJSDriver
        WebDriver driver = new PhantomJSDriver();

        // browse to url using driver.get
        driver.get(Constants.URL);

        // create WebElement referencing the search input text box using driver.findElement and write keyword in it usind sendKeys
        WebElement searchInput = driver.findElement(By.name(Constants.SEARCH_INPUT_NAME));
        searchInput.sendKeys(Constants.KEYWORD);

        // create WebElement referencing the search button using driver.findElement and click it using click

        // assertThat website title startsWith keyword using getTitle

        // close driver using quit
    }
}
