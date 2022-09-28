package com.fakerestapi.apisuites.autoconfigrations;

import org.openqa.selenium.WebDriver;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.fakerestapi.apisuites.browser.BrowserConfig;
import com.fakerestapi.apisuites.browser.DriverFactory;
import com.fakerestapi.apisuites.browser.WebDriverInstance;
import com.fakerestapi.apisuites.config.Auth;
import com.fakerestapi.apisuites.utils.CommonUIActions;
import com.fakerestapi.apisuites.utils.CommonUtils;

@Configuration
@EnableConfigurationProperties
@ComponentScan
public class AutoConfigration {

	@Bean
	public BrowserConfig browserConfig() {
		return new BrowserConfig();
	}

	@Bean
	public WebDriverInstance webDriverInstance() {
		return new WebDriverInstance();
	}

	@Bean
	public DriverFactory driverFactory(WebDriverInstance webDriverInstance, BrowserConfig browserConfig) {
		return new DriverFactory(webDriverInstance, browserConfig);

	}

	@Bean
	public Auth auth() {
		return new Auth();
	}

	@Bean
	public CommonUIActions commonUIActions(WebDriverInstance webDriverInstance) {
		return new CommonUIActions(webDriverInstance);
	}

	@Bean
	public CommonUtils commonUtils(WebDriverInstance webDriverInstance) {
		return new CommonUtils(webDriverInstance);
	}
}
