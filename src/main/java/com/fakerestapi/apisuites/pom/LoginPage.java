package com.fakerestapi.apisuites.pom;

import javax.annotation.PostConstruct;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fakerestapi.apisuites.browser.WebDriverInstance;

@Component
public class LoginPage extends BasePage {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoginPage.class);

	public LoginPage(WebDriverInstance webDriverInstance) {
		super(webDriverInstance);

	}

	

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
	
	
	// Actions methods

		public void login(String userName, String password) {
			commonUIActions.waitUntilAppearAndGetElement(webDriverInstance, LOGIN_SELECTOR).clear();
			commonUIActions.waitUntilAppearAndGetElement(webDriverInstance, LOGIN_SELECTOR).sendKeys(userName);
			commonUIActions.waitUntilAppearAndGetElement(webDriverInstance, PASSWORD_SELECTOR).clear();
			commonUIActions.waitUntilAppearAndGetElement(webDriverInstance, PASSWORD_SELECTOR).sendKeys(password);
			commonUIActions.waitUntilAppearAndGetElement(webDriverInstance, LOGIN_SELECTOR).click();

		}

}
