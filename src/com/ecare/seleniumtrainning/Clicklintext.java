package com.ecare.seleniumtrainning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clicklintext {

	/**
	 * @param args
	 * @throws Throwable 
	 */
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		
		Thread.sleep(2000);
		driver.get("http://only-testing-blog.blogspot.in/");
		driver.findElement(By.linkText("Chartdfgdfggggh")).click();
		

	}

}
