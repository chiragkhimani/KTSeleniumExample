package com.selenium.class03;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMultipleWindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		// Open the browser
		WebDriver driver = new ChromeDriver();

		// Maximize browser window
		driver.manage().window().maximize();

		// Open the url
		driver.get("https://www.ebay.com/");

		Actions a = new Actions(driver);

		WebElement signInLink = driver.findElement(By.xpath("//a[text()='Registration']"));
		a.keyDown(Keys.SHIFT).click(signInLink).keyUp(Keys.SHIFT).build().perform();

		// Retrieve current window id
		String originalWindowID = driver.getWindowHandle(); // 101

		// Retrieve list of window id
		Set<String> listOfWindow = driver.getWindowHandles(); // 101, 102

		// Switch focus to new window
		for (String window : listOfWindow) {
			if (!window.equals(originalWindowID)) {
				driver.switchTo().window(window);
			}
		}

		// Complete all task on new window
		WebElement titleOfNewWindow = driver.findElement(By.xpath("//h1"));
		System.out.println(titleOfNewWindow.getText());

		// Close new window
		driver.close();

		// Switch to original window
		driver.switchTo().window(originalWindowID);

		// Close original window as well
		driver.close();

	}
}
