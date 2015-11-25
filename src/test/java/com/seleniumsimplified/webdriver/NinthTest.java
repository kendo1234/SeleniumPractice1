package com.seleniumsimplified.webdriver;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class NinthTest {
    @Test

    public static void main(String[] args) {
        String baseUrl = "http://www.guru99.com/accessing-links-tables-selenium-webdriver.html";
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get(baseUrl);
        driver.findElement(By.partialLinkText("image010")).click();
        System.out.println("Title of Page is: " + driver.getTitle());
        driver.quit();

    }
}
