package com.fakerestapi.apisuites.runner;


import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/main/resources/features/Login/login.feature",
		glue = { "com.fakerestapi.apisuites.stepdefinations" },
		plugin = {
				"pretty", "html:target/report/CucucmberReport.html",
				          "json:target/report/JsonReport.json",
				          "html:target/report/junitReport.xml" }
	 

)
public class ITSuiteRunner {

}
