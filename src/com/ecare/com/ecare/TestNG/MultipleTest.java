package com.ecare.com.ecare.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class MultipleTest {
	//public String baseURL="http://www.google.com";
	//public WebDriver driver=new FirefoxDriver();
	
	@BeforeTest
	public void BeforeTest(){
		System.out.println("open a url");
		
	}
	
	
	@AfterTest
	public void AfterTest(){
		System.out.println("close the browser");
	}
  @Test
  public void f() {
	 // driver.get(baseURL);
	 // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  System.out.println("i am in F test script");
	 // driver.close();
	  Assert.fail();
	  
	  
  }
  

  @Test(dependsOnMethods="f")
  public void a(){
	  //driver.get(baseURL);
	 // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 System.out.println("i am in A test script");
	//  Assert.assertTrue(true);
	 // driver.close();  
  }
  
  @Test
  public void d(){
	 // driver.get(baseURL);
	 // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  System.out.println("i am in D test script");
	 
	  //driver.close(); 
	  
	  //throw new SkipException("Skipping script");
  }
}
