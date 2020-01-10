class Program2 
{
	public static void main(String[] args) 
	{
		Oddeven.isoddeven(43);

		Large.biggestoftwonum(32,76);
	}
}
class Oddeven
{
	public static void isoddeven(int num)
	{
	
		if(num%2==0)
		{
			System.out.println(num+" is an even number");
			
		}
		else
		{
			System.out.println(num+" is an odd number");
		

		}
	}
}
class Large
{
	public static void  biggestoftwonum(int x, int y) 
	{
		if(x>y)
		{
			System.out.println(x+ " is bigger than "+y);
		}
		else if(x<y)
		{
			System.out.println(x+ " is lesser than "+y);
		}
		else
		{
			System.out.println(x+ " is equal to "+y);
		}
	}

}