package jsp.abstracts;

abstract public class F extends E
{
	double y = 12.78;
	public void print()
	{
		System.out.println("in print() method");
	}
	abstract void print(int b, int c);
}