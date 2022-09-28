package com.fakerestapi.apisuites.others;

import java.util.Arrays;
import java.util.Optional;



public enum Result {
	VALID("valid"), INVALID("invalid");

	private String msg;

	Result(String msg) {

		this.msg = msg;
	}

	public String getMsg() {
		return this.msg;
	}

	public static Result getListOfREsult(String str) {
		
    Optional<Result> result= Arrays.asList(Result.values()).stream().filter(mg->mg.getMsg().equalsIgnoreCase(str)).findFirst();
	return result.orElse(null);
	}

	public static Result getResultName(String s)
	{
		return Arrays.stream(Result.values())
				.filter(rt->rt.msg.contains(s))
				.findFirst()
				.orElse(null);
	}




}
