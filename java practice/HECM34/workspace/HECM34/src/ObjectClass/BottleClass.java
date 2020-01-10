package ObjectClass;

public class BottleClass
{
	public static void main(String[] args) 
	{
		Bottle b1= new Bottle("Apple juice", 2);
		Bottle b2= new Bottle("Orange juice", 2);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1.equals(b2));
		if(b1.equals(b2))
		{
			System.out.println("same flavour");
		}
		else
		{
			System.out.println("Different flavour");
		}
		
		
	}


}
