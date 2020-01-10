class Program2 
{
	public static void main(String[] args) 
	{
		System.out.println("find odd or even number using modular programming");
		int num=10;
		System.out.println("The number is "+num);
		boolean res=isoddeven(num);
		if(res==true)
		{
			System.out.println(num+" is an even number");
		}
		else
		{
			System.out.println(num+" is an odd number");
		}

	}

	public static boolean isoddeven(int num)
	{
		if(num%2==0)
		{
			boolean res=true;
			return res;
		}
		else
		{
			boolean res=false;
			return res;
		}
	}
				  
}
