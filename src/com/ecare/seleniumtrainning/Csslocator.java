package com.ecare.seleniumtrainning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Csslocator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.gmail.com");
	//get the webelement from the application
	//WebElement wb=driver.findElement(By.cssSelector("input.rc-button"));
	// with the help of webelement click 
	//wb.click();

	//driver.findElement(By.cssSelector("input#Email")).sendKeys("callnirajgupta");
	//driver.findElement(By.cssSelector("input[type='email']")).sendKeys("callnirajgupta");
	//driver.findElement(By.cssSelector("input#Email[type='email'][name='Email']")).sendKeys("callnirajgupta");
	//driver.findElement(By.cssSelector("input.rc-button[type='submit']")).click();
	driver.findElement(By.cssSelector("a:Contains(Need help)")).click();
	System.out.println("finished");
	driver.close();
	}

}
