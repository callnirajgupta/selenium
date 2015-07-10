package com.ecare.com.ecare.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class MultiAnnotation {
	
	public String baseURL="http://www.google.com";
	public WebDriver driver=new FirefoxDriver();
	
	@BeforeTest
	public void BeforeTest(){
		driver.get(baseURL);
		
	}
	@AfterTest
	public void AfterTest(){
		driver.quit();
		
	}
  @Test(groups="smoke")
  public void f() {
	  
	  String title=driver.getTitle();
	  Assert.assertTrue(true);
	  
	  
  }
}
