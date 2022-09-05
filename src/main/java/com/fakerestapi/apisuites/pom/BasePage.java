package com.fakerestapi.apisuites.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.springframework.stereotype.Component;

import com.fakerestapi.apisuites.browser.DriverFactory;
import com.fakerestapi.apisuites.browser.WebDriverInstance;


@Component
public abstract class BasePage {

	protected DriverFactory driverFactory;
	protected WebDriver driver ;

	public BasePage(WebDriver driver) {

	

	}

	public abstract boolean isPageLoaded();

}
