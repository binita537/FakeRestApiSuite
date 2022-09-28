package com.fakerestapi.apisuites.stepdefinations;


import java.text.SimpleDateFormat;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import com.fakerestapi.apisuites.autoconfigrations.AutoConfigration;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.spring.CucumberContextConfiguration;


@CucumberContextConfiguration
@SpringBootTest(classes = { AutoConfigration.class })
public class Hooks extends BaseStepDefinitions{
	
	//private WebDriver driver ;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Hooks.class);

	private final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	@Before
	public void startSenario(Scenario scenario) throws Exception {


		LOGGER.info("Strting the tets case : '{}'", scenario.getName());
		commonUtils.getDriver().get(auth.getUrl());

		 
	//	driver=driverFactory.getDriverInstance(browserConfig.getName()).getDriver();
	
	}

	

	@After
	public void endScenario(Scenario scenario) {

		LOGGER.info("%s:%s", scenario.getName(), scenario.getLine());
		//commonUtils.getDriver().close();
		
		

		
	}

}
