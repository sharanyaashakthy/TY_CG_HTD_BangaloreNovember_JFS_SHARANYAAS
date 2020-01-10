class Program4 //To show that all the values of x are local to the respective blocks and methods
{

	
		int x=0;

	static
	{
		int x=10;
		System.out.println("x = "+x);
	}

	{
		int x=20;
		System.out.println("x = "+x);
		
	}

	public static void main(String[] args) 
	{
		int x=30;
		System.out.println("x = "+x);
		Program4 p=new Program4();
		p.m2();
	}

	public void m2()
	{
		int x=40;
		System.out.println("x = "+x);

	}
	


}
