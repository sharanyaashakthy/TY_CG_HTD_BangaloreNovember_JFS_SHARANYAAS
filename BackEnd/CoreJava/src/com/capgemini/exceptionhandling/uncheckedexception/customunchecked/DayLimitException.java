package com.capgemini.exceptionhandling.uncheckedexception.customunchecked;


//custom unchecked exception
public class DayLimitException extends RuntimeException {
	String msg;

	
	public DayLimitException() {
		super();
	}
	public DayLimitException(String msg) {
		super();
		this.msg = msg;
	}
	
	public String getMessage()
	{
		return msg;
	}
	
	

}
