package com.xcelerateDesign.seleniumWebDriver.browser;

import org.openqa.selenium.WebDriver;

/**
 * CustomWebDriver to get web driver
 */
public class CustomWebDriver {

    /**
     * Method to get web driver
     * @param browser
     * @return WebDriver
     */
    public static WebDriver getWebDriver(String browser) {
        WebDriver webDriver = new BrowserFactory().createBrowser(browser).getDriver();
        webDriver.manage().window().maximize();
        return webDriver;
    }
}
