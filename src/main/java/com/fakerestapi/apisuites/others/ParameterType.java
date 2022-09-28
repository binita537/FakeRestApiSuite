package com.fakerestapi.apisuites.others;

import java.util.List;
import java.util.stream.Collectors;

import com.beust.jcommander.Parameter;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;

public class ParameterType {
	
	@DataTableType
	public  UserDetailsEntryTable userDataEntry(DataTable dataTable)
	{
		List<UserDataEntry> dataEntries= dataTable.asMaps().stream().map(UserDataEntry::createUserDataEntry).collect(Collectors.toList());
		return new UserDetailsEntryTable(dataEntries);
		
	}
	
	@Parameter
	public Result resultType(String s)
	{
		return Result.getResultName(s);
	}
	
	

} 
