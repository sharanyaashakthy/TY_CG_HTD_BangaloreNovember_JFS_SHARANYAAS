class Program3 
{
	public static void main(String[] args) 
	{
		Countdigit.digit(43);
	}
}
class Countdigit
{
	public static void digit(int num)
	{
		if(num>=1&&num<=9)
		{
			System.out.println(num+ " is a single digit number");
		}
		else if(num>=10&&num<=99)
		{
			System.out.println(num+ " is a double digit number");
		}
		else if(num>=100&&num<=999)
		{
			System.out.println(num+ " is a triple digit number");
		}
		else
		{
			System.out.println(num+ " is a multiple digit number");
		}

	}
}
