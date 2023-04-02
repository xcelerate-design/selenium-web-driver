package com.xcelerateDesign.seleniumWebDriver;

import com.xcelerateDesign.seleniumWebDriver.browser.CustomWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * AddToCartDemo to add products in to cart
 */
public class AddToCartDemo {

	// Site
	private static String SITE = "https://rahulshettyacademy.com/seleniumPractise/";

	// List of items need to be added in to cart
	private static List<String> ITEMS = new ArrayList<>(Arrays.asList("Cucumber", "Cauliflower", "Beans", "Tomato"));

	public static void main(String[] args) throws InterruptedException {

		WebDriver webDriver = CustomWebDriver.getWebDriver("chrome");
		webDriver.get(SITE);
		WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(10));

		// Add items in to cart
		ADD_ITEMS(webDriver);

		// Show cart
		Thread.sleep(3000);
		webDriver.findElement(By.cssSelector("img[alt='Cart']")).click();
		webDriver.findElement(By.cssSelector("div[class='cart-preview active'] button[type='button']")).click();
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));

		// Enter promo code
		Thread.sleep(3000);
		webDriver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		webDriver.findElement(By.className("promoBtn")).click();
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

		Thread.sleep(3000);

		webDriver.quit();

	}
	
	public static void ADD_ITEMS(WebDriver webDriver) throws InterruptedException {

		Thread.sleep(3000);
		List<WebElement> products = webDriver.findElements(By.cssSelector("h4.product-name"));

		// Add items to the cart
		int itemsFound = 0;
		for (int iCounter = 0; iCounter < products.size(); iCounter++) {

			String item = products.get(iCounter).getText().split("-")[0].trim();

			if (ITEMS.contains(item)) {

				// Add to cart
				webDriver.findElements(By.xpath("//div[@class='product-action']/button")).get(iCounter).click();
				itemsFound++;

				// Break, if all the items are found
				if (itemsFound == ITEMS.size()) {
					break;
				}
				Thread.sleep(1000);

			}

		}

	}

}
