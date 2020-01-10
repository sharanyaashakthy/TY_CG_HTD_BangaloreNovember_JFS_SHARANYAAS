package Exceptionhandling;

public class Marriage 
{
	public void ValidateAge(char gender, int age) 
	{
		if(gender =='m' && age>=21 || gender=='f' && age>=18)
		{
			System.out.println("get ready for marriage");
		}

		else
		{
			//System.out.println("have patience");
			try
			{
				throw new NotEligibleForException("Have patience");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		}
	}

}
