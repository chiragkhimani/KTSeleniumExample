package com.selenium.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumQuickStart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		// Open the browser
		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		// Maximize browser window
		driver.manage().window().maximize();

		// Open the url
		driver.get("https://ebay.com/");

		// Close the browser
		driver.close();

		driver.navigate().back();

		driver.navigate().forward();

		driver.navigate().refresh();

	}
}
