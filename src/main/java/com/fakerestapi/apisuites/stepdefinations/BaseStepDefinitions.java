package com.fakerestapi.apisuites.stepdefinations;

import org.springframework.beans.factory.annotation.Autowired;

import com.fakerestapi.apisuites.browser.AbstarctWebDriverInstance;
import com.fakerestapi.apisuites.browser.ChromeDriverInstance;
import com.fakerestapi.apisuites.browser.DriverFactory;
import com.fakerestapi.apisuites.browser.FirefoxDriverInstance;
import com.fakerestapi.apisuites.browser.IEDriverInstance;
import com.fakerestapi.apisuites.browser.WebDriverInstance;

public class BaseStepDefinitions {
	
	@Autowired
	protected AbstarctWebDriverInstance abstarctWebDriverInstance;
	
	@Autowired
	protected WebDriverInstance webDriverInstance;
	
	@Autowired
	protected ChromeDriverInstance chromeDriverInstance;
	
	@Autowired
	protected DriverFactory driverFactory;
	
	@Autowired
	protected FirefoxDriverInstance firefoxDriverInstance;
	
	@Autowired
	protected IEDriverInstance ieDriverInstance;

}
