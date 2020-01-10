package Exceptionhandling;

public class Exception2
{
	public static void main(String[] args) 
	{
		try
		{
			badmethod();
			System.out.println("A");
		}
		catch(RuntimeException e)
		{
			System.out.println("B");
		}
		catch(Exception e)
		{
			System.out.println("C");
		}
		finally
		{
			System.out.println("D");
		}
		System.out.println("E");
	}
	public static void badmethod()
	{
		throw new RuntimeException();
		
	}
	

}
