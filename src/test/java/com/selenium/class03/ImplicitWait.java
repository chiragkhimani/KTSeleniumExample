package com.selenium.class03;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		// Open the browser
		WebDriver driver = new ChromeDriver();

		// Maximize browser window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		// Open the url
		driver.get("https://www.minted.com/");

		WebElement emailInput = driver.findElement(By.xpath("//input[@name='campaign_id']/..//input[@name='email']"));
		emailInput.sendKeys("testdemo@kt.com");
	}
}
