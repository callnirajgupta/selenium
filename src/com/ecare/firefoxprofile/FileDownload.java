package com.ecare.firefoxprofile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownload {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.folderlist", 0);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		WebDriver driver = new FirefoxDriver(profile);
		driver.get("http://www.seleniumhq.org/download");
		driver.findElement(By.xpath("//a[@href='']")).click();
		

	}

}
