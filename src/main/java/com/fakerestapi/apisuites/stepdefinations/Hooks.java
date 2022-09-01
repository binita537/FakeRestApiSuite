package com.fakerestapi.apisuites.stepdefinations;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fakerestapi.apisuites.browser.BrowserType;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseStepDefinitions{
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Hooks.class);

	private final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	@Before
	public void startSenario(Scenario scenario) throws Exception {

		String testcaseName = String.format("%s:%s", scenario.getName().replace(" ", "_"), scenario.getLine());

		LOGGER.info("Strting the tets case : '{}'", scenario.getName());
		System.out.println(
				String.format("[%s] string tets case :%s ", dateFormat.format(new Date()), scenario.getName()));

		 
	//driverFactory.getDriverInstance(BrowserType.CHROME).getDriver().get("");
	
	}

	

	@After
	public void endScenario(Scenario scenario) {

		LOGGER.info("%s:%s", scenario.getName(), scenario.getLine());

		webDriverInstance.getDriver().close();

	}

}
