package com.fakerestapi.apisuites.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

	private static final Logger LOGGER = LoggerFactory.getLogger(LoginPage.class);

	

	@Override
	public boolean isPageLoaded() {
		return false;

	}

	// Loactors and selectors for element

	private static final String USERNAME_LOCATOR = "//input[@id='txtUsername']";
	private static final String PASSWORD_LOCATOR = "//input[@id='txtPassword']";
	private static final String LOGIN_LOCATOR = "//input[@id='btnLogin']";

	private static final By USERNAME_SELECTOR = By.xpath(USERNAME_LOCATOR);
	private static final By PASSWORD_SELECTOR = By.xpath(PASSWORD_LOCATOR);
	private static final By LOGIN_SELECTOR = By.xpath(LOGIN_LOCATOR);
	
	

}
