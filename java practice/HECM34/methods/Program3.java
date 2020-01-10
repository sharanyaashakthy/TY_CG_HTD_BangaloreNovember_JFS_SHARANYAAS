class Program3  
{
	public static void main(String[] args) 
	{
		System.out.println("Biggest of two numbers using modular programming");
		int x=30,y=20;
		    int res=biggestnumber(x,y);
		if(res==1)
		{
			System.out.println(x+ " is bigger than "+y);
		}
		else if(res==-1)
		{
			System.out.println(x+ " is lesser"+y);
		}	
		else
		{ System.out.println(x+ " is equal to " +y);}}
	public static int biggestnumber(int x, int y)
	{
		if(x>y)
		{
			int res=1;
			return res;
		}
		else if(x<y)
		{
			int res=-1;
			return res;
		}
		else
		{
			int res=0;
			return res;
		}
	}
	}
