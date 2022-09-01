package com.fakerestapi.apisuites.browser;


public enum BrowserType {
	
	CHROME,FIREFOX,IE;

	public static String valueOf(BrowserType browserType) {
		return browserType.toString();
	}

}
