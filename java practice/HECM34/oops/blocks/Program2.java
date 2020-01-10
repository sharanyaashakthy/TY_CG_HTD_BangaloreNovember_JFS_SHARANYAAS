class Test   //static and non-static blocks inside two different classes 
{
	static 
	{
		System.out.println("running static block of test class");
	}

	{
		System.out.println("running non-static block of test class");
	}
}

class Program2
{
	
		static
		{
			System.out.println("running static block of program2 class");
		}

		{
			System.out.println("running non-static block of test class");//it wont be printed bcos, the object for Program2 class is not created
		}

		public static void main(String[] args)
		{
	
		System.out.println("main method started");
		new Test();
		System.out.println("main method ended");
		}
}
