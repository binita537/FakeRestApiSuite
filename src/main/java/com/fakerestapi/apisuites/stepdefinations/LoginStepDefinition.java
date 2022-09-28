package com.fakerestapi.apisuites.stepdefinations;

import com.fakerestapi.apisuites.others.Result;

import io.cucumber.java8.En;

public class LoginStepDefinition extends BaseStepDefinitions implements En{
	
	
	
	public LoginStepDefinition()
	{
		Given("user navigate to the login page", () -> {
			
		System.out.println("tttttttttttttt");
		//driverFactory.getDriverInstance(browserConfig.getName()).getDriver().get(auth.getUrl());
						//loginPage.login(auth.getUsername(),auth.getPassword());
			
			
		
		});

		
		  When("user enter valid {username} and {password}", (String username, String
		  password) -> {
		 
		  });
		  
		  Then("user is successfully logged in", () -> {
		  
		  });
		 
		
		Then("Then check credentails are {resultType}",(Result resultType)->
		{
			
		});
		

	}

}
