package com.ecare.com.ecare.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BeforeAndAfterMethod {
	public String baseURL="http://www.google.com";
	public WebDriver driver=new FirefoxDriver();
	
	@BeforeTest
	public void BeforeTest(){
		driver.get(baseURL);
		System.out.println("I am in BeforeTest");
		
	}
	@AfterTest
	public void AfterTest(){
		System.out.println("I am in AfterTest");
		driver.quit();
		
	}
	
	@BeforeMethod
	public void BeforeMethod(){
		System.out.println("i am in Beforemethod ");
	}
	@AfterMethod
	public void AfterMethod(){
		System.out.println("i am in AfterMethod");
	}
  @Test(priority=0)
  public void f() {
	  System.out.println("I am in first test");
	  String title=driver.getTitle();
	 Assert.assertTrue(true);
	  
	  
  }
  @Test(priority=2)
  public void d(){
	  System.out.println("i am in second test");
  }
}
