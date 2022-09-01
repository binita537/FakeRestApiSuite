package com.fakerestapi.apisuites;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.fakerestapi.apisuites.autoconfigrations.AutoConfigration;
import com.fakerestapi.apisuites.browser.BrowserType;
import com.fakerestapi.apisuites.stepdefinations.BaseStepDefinitions;

@SpringBootTest(classes = {AutoConfigration.class})
class FakerestapiApplicationTests extends BaseStepDefinitions {

	@Test
	void contextLoads() {
		
	System.out.println("its my API applicatoion ");
	driverFactory.getDriverInstance(BrowserType.CHROME).getDriver().get("https://google.com");
	
	}

}
