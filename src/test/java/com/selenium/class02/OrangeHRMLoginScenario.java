package com.selenium.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLoginScenario {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		// Open the browser
		WebDriver driver = new ChromeDriver();

		// Maximize browser window
		driver.manage().window().maximize();

		// Open the url
		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement usernameInput = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		usernameInput.sendKeys("admin");

		WebElement passwordInput = driver.findElement(By.id("txtPassword"));
		passwordInput.sendKeys("admin123");

		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		System.out.println(loginBtn.getAttribute("class"));

		WebElement usernamePassText = driver.findElement(By.xpath("//div[@id='content']/div/span"));
		System.out.println(usernamePassText.getText());

		System.out.println(loginBtn.isDisplayed());

		System.out.println(passwordInput.isEnabled());

	}
}
