package com.xcelerateDesign.seleniumWebDriver.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

/**
 * EdgeBrowser to get edge driver
 */
public class EdgeBrowser implements Browser {

    /**
     * Method to get driver
     * @return EdgeDriver
     */
    @Override
    public WebDriver getDriver() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--remote-allow-origins=*");
        return new EdgeDriver(edgeOptions);
    }

}