package com.ecare.seleniumtrainning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("http://only-testing-blog.blogspot.in/2015/01/iframe1.html");
		  driver.findElement(By.xpath("//input[@name='Town']")).sendKeys("Your town");
		  driver.switchTo().frame("frame1");
		  driver.findElement(By.xpath("//td[contains(text(),'Cow')]/preceding-sibling::td/input[@type='checkbox']")).click();
		  driver.switchTo().defaultContent();
		  driver.findElement(By.xpath("//input[@name='Town']")).sendKeys("Your town in paraent");
	}

}
