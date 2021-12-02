package com.testng.class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// 1234
// 132 142
// 1342
public class TestNgDemo {
	@BeforeMethod
	public void setUp() {
		System.out.println("1");
	}

	@AfterMethod
	public void cleanUp() {
		System.out.println("2");
	}

	@Test
	public void test1() {
		System.out.println("3");
	}

	@Test
	public void test2() {
		System.out.println("4");
	}
}
