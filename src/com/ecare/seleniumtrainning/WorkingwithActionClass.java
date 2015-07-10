package com.ecare.seleniumtrainning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithActionClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		WebElement mouseover=driver.findElement(By.id("hplogo"));
	
		//act.moveToElement(mouseover);
		//act.perform();
		//when need to perform more than one operation then need to build and perform
		//act.click().build().perform();
		//act.perform();
		
		
		act.clickAndHold(mouseover).perform();
		
		
		String  tooltrip=mouseover.getAttribute("title");
	System.out.println(tooltrip);
		driver.close();
		*/
	
		/*
		WebDriver driver=new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.in/2014/09/selectable.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		WebElement doubleclick=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		//driver.findElement(By.cssSelector("button[ondblclick='myFunction()']"));
		act.doubleClick(doubleclick).perform();
		driver.switchTo().alert().accept();
		act.contextClick(doubleclick).perform();
		*/
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.in/2014/09/drag-and-drop.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		WebElement src=driver.findElement(By.id("dragdiv"));
		WebElement des=driver.findElement(By.id("dropdiv"));
		
		
		act.dragAndDrop(src, des).perform();
		
		
		
		
		

	}

}
