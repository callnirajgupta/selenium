package com.ecare.com.ecare.TestNG;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
public class Gridtest {
	
	@BeforeMethod
	public void BeforeMethod() throws Throwable{
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		capability.setBrowserName("firefox");
		capability.setPlatform(Platform.VISTA);
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capability);
		driver.get("http://www.gmail.com");
	}
  @Test
  public void f() {
	  
	System.out.println("i am intest first");
	//driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capability);
	//driver.get("http://www.gmail.com");
  }
  
  @Test
  public void b(){
	  System.out.println("i am in test second");
	 // driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capability);
		//driver.get("http://www.gmail.com");
  }
  
  @Test
  public void c(){
	  System.out.println("i am in test third");
	  //driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capability);
		//driver.get("http://www.gmail.com");
  }
}
