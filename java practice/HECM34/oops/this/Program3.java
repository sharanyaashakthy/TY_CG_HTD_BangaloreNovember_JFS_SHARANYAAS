//use of "this" keyword

class Calculator 
{
	public int x,y;
	Calculator(int x, int y)
	{
		this.x = x;//mandatory
		this.y = y;//mandatory

	}

	public void sum()
	{
		int x = 100;
		int y = 200;

		//adding object member with local member and storing back in the object

		this.x = this.x+x;//mandatory //110
		this.y = this.y+y;//mandatory //220

	}

	public void disp()
	{
		System.out.println("x = "+x);//optional( if not written, jvm will write as "x = "+this.x;) //110
		System.out.println("y = "+y);//optional ( if not written, jvm will write as "y = "+this.y;) //220
	}

}
class Program3
{
	public static void main(String[] args) 
	{
		Calculator c = new Calculator(10,20);
		c.sum();
		c.disp();
	}
}
