package com.fakerestapi.apisuites.browser;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import io.github.bonigarcia.wdm.WebDriverManager;

@Component
public class DriverFactory {

	@Autowired
	WebDriverInstance webDriverInstance;

	@Autowired
	BrowserConfig browserConfig;

	public DriverFactory(WebDriverInstance webDriverInstance, BrowserConfig browserConfig) {
		this.webDriverInstance = webDriverInstance;
		this.browserConfig = browserConfig;
	}

	private static final Logger LOGGER = LoggerFactory.getLogger(DriverFactory.class);

	public WebDriverInstance getDriverInstance(String string) {

		try {
			if (string.equalsIgnoreCase("chrome")) {
				webDriverInstance = getChromeDriverInstance();

			} else if (string.equalsIgnoreCase("firefox")) {
				webDriverInstance = getFirefoxDriverInstance();

			} else if (string.equalsIgnoreCase("ie")) {
				webDriverInstance = getIEDriverInstance();

			}
		} catch (Exception e) {
			LOGGER.warn("Driver name is not valid", e);

		}
		return webDriverInstance;

	}

	public WebDriver getWebDriver() {
		return getDriverInstance(browserConfig.getName()).getDriver();
	}

	private WebDriverInstance getChromeDriverInstance() {
		WebDriverManager.chromedriver().setup();
		webDriverInstance = new ChromeDriverInstance();

		return webDriverInstance;
	}

	private WebDriverInstance getFirefoxDriverInstance() {
		WebDriverManager.firefoxdriver().setup();
		webDriverInstance = new FirefoxDriverInstance();

		return webDriverInstance;
	}

	private WebDriverInstance getIEDriverInstance() {
		WebDriverManager.iedriver().setup();
		webDriverInstance = new IEDriverInstance();
		return webDriverInstance;
	}
}
