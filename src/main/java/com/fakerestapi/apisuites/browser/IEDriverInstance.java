package com.fakerestapi.apisuites.browser;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IEDriverInstance extends WebDriverInstance {

	
	public IEDriverInstance()
	{
		super();
		this.driver=new InternetExplorerDriver();
		this.webDriverWait=new WebDriverWait(this.driver, Duration.ofSeconds(2));
		this.javascriptExecutor=(JavascriptExecutor) this.driver;
	}
	/*
	 * @Override public void tearDown() {
	 * 
	 * }
	 */

}
