package com.fakerestapi.apisuites.stepdefinations;

import org.springframework.beans.factory.annotation.Autowired;

import com.fakerestapi.apisuites.browser.AbstarctWebDriverInstance;
import com.fakerestapi.apisuites.browser.BrowserConfig;
import com.fakerestapi.apisuites.browser.ChromeDriverInstance;
import com.fakerestapi.apisuites.browser.DriverFactory;
import com.fakerestapi.apisuites.browser.FirefoxDriverInstance;
import com.fakerestapi.apisuites.browser.IEDriverInstance;
import com.fakerestapi.apisuites.browser.WebDriverInstance;

public class BaseStepDefinitions {

	@Autowired
	protected WebDriverInstance webDriverInstance;

	@Autowired
	protected DriverFactory driverFactory;

	@Autowired
	protected BrowserConfig browserConfig;

}
