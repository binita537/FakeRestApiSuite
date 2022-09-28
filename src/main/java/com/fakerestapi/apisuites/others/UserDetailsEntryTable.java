package com.fakerestapi.apisuites.others;

import java.util.List;

import lombok.Getter;
import lombok.ToString;


public class UserDetailsEntryTable {

	private List<UserDataEntry> entries;

	public UserDetailsEntryTable() {

	}

	public UserDetailsEntryTable(List<UserDataEntry> entries) {
		this.entries = entries;
	}

	public List<UserDataEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<UserDataEntry> entries) {
		this.entries = entries;
	}
     
}
