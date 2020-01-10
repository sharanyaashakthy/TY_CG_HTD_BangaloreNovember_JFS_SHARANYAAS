package Exceptionhandling;

public class NotEligibleForException extends Exception 
{
	private String msg;
	public NotEligibleForException(String msg)
	{
		this.msg=msg;
		
	}
	//@override
	public String getMessage() 
	{
		return msg;
		
	}
	
	

	

}
