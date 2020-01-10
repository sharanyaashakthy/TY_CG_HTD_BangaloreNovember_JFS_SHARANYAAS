package ObjectClass;

public class WatchDemo
{
	public static void main(String[] args) 
	{
		Watch w1= new Watch(12,43,32);
		Watch w2= new Watch(12,43,32);
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w1.equals(w2));//true
		if(w1.equals(w2))
		{
			System.out.println("Time is same");
		}
		else
		{
			System.out.println("Time is not same");
		}
		
		
	}

}
