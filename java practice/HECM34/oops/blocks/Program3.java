class Program3 //To analyze the use of static and non-static DM inside both the blocks 
{
	public static int x=10;
	int y=20;

	static
	{
		x=100;
		System.out.println("x= "+x);
		//y=200; will produce error bcos y is non-static which cant be refered from a static context

	}

	{
		x=1000;
		System.out.println("x= "+x);
		y=2000;
		System.out.println("y= "+y);
	}

	public static void main(String[] args) 
	{
		System.out.println("main method started");
		System.out.println("x = "+Program3.x);
		Program3 p=new Program3();
		System.out.println("x = "+p.x); or (Program3.x) \\ a copy of static member will also be there in heap area
		System.out.println("y = "+p.y);
		System.out.println("main method ended");

	}
}
