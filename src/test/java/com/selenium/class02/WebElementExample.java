package com.selenium.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Task

// Open https://opensource-demo.orangehrmlive.com/index.php/auth/login
// Enter username 
// Enter password 
// Click on login button

public class WebElementExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		// Open the browser
		WebDriver driver = new ChromeDriver();

		// Maximize browser window
		driver.manage().window().maximize();

		// Open the url
		driver.get("https://ebay.com/");

		WebElement searchBox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
		searchBox.sendKeys("TV");

		WebElement searchBtn = driver.findElement(By.id("gh-btn"));
		searchBtn.click();

	}
}
