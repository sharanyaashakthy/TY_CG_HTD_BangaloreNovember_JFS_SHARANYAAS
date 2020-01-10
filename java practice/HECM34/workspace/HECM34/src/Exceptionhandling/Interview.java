package Exceptionhandling;

public class Interview 
{
	private boolean isMockdone;
	public Interview(boolean isMockdone)
	{
		this.isMockdone= isMockdone;
	}
	public void ValidateInterview()
	{
		if(isMockdone==true)
		{
			System.out.println("Eligible for interview");
			
		}
		else
		{
			try
			{
				throw new NotEligibleForInterviewException("Mock is not done and so, not elgible for Interview");
				
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
			
	}
}
