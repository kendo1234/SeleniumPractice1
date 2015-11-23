package com.seleniumsimplified.webdriver;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static junit.framework.TestCase.assertTrue;

public class FirstTest {

    @Test
    public void driverIsKing() {
        WebDriver driver = new HtmlUnitDriver();

        driver.get("http://compendiumdev.co.uk/selenium/");

        assertTrue(driver.getTitle().startsWith("Selenium Simplified"));
    }

    @Test
    public void firefoxIsSupportedByWebDriver() {

        WebDriver driver = new FirefoxDriver();

        driver.get("http://compendiumdev.co.uk/selenium/");

        assertTrue(driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();
    }
}




