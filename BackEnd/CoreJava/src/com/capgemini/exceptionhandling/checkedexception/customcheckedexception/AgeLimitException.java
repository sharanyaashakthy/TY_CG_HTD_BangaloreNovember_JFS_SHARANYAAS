package com.capgemini.exceptionhandling.checkedexception.customcheckedexception;

public class AgeLimitException extends Exception {
	String msg  = "Age should be above 18";
	public AgeLimitException() {
		
	}
	public AgeLimitException(String msg) {
		super();
		this.msg = msg;
	}
	@Override
	public String getMessage() {
		return this.msg;
	}
	
	

}
