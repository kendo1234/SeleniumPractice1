package com.seleniumsimplified.webdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class FifthTest {
    @Test

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("http://selenium.googlecode.com/svn/trunk/docs/api/java/index.html");
        driver.switchTo().frame("classFrame"); //Switches to the frame that contains "Deprecated"
        driver.findElement(By.linkText("Deprecated")).click();
        driver.quit();

    }
}
