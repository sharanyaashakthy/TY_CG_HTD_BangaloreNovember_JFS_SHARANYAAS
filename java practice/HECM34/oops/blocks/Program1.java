class Program1 //static and non-static blocks inside a single class
{
	static
	{
		System.out.println("static block is running");
	}

	{
		System.out.println("non static block is running");
	}

	public static void main(String[] args) 
	{
		System.out.println("main method started");
		new Program1();
		new Program1();
		new Program1();
		System.out.println("main method ended");
	}
}
