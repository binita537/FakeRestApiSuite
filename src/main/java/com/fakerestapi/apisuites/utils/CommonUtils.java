package com.fakerestapi.apisuites.utils;

import java.io.File

;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fakerestapi.apisuites.browser.BrowserConfig;
import com.fakerestapi.apisuites.browser.DriverFactory;
import com.fakerestapi.apisuites.browser.WebDriverInstance;

@Component
public class CommonUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(CommonUtils.class);

	
	@Autowired
	public BrowserConfig browserConfig;

	@Autowired
	protected DriverFactory driverFactory;

	@Autowired
	protected WebDriverInstance webDriverInstance;

	public CommonUtils(WebDriverInstance webDriverInstance) {

		this.webDriverInstance = webDriverInstance;
		//this.driver = webDriverInstance.getDriver();
	}

	public WebDriver getDriver() {
		return driverFactory.getWebDriver();

	}

	public WebDriverInstance getWenDriverInstanceForUSer() {
		try {
			webDriverInstance = driverFactory.getDriverInstance(browserConfig.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return webDriverInstance;
	}

	public void saveWebDriverInstance() {
		// here code to save webdriver instance in to one space
	}

	public void cleanWebDriverInstance() {
		// here code to clean webdriver instance
	}

	public File takeScreenshotInFile(WebDriver driver, String filepath) {

		TakesScreenshot screenshot = ((TakesScreenshot) driver);
		return screenshot.getScreenshotAs(OutputType.FILE);

//		String FilePath=System.getProperty("user.dir")+"Screenshot"+scenario.getName()
//
//		File destinationFile = new File(filepath);
//		try {
//			FileUtils.copyFile(originalFile, destinationFile);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

	}

}
