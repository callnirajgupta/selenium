package com.ecare.firefoxprofile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class ChnageProxySetting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("network.proxytype", 1);
		profile.setPreference("network.proxy.http", "10.20.30.40");
		profile.setPreference("network.proxy.http.port", 8080);
		WebDriver driver=new FirefoxDriver(profile);
	}

}
