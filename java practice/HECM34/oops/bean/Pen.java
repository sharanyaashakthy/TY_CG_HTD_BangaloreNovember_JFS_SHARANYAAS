//example for java bean class on pen 
public class Pen //this class must be declared as public in java bean class and the source file name must be saved with this name as it is public
{
	private String name;//private data members
	private String color;
	private int price;

	public Pen(String name, String color, int price)//contructor
	{
		this.name = name;
		this.color = color;
		this.price = price;
	}

	//getters-all the methods must be public

	public String getName()
	{
		return name;
	}

	public String getColor()
	{
		return color;
	}

	public int getPrice()
	{
		return price;
	}


	//setters-all the methods must be public
	public void setName(String name)
	{
		this.name = name;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
}

class Program1 
{
	public static void main(String[] args) 
	{
		
		Pen p1= new Pen("Renault","black",10);//passing arguments to the constructor

		System.out.println("Before");
		System.out.println("name = "+p1.getName());//accessing the private d.m through the public methods
		System.out.println("color = "+p1.getColor());
		System.out.println("price = "+p1.getPrice());
		System.out.println();

		p1.setName("cello");//re-assigning the values of get method
		p1.setColor("blue");
		p1.setPrice(20);

		System.out.println("After");
		System.out.println("name = "+p1.getName());//accessing the changed values
		System.out.println("color = "+p1.getColor());
		System.out.println("price = "+p1.getPrice());


	}
}
