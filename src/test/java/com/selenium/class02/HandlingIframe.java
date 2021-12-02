package com.selenium.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIframe {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		// Open the browser
		WebDriver driver = new ChromeDriver();

		// Maximize browser window
		driver.manage().window().maximize();

		// Open the url
		driver.get("http://the-internet.herokuapp.com/iframe");

		WebElement myelement = driver.findElement(By.id("mce_0_ifr"));

		driver.switchTo().frame(myelement);
		// driver.switchTo().frame("mce_0_ifr");
		// driver.switchTo().frame(4);

		WebElement textArea = driver.findElement(By.id("tinymce"));
		textArea.sendKeys("Hello! I am From KT");

		driver.switchTo().defaultContent();
	}
}
