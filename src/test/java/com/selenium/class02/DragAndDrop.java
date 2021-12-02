package com.selenium.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		// Open the browser
		WebDriver driver = new ChromeDriver();

		// Maximize browser window
		driver.manage().window().maximize();

		// Open the url
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement iframe =driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		
		driver.switchTo().frame(iframe);
		
		WebElement img = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		
		WebElement trashArea = driver.findElement(By.id("trash"));
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(img, trashArea).build().perform();
		
	}
}
