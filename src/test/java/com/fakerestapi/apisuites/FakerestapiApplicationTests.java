package com.fakerestapi.apisuites;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fakerestapi.apisuites.autoconfigrations.AutoConfigration;
import com.fakerestapi.apisuites.browser.BrowserConfig;
import com.fakerestapi.apisuites.browser.DriverFactory;
import com.fakerestapi.apisuites.browser.WebDriverInstance;
import com.fakerestapi.apisuites.config.Auth;

@SpringBootTest(classes = { AutoConfigration.class })
class FakerestapiApplicationTests {

	@Autowired
	Auth auth;
	
	@Autowired
	WebDriverInstance webDriverInstance;

	@Autowired
	DriverFactory driverFactory;

	@Autowired
	BrowserConfig browserConfig;

	@Test
	void contextLoads() {

		driverFactory.getDriverInstance(browserConfig.getName()).getDriver().get(auth.getUrl());

		System.out.println(auth.getUsername() + "" + auth.getPassword() + "" + auth.getUrl());
		System.out.println(browserConfig.getName());

		// driverFactory.getDriverInstance(browserConfig.getName()).getDriver().get("https://opensource-demo.orangehrmlive.com");
	}

}
