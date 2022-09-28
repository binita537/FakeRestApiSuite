package com.fakerestapi.apisuites.stepdefinations;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fakerestapi.apisuites.autoconfigrations.AutoConfigration;
import com.fakerestapi.apisuites.browser.BrowserConfig;
import com.fakerestapi.apisuites.browser.DriverFactory;
import com.fakerestapi.apisuites.browser.WebDriverInstance;
import com.fakerestapi.apisuites.config.Auth;
import com.fakerestapi.apisuites.pom.LoginPage;
import com.fakerestapi.apisuites.utils.CommonUIActions;
import com.fakerestapi.apisuites.utils.CommonUtils;


@SpringBootTest(classes = { AutoConfigration.class })
public abstract class BaseStepDefinitions {

	

	@Autowired
	Auth auth;
	
	@Autowired
	BrowserConfig browserConfig;
	
	@Autowired
	WebDriverInstance webDriverInstance;

	@Autowired
	DriverFactory driverFactory;
	
	
	@Autowired
	CommonUIActions commonUIActions;
	
	@Autowired
	CommonUtils commonUtils;
	
	
	
	
}
