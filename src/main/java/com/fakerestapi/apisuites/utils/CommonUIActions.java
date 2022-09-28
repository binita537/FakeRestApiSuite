package com.fakerestapi.apisuites.utils;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fakerestapi.apisuites.browser.AbstarctWebDriverInstance;
import com.fakerestapi.apisuites.browser.WebDriverInstance;

//Why we created this class ? if in fucture some mobile application and if we want to write a MobileUiAction then we can extends this class

@Component
public  class CommonUIActions {

	
	private WebDriver driver;
	
	
	@Autowired
	private CommonUtils commonUtils;
	
	@Autowired
	protected WebDriverInstance webDriverInstance;
   
	private static final Logger LOGGER = LoggerFactory.getLogger(CommonUIActions.class);

	public CommonUIActions(WebDriverInstance webDriverInstance) {

		this.webDriverInstance=webDriverInstance;
		this.driver = webDriverInstance.getDriver();

	}

	public boolean isElementClicked(WebDriverInstance webDriverInstance, WebElement WebElement) {
		boolean clicked = false;
		try {

			webDriverInstance.getWebDriverWait().until(ExpectedConditions.elementToBeClickable(WebElement))
					.click();
			clicked = true;

		} catch (Exception e) {
			LOGGER.debug("Unable to click element : <{}> . exception ", WebElement, e);
		}

		return clicked;

	}

	public boolean isElementClicked(AbstarctWebDriverInstance abstarctWebDriverInstance, By by) {
		boolean clicked = false;
		try {
			abstarctWebDriverInstance.getWebDriverWait().until(ExpectedConditions.elementToBeClickable(by)).click();
			clicked = true;

		} catch (Exception e) {
			LOGGER.debug("Unable to click element : <{}> . exception ", by, e);
		}

		return clicked;

	}

	public WebElement waitUntilElementToBeClickable(AbstarctWebDriverInstance abstarctWebDriverInstance,
			WebElement webElement) {
		WebElement webElemet = null;
		try {
			webElemet = abstarctWebDriverInstance.getWebDriverWait()
					.until(ExpectedConditions.elementToBeClickable(webElement));

		} catch (Exception e) {
			LOGGER.debug("Unable to click element : <{}> . exception ", webElement, e);
		}

		return webElemet;

	}

	public WebElement waitUntilElementToBeClickable(AbstarctWebDriverInstance abstarctWebDriverInstance, By by) {
		WebElement webElemet = null;
		try {
			webElemet = abstarctWebDriverInstance.getWebDriverWait().until(ExpectedConditions.elementToBeClickable(by));

		} catch (Exception e) {
			LOGGER.debug("Unable to click element : <{}> . exception ", by, e);
		}

		return webElemet;

	}

	public WebElement waitUntilAppearAndGetElement(AbstarctWebDriverInstance abstarctWebDriverInstance, By by) {
		WebElement webElemet = null;
		try {
			webElemet = abstarctWebDriverInstance.getWebDriverWait()
					.until(ExpectedConditions.visibilityOfElementLocated(by));

		} catch (Exception e) {
			LOGGER.debug(" Element is not appear: <{}> . exception ", by, e);
		}

		return webElemet;

	}

	public List waitUntilAppearAndGetElements(AbstarctWebDriverInstance abstarctWebDriverInstance, By by) {
		List webElemets = Collections.emptyList();
		try {
			webElemets = abstarctWebDriverInstance.getWebDriverWait()
					.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));

		} catch (Exception e) {
			LOGGER.debug(" Elements is not appear: <{}> . exception ", by, e);
		}

		return webElemets;

	}

	public WebElement waitUntilPreseneceAndGetElement(AbstarctWebDriverInstance abstarctWebDriverInstance, By by) {
		WebElement webElemet = null;
		try {
			webElemet = abstarctWebDriverInstance.getWebDriverWait()
					.until(ExpectedConditions.presenceOfElementLocated(by));

		} catch (Exception e) {
			LOGGER.debug(" Elements is not appear: <{}> . exception ", by, e);
		}

		return webElemet;

	}

	public List waitUntilPresenceAndAllGetElements(AbstarctWebDriverInstance abstarctWebDriverInstance, By by) {
		List webElemets = Collections.emptyList();
		try {
			webElemets = abstarctWebDriverInstance.getWebDriverWait()
					.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));

		} catch (Exception e) {
			LOGGER.debug(" Elements is not appear: <{}> . exception ", by, e);
		}

		return webElemets;

	}

}
