 class  Mobile
{
	String name;
	String colour;
	long price;

	Mobile(String name, String colour, long price)
	{
		this.name=name;
		this.colour=colour;
		this.price=price;	
	}

	Mobile(String name, String colour, int price)
	{
		this.name=name;
		this.colour=colour;
		this.price=price;	
	}

	Mobile(String name, String colour)
	{
		this.name=name;
		this.colour=colour;	
	}
	
}

class Program6
{
	public static void main(String[] args) 
	{
		Mobile m1= new Mobile("Motorola","black", 80000);
		Mobile m2= new Mobile("Redmi","red", 80000);
		Mobile m3= new Mobile("Apple","white");
		

		

		

		System.out.println("MOBILE DETAILS");
		System.out.println("-------------------------------");
		System.out.println("Name = "+m1.name);
		System.out.println("colour = "+m1.colour);
		System.out.println("price = "+m1.price);
		System.out.println();

		System.out.println("Name = "+m2.name);
		System.out.println("colour = "+m2.colour);
		System.out.println("price = "+m2.price);
		System.out.println();

		System.out.println("Name = "+m3.name);
		System.out.println("colour = "+m3.colour);
		System.out.println();

		



	}
}
