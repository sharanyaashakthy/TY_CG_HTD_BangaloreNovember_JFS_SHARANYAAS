public class Car
{
	private String name,color;
	private int price;

	Car(String name, String color, int price)
	{
		this.name = name;
		this.color = color;
		this.price = price;
	}

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

	//setters

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

class Program2 
{
	public static void main(String[] args) 
	{
		Car c1 = new Car("chevrolet", "red",800000);
		System.out.println("Before");
		System.out.println("name = "+c1.getName());
		System.out.println("color = "+c1.getColor());
		System.out.println("price = "+c1.getPrice());
		System.out.println();

		c1.setName("audi");
		c1.setColor("black");
		c1.setPrice(9000000);

		System.out.println("After");
		System.out.println("name = "+c1.getName());
		System.out.println("color = "+c1.getColor());
		System.out.println("price = "+c1.getPrice());


	}
}
