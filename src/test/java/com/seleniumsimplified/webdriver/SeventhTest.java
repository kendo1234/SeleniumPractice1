package com.seleniumsimplified.webdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class SeventhTest {
    @Test


    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        String baseURL = "http://facebook.com";

        driver.get(baseURL);
        WebElement chkFBPersist = driver.findElement(By.id("persist_box")); //Find check box and click
        for (int i=0; i<2; i++) {
            chkFBPersist.click(); //Clicks the checkbox TWICE and output the result as true when toggled on and false when toggled off
            System.out.println(chkFBPersist.isSelected());
        }
        driver.quit();
    }

}

