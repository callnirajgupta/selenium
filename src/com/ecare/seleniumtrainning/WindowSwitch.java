package com.ecare.seleniumtrainning;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowSwitch {

	/**
	 * @param args
	 * @throws Throwable 
	 */
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//first perform operation in parent window
		driver.findElement(By.name("fname")).sendKeys("niraj");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Open New Page")).click();
		// Get and store both window handles in set
	Set<String> st=driver.getWindowHandles();
	Iterator<String> it=st.iterator();
	
	 String parent=(String) it.next();
	 String child=(String) it.next();
	 //Switch to window2(child window) and performing actions on it.
	 driver.switchTo().window(child);
	 driver.findElement(By.name("fname")).sendKeys("gupta");
	 Thread.sleep(2000);
	 //driver.close();
	 
	//Switch to window1(parent window) and performing actions on it.
	 driver.switchTo().window(parent);
	 
	  driver.findElement(By.xpath("//input[@value='female']")).click();
	 //driver.findElement(By.name("lname")).sendKeys("parent");

	}

}
