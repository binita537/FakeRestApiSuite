package com.fakerestapi.apisuites.pom;

import javax.annotation.PostConstruct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fakerestapi.apisuites.browser.WebDriverInstance;
import com.fakerestapi.apisuites.utils.CommonUIActions;

@Component
public abstract class BasePage {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoginPage.class);

	protected WebDriver driver;
	protected WebDriverInstance webDriverInstance;

	@Autowired
	protected CommonUIActions commonUIActions;

	public BasePage(WebDriverInstance webDriverInstance) {
		this.webDriverInstance = webDriverInstance;
		this.driver = webDriverInstance.getDriver();

	}
	
	@PostConstruct
	private void init() {
		PageFactory.initElements(this.driver, this);
	}

	public abstract boolean isPageLoaded();

}
