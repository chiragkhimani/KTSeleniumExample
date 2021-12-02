package com.selenium.class02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		// Open the browser
		WebDriver driver = new ChromeDriver();

		// Maximize browser window
		driver.manage().window().maximize();

		// Open the url
		driver.get("https://demoqa.com/alerts");

		WebElement jsPromptBtn = driver.findElement(By.id("promtButton"));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", jsPromptBtn);

		Alert alt = driver.switchTo().alert();

		alt.sendKeys("Hello From KT");
		System.out.println(alt.getText());
		alt.accept();

		executor.executeScript("arguments[0].click();", jsPromptBtn);
		alt.dismiss();

	}
}
