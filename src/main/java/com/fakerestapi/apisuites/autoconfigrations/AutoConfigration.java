package com.fakerestapi.apisuites.autoconfigrations;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.fakerestapi.apisuites.browser.BrowserConfig;
import com.fakerestapi.apisuites.browser.DriverFactory;
import com.fakerestapi.apisuites.browser.WebDriverInstance;
import com.fakerestapi.apisuites.config.Auth;

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

}
