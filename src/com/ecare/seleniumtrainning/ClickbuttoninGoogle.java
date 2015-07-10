package com.ecare.seleniumtrainning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickbuttoninGoogle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		
		driver.findElement(By.className("gsfi")).sendKeys("ecare");
		List<WebElement> lt=driver.findElements(By.xpath("//*[starts-with(@class,'sbqs')]"));
		
		System.out.println(lt.get(1).getText());
		
		lt.get(1).sendKeys(Keys.ENTER);
	//	String a=driver.getPageSource();
		//System.out.println("print frim variable"+a);
	//System.out.println("title"+driver.getTitle());
	}
}
