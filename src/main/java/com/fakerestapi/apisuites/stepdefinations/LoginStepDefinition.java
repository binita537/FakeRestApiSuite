package com.fakerestapi.apisuites.stepdefinations;

import io.cucumber.java8.En;

public class LoginStepDefinition extends BaseStepDefinitions implements En{
	
	
	public LoginStepDefinition()
	{
		Given("user navigate to the login page", () -> {
			
		
		driverFactory.getDriverInstance(browserConfig.getName()).getDriver().get(auth.getUrl());
		
		});

		/*
		 * When("user enter valid {username} and {password}", (String username, String
		 * password) -> {
		 * 
		 * });
		 * 
		 * Then("user is successfully logged in", () -> {
		 * 
		 * });
		 */

	}

}
