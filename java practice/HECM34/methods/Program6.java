class Program6 
{
	public static void main(String[] args) 
	{
		System.out.println("biggest of two numbers");//by directly passing the arguments
		   int res=biggestoftwonum(30,20);
	}
	public static int biggestoftwonum(int x,int y)
	{
		if(x>y)
		{   
			int res=100;
			System.out.println(x+" is bigger than "+y);
			return res;
			
		}
		else if(x<y)
		{
			int res=-100;
			System.out.println(x+" is lesser than "+y);
			return res;
			
		}
		else
		{
			int res=0;
			System.out.println(x+" is equal to "+y);
			return res;
		}
		
	}
}
