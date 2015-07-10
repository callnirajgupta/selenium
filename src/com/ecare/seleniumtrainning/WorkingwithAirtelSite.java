package com.ecare.seleniumtrainning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingwithAirtelSite {

	/**
	 * @param args
	 * @throws Throwable 
	 */
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.airtel.in/broadband-and-fixed-line/broadband");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement wb=driver.findElement(By.id("selectedfirstlast1"));
		
		Select sel=new Select(wb);
		sel.selectByVisibleText("Karnataka");
		
		//WebDriverWait wait=new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//*[@id='city']/option[Text()='Bangalore']")));
	Thread.sleep(1000);	
	WebElement wb1=driver.findElement(By.id("city"));
	Select sel1=new Select(wb);
	sel1.selectByVisibleText("Bangalore");

	

	}

}
