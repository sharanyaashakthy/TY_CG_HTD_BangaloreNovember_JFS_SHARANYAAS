class Program6 // static variable can be re-assigned anywhere in the program
{

		static int x=0;

	static
	{
		x=10;
		System.out.println("x = "+x);
	}

	{
		 x=20;
		System.out.println("x = "+x);
		
	}

	public static void main(String[] args) 
	{
		 x=30;
		System.out.println("x = "+x);
		Program6 p=new Program6();
		p.m1();
	}

	public void m1()
	{
		x=40;
		System.out.println("x = "+x);

	}
	


}


