package com.fakerestapi.apisuites.browser;

import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

@Component
public class WebDriverInstance extends AbstarctWebDriverInstance {

	protected WebDriver driver;

	public void quit() {
		if (driver != null) {
			driver.close();
			driver.quit();

			driver = null;

		}
	}

	public WebDriver getDriver() {
		return this.driver;
	}

}
