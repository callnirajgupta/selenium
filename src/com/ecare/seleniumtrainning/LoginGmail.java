package com.ecare.seleniumtrainning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginGmail {

	/**
	 * @param args
	 * @throws Throwable 
	 */
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
            WebDriver driver=new FirefoxDriver();
            driver.get("http://www.gmail.com");
            Thread.sleep(2000);
            WebElement element=driver.findElement(By.id("Emailcgcgcfgfgfg"));
            element .sendKeys("callnirajgupta");
            driver.findElement(By.id("next")).click();
            driver.findElement(By.id("Passwd")).sendKeys("pass");
            driver.findElement(By.id("signIn")).click();
            //driver.close;
            System.out.println("finished");
	}

}
