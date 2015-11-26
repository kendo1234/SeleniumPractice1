package com.seleniumsimplified.webdriver;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestAllLinks {

    public static void main(String[] args) {
        String baseUrl = "http://newtours.demoaut.com/";
        WebDriver driver = new FirefoxDriver();
        String underConsTitle = "Under Construction: Mercury Tours"; // Creates result string
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get(baseUrl);
        List<WebElement> linkElements = driver.findElements(By.tagName("a")); //Creates lists from <a> tags
        String[] linkTexts = new String[linkElements.size()];
        int i = 0;

        //extract the link texts of each link element
        for (WebElement e : linkElements) {
            linkTexts[i] = e.getText();
            i++;
        }

        //test each link by looping over them
        for (String t : linkTexts) {
            driver.findElement(By.linkText(t)).click();
            if (driver.getTitle().equals(underConsTitle)) {
                System.out.println("\"" + t + "\""
                        + " is under construction.");
            } else {
                System.out.println("\"" + t + "\"" //print results to console
                        + " is working.");
            }
            driver.navigate().back();
        }
        driver.quit();
    }
}
