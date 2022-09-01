package com.fakerestapi.apisuites.browser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import io.github.bonigarcia.wdm.WebDriverManager;

@Component
public class DriverFactory {

	WebDriverInstance webDriverInstance=null;

	private static final Logger LOGGER = LoggerFactory.getLogger(DriverFactory.class);

	public WebDriverInstance getDriverInstance(BrowserType browserType) {

		try {
			if (browserType.equals(BrowserType.CHROME)) {
				return getChromeDriverInstance();

			} else if (browserType.equals(BrowserType.FIREFOX)) {
				return getFirefoxDriverInstance();

			} else if (browserType.equals(BrowserType.IE)) {
				return getIEDriverInstance();

			}
		} catch (Exception e) {
			LOGGER.warn("Driver name is not valid", e);

		}
		return webDriverInstance;

	}

	private WebDriverInstance getIEDriverInstance() {
		WebDriverManager.chromedriver().setup();
		webDriverInstance = new ChromeDriverInstance();

		return webDriverInstance;
	}

	private WebDriverInstance getFirefoxDriverInstance() {
		WebDriverManager.firefoxdriver().setup();
		webDriverInstance = new FirefoxDriverInstance();

		return webDriverInstance;
	}

	private WebDriverInstance getChromeDriverInstance() {
		WebDriverManager.iedriver().setup();
		webDriverInstance = new IEDriverInstance();
		return webDriverInstance;
	}
}
