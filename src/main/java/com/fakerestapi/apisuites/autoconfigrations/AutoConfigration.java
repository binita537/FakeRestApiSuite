package com.fakerestapi.apisuites.autoconfigrations;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.fakerestapi.apisuites.browser.BrowserConfig;
import com.fakerestapi.apisuites.browser.DriverFactory;
import com.fakerestapi.apisuites.browser.WebDriverInstance;


@EnableAutoConfiguration
@ComponentScan
public class AutoConfigration {

	@Bean
	public DriverFactory driverFactory(WebDriverInstance driverInstance) {
		return new DriverFactory();

	}

	@Bean
	public BrowserConfig browserConfig() {
		return new BrowserConfig();
	}

}
