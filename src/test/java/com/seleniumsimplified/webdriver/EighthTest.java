package com.seleniumsimplified.webdriver;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EighthTest {

    @Test

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("http://jsbin.com/osebed/2");
        Select fruits = new Select(driver.findElement(By.id("fruits"))); //selects from fruits drop down
        fruits.selectByVisibleText("Banana"); //selects banana as it is visible in drop down
        fruits.selectByIndex(1);


    }
}
