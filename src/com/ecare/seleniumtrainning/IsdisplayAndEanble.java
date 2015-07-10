package com.ecare.seleniumtrainning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsdisplayAndEanble {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://127.0.0.1/login.do");
		//its return boolean--true/false
		driver.findElement(By.name("username")).isDisplayed();
		
	if(driver.findElement(By.name("username")).isEnabled());
	driver.findElement(By.name("username")).sendKeys("sdfsdfsdfs");

	}

}
