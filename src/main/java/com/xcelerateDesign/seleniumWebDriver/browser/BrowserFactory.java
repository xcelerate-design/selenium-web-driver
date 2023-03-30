package com.xcelerateDesign.seleniumWebDriver.browser;

/**
 * BrowserFactory to get different browsers
 */
public class BrowserFactory {

    /**
     * Method to get browser
     * @param browser
     * @return Browser
     */
    public Browser createBrowser(String browser) {
        switch (browser) {
            case "chrome":
                return new ChromeBrowser();
            case "edge":
                return new EdgeBrowser();
            default:
                throw new IllegalArgumentException("Unknown browser " + browser);
        }
    }
}

