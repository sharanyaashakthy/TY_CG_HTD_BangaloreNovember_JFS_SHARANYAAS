public class Bottle
{
	private String name;
	private String color;
	private int price;

	public Bottle(String name, String color, int price)
	{
		this.name = name;
		this.color = color;
		this.price = price;
	}
	//getters
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

class Program3 
{
	public static void main(String[] args) 
	{
		
		Bottle b1= new Bottle("Signoraware","black",100);

		System.out.println("Before");
		System.out.println("name = "+b1.getName());
		System.out.println("color = "+b1.getColor());
		System.out.println("price = "+b1.getPrice());
		System.out.println();

		b1.setName("Tupperware");
		b1.setColor("blue");
		b1.setPrice(155);

		System.out.println("After");
		System.out.println("name = "+b1.getName());
		System.out.println("color = "+b1.getColor());
		System.out.println("price = "+b1.getPrice());


	}
}
