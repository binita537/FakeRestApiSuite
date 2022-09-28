package com.fakerestapi.apisuites.others;

import java.util.Map;


public class UserDataEntry {
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	
	
	public UserDataEntry(String username, String password) {
		
		this.username = username;
		this.password = password;
	}
	
	
	public static UserDataEntry createUserDataEntry(Map<String ,String> entry)
	{
		return new UserDataEntry(entry.get("username"), entry.get("password"));
		
	}
	
	

}
