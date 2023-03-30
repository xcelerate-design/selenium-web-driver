package com.xcelerateDesign.seleniumWebDriver.browser;

import org.openqa.selenium.WebDriver;

/**
 * Browser interface to create different browsers
 */
public interface Browser {

    /**
     * Method to get driver class
     * @return WebDriver
     */
    public WebDriver getDriver();

}
