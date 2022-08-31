package com.fakerestapi.apisuites.browser;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

import lombok.Getter;


@Getter
@Component
public class AbstarctWebDriverInstance {
	
	protected WebDriverWait webDriverWait;
	protected JavascriptExecutor javascriptExecutor;

}
