package com.ecare.seleniumtrainning;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class workingwithmultiplewindowdefault {
	
	public static void main(String agr[]){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.way2sms.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
	Set<String>	 st=driver.getWindowHandles();
	Iterator<String> it=st.iterator();
	String parent=it.next();
	String child=it.next();
	driver.switchTo().window(child);
	driver.close();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//driver.findElement(By.id("keyword")).sendKeys("search something");
	
	}

}
