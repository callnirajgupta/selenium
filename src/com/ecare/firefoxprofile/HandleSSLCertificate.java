package com.ecare.firefoxprofile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class HandleSSLCertificate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxProfile profile = new FirefoxProfile();
		profile.setAssumeUntrustedCertificateIssuer(false);
		WebDriver driver = new FirefoxDriver(profile);
		driver.get("https://ess5-white-echo360.com:8445/ecs");
		

	}

}
