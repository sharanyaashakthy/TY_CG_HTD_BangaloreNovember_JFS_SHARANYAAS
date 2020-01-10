class  Demo
{
	public int x=10;
	public double y=10.11;
}
class Program7
{
	public static void main(String[] args)
	{


	Demo d1=new Demo();
	Demo d2=d1;
	Demo d3=d2;
	//Demo d2=new Demo();
	//Demo d3=new Demo();

	System.out.println("x = "+d1.x);
	System.out.println("x = "+d2.x);
	System.out.println("x = "+d3.x);

	System.out.println("y = "+d1.y);
	System.out.println("y = "+d2.y);
	System.out.println("y = "+d3.y);

	d1.x=100;
	d1.y=100.11;

	d2.x=1000;
	d2.y=1000.11;

	d3.x=10000;
	d3.y=10000.11;


	System.out.println("x = "+d1.x);
	System.out.println("x = "+d2.x);
	System.out.println("x = "+d3.x);

	System.out.println("y = "+d1.y);
	System.out.println("y = "+d2.y);
	System.out.println("y = "+d3.y);

	//d1=d2;
	//d2=d3;

	System.out.println("x = "+d1.x);
	System.out.println("x = "+d2.x);
	System.out.println("x = "+d3.x);

	System.out.println("y = "+d1.y);
	System.out.println("y = "+d2.y);
	System.out.println("y = "+d3.y);


	}
}