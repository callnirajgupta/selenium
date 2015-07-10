package com.ecare.seleniumtrainning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAtrribute {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver=new FirefoxDriver();
		
		driver.get("http://127.0.0.1/login.do");
		
		String ab=driver.findElement(By.name("username")).getText();
	String a=driver.findElement(By.name("username")).getAttribute("value");
	/*System.out.println(driver.findElement(By.name("username")).getAttribute("value"));

	System.out.println(driver.getClass());
	driver.navigate().to("http://www.yahoo.com");
	driver.navigate().refresh();
	driver.navigate().to("http://www.google.com");
	driver.navigate().back();
	driver.navigate().forward();
	*/
		
		driver.manage().window().maximize();
	}

}
