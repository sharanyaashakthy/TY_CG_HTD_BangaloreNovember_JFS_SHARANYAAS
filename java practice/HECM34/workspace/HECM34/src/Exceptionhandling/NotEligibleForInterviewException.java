package Exceptionhandling;

public class NotEligibleForInterviewException extends RuntimeException
{
	private String msg;
	public NotEligibleForInterviewException(String msg) 
	{
		this.msg=msg;
		
	}
	//override
	public String getMessage()
	{
		return msg;
	}

}
