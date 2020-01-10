class Program4 
{
	public static void main(String[] args) 
	{
		Colour.checkcolour("ReD");
	}
}
class Colour
{
	public static void checkcolour(String clr)
	{
		if(clr.equalsIgnoreCase("blue"))//string must be compared using equals method and is the right way of checking(clr=="blue" is wrong)
		{
			System.out.println("it is blue colour");
		}
		else if(clr.equalsIgnoreCase("red"))
		{
			System.out.println("it is red colour");
		}
		else
		{
			System.out.println("none");
		}

	}
}
