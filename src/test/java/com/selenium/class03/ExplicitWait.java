package com.selenium.class03;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		// Open the browser
		WebDriver driver = new ChromeDriver();

		// Maximize browser window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		// Open the url
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

		WebElement startBtn = driver.findElement(By.xpath("//div[@id='start']/button"));
		startBtn.click();

		WebElement helloWorldText = driver.findElement(By.xpath("//div[@id='finish']/h4"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(helloWorldText));
		
		System.out.println(helloWorldText.getText());
	}
}
