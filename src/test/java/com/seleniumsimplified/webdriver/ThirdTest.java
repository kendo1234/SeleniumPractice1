package com.seleniumsimplified.webdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ThirdTest {
    @Test

        public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        String baseURL = "http://www.facebook.com";
        String tagName = "";

        driver.get(baseURL);
        tagName = driver.findElement(By.id("email")).getTagName();
        System.out.println(tagName);
        driver.close();
        System.exit(0);
    }
}
