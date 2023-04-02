package com.xcelerateDesign.seleniumWebDriver;

import com.google.common.io.Files;
import com.xcelerateDesign.seleniumWebDriver.browser.CustomWebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

/**
 * ScreenShotDemo to take screenshot
 */
public class ScreenShotDemo {

	// Site
	private static String SITE = "http://google.com";

	public static void main(String[] args) throws IOException, InterruptedException {

		// Get web driver
		WebDriver webDriver = CustomWebDriver.getWebDriver("chrome");
		webDriver.get(SITE);

		// Take screenshot
		File file = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
		Files.copy(file, new File("screen_shot.png"));

		Thread.sleep(3000);
		webDriver.quit();

	}

}
