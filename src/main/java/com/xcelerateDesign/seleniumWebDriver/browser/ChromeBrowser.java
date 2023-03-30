package com.xcelerateDesign.seleniumWebDriver.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * ChromeBrowser to get chrome driver
 */
public class ChromeBrowser implements Browser {

    /**
     * Method to get driver
     * @return ChromeDriver
     */
    @Override
    public WebDriver getDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        return new ChromeDriver(chromeOptions);
    }

}