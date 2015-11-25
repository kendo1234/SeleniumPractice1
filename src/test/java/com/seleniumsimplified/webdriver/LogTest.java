package com.seleniumsimplified.webdriver;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogTest
{
    static Logger logger = Logger.getLogger(LogTest.class);
    public static void main(String[] args)
    {
        //PropertiesConfigurator is used to configure logger from properties file
        PropertyConfigurator.configure("log4j.properties");

        //Log in console in and log file
        logger.debug("Log4j appender configuration is successful !!");
    }
}