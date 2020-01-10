class  Car
{
	String name;
	String colour;
	long price;

	Car(String name, String colour, long price)
	{
		this.name=name;//"this" can be used to access the attributes that has the same name inside the constructor and in the declaration part of its class
		this.colour=colour;
		this.price=price;
	}
	
}

class Program5
{
	public static void main(String[] args) 
	{
		Car c1= new Car("Indigo","black", 780000);
		Car c2= new Car("Chevrolet","red", 880000);
		Car c3= new Car("swift","white", 1080000);
		

		

		

		System.out.println("CAR DETAILS");
		System.out.println("-------------------------------");
		System.out.println("Name = "+c1.name);
		System.out.println("colour = "+c1.colour);
		System.out.println("price = "+c1.price);
		System.out.println();

		System.out.println("Name = "+c2.name);
		System.out.println("colour = "+c2.colour);
		System.out.println("price = "+c2.price);
		System.out.println();

		System.out.println("Name = "+c3.name);
		System.out.println("colour = "+c3.colour);
		System.out.println("price = "+c3.price);
		System.out.println();

		



	}
}
