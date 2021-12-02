package com.selenium.class02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingRadioBtnChkBxDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		// Open the browser
		WebDriver driver = new ChromeDriver();

		// Maximize browser window
		driver.manage().window().maximize();

		// Open the url
		driver.get("https://www.ebay.com/sch/ebayadvsearch");

		WebElement conditionNewChbx = driver.findElement(By.id("LH_ItemConditionNew"));
		conditionNewChbx.click();

		WebElement conditionUsedChbx = driver.findElement(By.id("LH_ItemConditionUsed"));
		System.out.println(conditionUsedChbx.isEnabled());

		WebElement locatedInRadioBtn = driver.findElement(By.id("LH_Located"));
		locatedInRadioBtn.click();

		System.out.println(locatedInRadioBtn.isSelected());

		WebElement selectCatDropdown = driver.findElement(By.name("_sacat"));

		Select catDropdownSelect = new Select(selectCatDropdown);

		catDropdownSelect.selectByIndex(3);

		Thread.sleep(3000);

		catDropdownSelect.selectByValue("625");

		Thread.sleep(3000);

		catDropdownSelect.selectByVisibleText("Collectibles");

		// ============= Retrieve all options from dropdown =========

		List<WebElement> allOption = catDropdownSelect.getOptions();

		for (int i = 0; i < allOption.size(); i++) {
			System.out.println(allOption.get(i).getText());
		}

	}
}
