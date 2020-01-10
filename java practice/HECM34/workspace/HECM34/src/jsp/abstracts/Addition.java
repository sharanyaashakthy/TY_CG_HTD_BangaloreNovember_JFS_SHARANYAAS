package jsp.abstracts;

public class Addition extends Calculator
{

	public Addition(int x, int y)
	{
		super(x,y);
		
	}
	public void add()
	{
		System.out.println("sum = "+(x+y));
		
	}
	

}
