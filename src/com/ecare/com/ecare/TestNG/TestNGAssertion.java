package com.ecare.com.ecare.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertion {
	@Test 
	public void testCaseVerifyHomePage() 
	{ 
	 WebDriver driver= new FirefoxDriver(); 
	driver.navigate().to("http://google.com"); 
	Assert.assertEquals("Google", driver.getTitle());
	Assert.assertNotEquals("Google", driver.getTitle(), "message when fail");
	 }

	@Test
	public void asserttruefalse(){
		boolean result=true;
		Assert.assertTrue(result);
		Assert.assertFalse(result);
		
				
	}
	
	@Test
	public void assertnullnotnull(){
		String result=null;
		Assert.assertNotNull(result);
		Assert.assertNull(result);
		
	}
	
	
	@Test
	public void assertfai(){
		
		//class object only can be checked
		//Assert.assertNotSame(actual, expected);
		
		Assert.fail();
		//Assert.assertSame(object, expected);
		//Assert.assertSame(actual, expected);
		
	}
	
}
