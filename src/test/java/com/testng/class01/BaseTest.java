package com.testng.class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	LoginPage login;
	HomePage home;

	@BeforeMethod
	public void setUp() {
		PropertyReader.initProperty();
		DriverUtils.createDriver();
		login = new LoginPage();
		home = new HomePage();
	}

	@AfterMethod
	public void cleanUp() {
		DriverUtils.getDriver().close();
	}
}
