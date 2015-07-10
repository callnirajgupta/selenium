package com.ecare.seleniumtrainning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert {

	/**
	 * @param args
	 * @throws Throwable 
	 */
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.in/");
		//driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//button[@onclick='myFunctionf()']")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.alertIsPresent());
		
		String alertmessage=driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("abc");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().sendKeys("abc");
		driver.close();
		
		
		

	}

}
