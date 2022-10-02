package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
	@Test
	public void TestOne() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Documents\\New folder\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver	driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.print("Test One done");
		
		driver.quit();
	}@Test
	public void TestTwo() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Documents\\New folder\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver	driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.print("Test Two done");
		
		driver.quit();
		}
	
		@Test
		public void TestThree() {
			Assert.assertTrue(true);
			System.out.print("Assertions passedd");
			System.out.print("Test Three done");
			
			
		}@Test
		public void TestFour() {
			Assert.assertTrue(true);
			System.out.print("Assertions passedd");
			
			System.out.print("Test four done");
			
		}
	
	
	

}
