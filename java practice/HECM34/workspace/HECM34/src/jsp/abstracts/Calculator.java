package jsp.abstracts;

abstract public class Calculator
{
	int x,y;
	public Calculator(int x, int y) 
	{
		this.x= x;
		this.y = y;
		
	}
	abstract void add();

}
