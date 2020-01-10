class Program6 
{
	public static void main(String[] args) 
	{
		System.out.println("Re-assignment of variables");

		//declaration+assignment of variables for the first time
		int x=10;
		double y=67.8979;
		System.out.println("x = "+x);
		System.out.println("y = "+y);

		//Re-assignment of the same variables for the second time
		x=100;
		y=670.8979;
		System.out.println("x = "+x);
		System.out.println("y = "+y);

		//Re-declaration of the same variables will produce error as, variable x&y already defined in method main(String[])
		//int x=209;
		//double y=38.89;
	



	}
}
