package com.testng.class01;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {

	static WebDriver driver;

	public static void createDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		// Open the browser
		driver = new ChromeDriver();

		// Maximize browser window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		// Open the url
		driver.get(PropertyReader.getProperty("app.url"));
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
