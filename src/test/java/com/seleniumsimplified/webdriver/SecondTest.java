package com.seleniumsimplified.webdriver;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondTest {
@Test
    public static void main(String[] args) {
    //declare variables
    WebDriver driver = new FirefoxDriver();
    String baseUrl = "http://rentalcars.com/?cor=gb";
    String expectedTitle = "Cheap Car Hire, Best Rental Prices | Rentalcars.com";
    String actualTitle = "";

    //Launch Firefox and open baseUrl
    driver.get(baseUrl);

    //get the value of title
    actualTitle = driver.getTitle();

    //compare actual title with expected and pass or fail

    if (actualTitle.contentEquals(expectedTitle)){
        System.out.println("Test Passed!");
    } else {
        System.out.println("Test Failed");
    }

    //close the browser
    driver.close();
    }
}
