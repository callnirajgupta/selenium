package com.ecare.com.ecare.TestNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class PriorityTestNG {
	 @Test(priority=7)
	  public void f_priority() {
		 // driver.get(baseURL);
		 // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  System.out.println("i am in first test script");
		 // driver.close();
		  Assert.fail();
		  
		  
	  }
	  
	  @Test(priority=3)
	  public void a_priority(){
		  //driver.get(baseURL);
		 // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 System.out.println("i am in second test script");
		  Assert.assertTrue(true);
		 // driver.close();  
	  }
	  
	  @Test(priority=0)
	  public void d_priority(){
		 // driver.get(baseURL);
		 // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  System.out.println("i am in third test script");
		 
		  //driver.close(); 
		  
		  throw new SkipException("Skipping script");
	  }
}
