class  Books
{
	String name;
	double price;
	String author;

	Books(String name, double price)
	{
		this.name=name;
		this.price=price;	
	}

	Books(String name, double price, String author)
	{
		this.name=name;
		this.price=price;
		this.author=author;
	}

	Books(String name, int price)
	{
		this.name=name;
		this.price=price;	
	}
	
}

class Program7
{
	public static void main(String[] args) 
	{
		Books b1= new Books("The man who sold the Ferrari", 800.89);
		Books b2= new Books("Sound of success", 700.567, "Ram");
		Books b3= new Books("The Wings of fire", 1000, "Dr.APJ.Abdul kalam");

		

		

		System.out.println("BOOKS DETAILS");
		System.out.println("-------------------------------");
		System.out.println("Name = "+b1.name);
		//System.out.println("colour = "+m1.colour);
		System.out.println("price = "+b1.price);
		System.out.println();

		System.out.println("Name = "+b2.name);
		System.out.println("author = "+b2.author);
		System.out.println("price = "+b2.price);
		System.out.println();

		System.out.println("Name = "+b3.name);
		System.out.println("price = "+b3.price);
		System.out.println();

		



	}
}
