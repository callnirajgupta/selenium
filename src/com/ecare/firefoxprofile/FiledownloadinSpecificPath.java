package com.ecare.firefoxprofile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FiledownloadinSpecificPath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.folderlist", 2);
		profile.setPreference("browser.download.dir", "c:\\niraj");
		profile.setPreference("browser.helperapps.neverak.savetodisk", "application/zip");
		
		WebDriver driver = new FirefoxDriver(profile);
	}

}
