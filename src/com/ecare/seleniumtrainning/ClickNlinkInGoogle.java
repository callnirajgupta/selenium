package com.ecare.seleniumtrainning;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickNlinkInGoogle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.className("gsfi")).sendKeys("ecare");
		List<WebElement> lt=driver.findElements(By.xpath("//div[starts-with(@class,'sbqs')]"));
		
		
		//to get the number of link in page
		System.out.println(lt.size());
		//to click second element
		lt.get(2).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.ENTER);
		//how to get rhe number of link in page an clicking each link and check it whether right page is opening or not
		List<WebElement> linklist =driver.findElements(By.tagName("a"));
		System.out.println("number of link"+linklist.size());
		
		//i want to click link which are in  h3 tag
		
		List<WebElement> linklisth3 =driver.findElements(By.xpath("//h3/a"));
		System.out.println("number of link"+linklisth3.size());
		for (WebElement wb:linklisth3){
			System.out.println("link text "+wb.getText());
			//now click each link
			wb.click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			//String title=driver.getTitle();
			//System.out.println("title of teh page"+title);
			//wb.getText().contains(title);
			driver.navigate().back();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}

	}

}
