package Exceptionhandling;

public class InterviewMainClass 
{
  public static void main(String[] args)
  {
	  System.out.println("main method started");
	  Interview i= new Interview(false);
	  i.ValidateInterview();
	 // i.ValidateInterview("mock not done");
	  System.out.println("main method ended");
	
  }

}
