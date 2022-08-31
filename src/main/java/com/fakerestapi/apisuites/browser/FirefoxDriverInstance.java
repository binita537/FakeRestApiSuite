package com.fakerestapi.apisuites.browser;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirefoxDriverInstance extends WebDriverInstance {
	
	
	public FirefoxDriverInstance()
	{
		super();
		this.driver=new FirefoxDriver();
		this.webDriverWait=new WebDriverWait(this.driver, Duration.ofSeconds(2));
		this.javascriptExecutor=(JavascriptExecutor) this.driver;
	}

	@Override
	public void tearDown() {

	}

}
