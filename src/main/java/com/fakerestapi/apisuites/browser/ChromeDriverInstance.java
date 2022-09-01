package com.fakerestapi.apisuites.browser;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;


public class ChromeDriverInstance extends WebDriverInstance {
	
	
	
	public ChromeDriverInstance()
	{
		super();
		this.driver=new  ChromeDriver();
		this.webDriverWait=new WebDriverWait(this.driver, Duration.ofSeconds(2));
		this.javascriptExecutor=(JavascriptExecutor) this.driver;
	}

	@Override
	public void tearDown() {
		
	}

}
