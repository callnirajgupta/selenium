package com.ecare.seleniumtrainning;

import java.io.IOException;



import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReadAndWritefromexcelwithtestNG {
	
	
	public String baseURL="http://www.google.com";
	public WebDriver driver=new FirefoxDriver();
	ExcelLib excel=new ExcelLib();
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
	
	@Test()
	public void gmaillogin() throws Throwable{
		
		 String username=excel.getExcelData("Sheet1", 1, 0);
		 String password=excel.getExcelData("Sheet1", 1, 1);
		 System.out.println(username);
		 System.out.println(password);
		 
		
		 
		
	}
	
	@Test
	public void setdatainexcel() throws Throwable{
		excel.setExcelData("Sheet1", 2, 1, "india");
		System.out.println("rownum:"+excel.getExcelRowcount("Sheet1"));
		System.out.println("column:"+excel.getexcelcolcount("Sheet1", 1));
	}

}
