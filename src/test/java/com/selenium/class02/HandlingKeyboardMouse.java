package com.selenium.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingKeyboardMouse {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		// Open the browser
		WebDriver driver = new ChromeDriver();

		// Maximize browser window
		driver.manage().window().maximize();

		// Open the url
		driver.get("https://www.ebay.com/");

		WebElement electronicsTab = driver
				.findElement(By.xpath("//div[@id='mainContent']//li/a[text()='Electronics']"));

		WebElement appleLink = driver.findElement(By.xpath("//div[@id='mainContent']//li/a[text()='Apple']"));

		Actions a = new Actions(driver);
//		a.moveToElement(electronicsTab).pause(1000).click(appleLink).build().perform();

		WebElement signInLink = driver.findElement(By.xpath("//span[@id='gh-ug']//a[text()='Sign in']"));
		a.keyDown(Keys.CONTROL).click(signInLink).keyUp(Keys.CONTROL).build().perform();

	}
}
