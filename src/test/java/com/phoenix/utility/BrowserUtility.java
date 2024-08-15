package com.phoenix.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtility {

	private WebDriver wd;

	public void launchBrowser(Browser browser) {
		if (browser == Browser.CHROME) {
			wd = new ChromeDriver();
		} else if (browser == Browser.FIREFOX) {
			wd = new FirefoxDriver();
		}
	}

	public void getUrl(String url) {
		wd.get(url);
	}

	public void maximizetheWindow() {
		wd.manage().window().maximize();
	}
}
