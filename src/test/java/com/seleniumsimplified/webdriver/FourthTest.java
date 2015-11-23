package com.seleniumsimplified.webdriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FourthTest {
    @Test
//Only the parent window will close - driver.quit() would close all windows
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://popuptest.com/popuptest2.html");
        driver.close();
    }
}
