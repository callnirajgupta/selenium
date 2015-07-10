package com.ecare.seleniumtrainning;

import java.util.NoSuchElementException;
import java.util.Vector;
import java.util.concurrent.TimeUnit;


import org.apache.xpath.functions.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TypeOfWait {

	/**
	 * @param args
	 * @throws Throwable 
	 */
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
    WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.yahoo.com"); 
		//Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebDriverWait wait= new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.elementToBeClickable(By.id("closeBtn")));
		
	driver.findElement(By.id("closeBtn")).click();
		driver.close();
		//wait.until(ExpectedConditions.alertIsPresent());
		//wait.until(ExpectedConditions.elementSelectionStateToBe(locator, selected));
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
		//wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
		//wait.until(ExpectedConditions.textToBePresentInElement(locator, text));
		//wait.until(ExpectedConditions.visibilityOf(element))
		//wait.until(ExpectedConditions.titleContains(title));
		
		//fluent wait
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		WebElement countdown = driver.findElement(
                By.id("javascript_countdown_time"));

new WebDriverWait(driver,10).
   until(ExpectedConditions.visibilityOf(countdown));
/*
Wait wait = new FluentWait(driver)

.withTimeout(30, TimeUnit.SECONDS)

.pollingEvery(5, TimeUnit.SECONDS)

.ignoring(NoSuchElementException.class);

WebElement foo = wait.until(new Function<>() {

public WebElement apply(WebDriver driver) {

return driver.findElement(By.id("foo"));

}

@Override
public void fixupVariables(Vector arg0, int arg1) {
	// TODO Auto-generated method stub
	
}

});
*/
	// wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("foo"))));
	}
}
