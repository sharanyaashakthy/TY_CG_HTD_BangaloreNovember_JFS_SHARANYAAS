package ObjectClass;
import java.util.Scanner;
public class ShowRoom
{
	Scanner sc=new Scanner(System.in);
	public Car[] ReadCarDetails()
	{
		Car[] c = new Car[5];
		String name,color;
		double price;
		for(int i=0;i<c.length;i++)
		{
			System.out.println("Enter the name ");
			name=sc.nextLine();
			
			System.out.println("Enter the color");
			color=sc.nextLine();
			
			System.out.println("Enter the price");
			price=sc.nextDouble();
			
			sc.nextLine();
			c[i]=new Car(name, color, price);
		}
		return c;
	}
	public void dispCarDetails(Car[] c)
	{
		System.out.println("Name\t\tColor\t\t Price");
		System.out.println("--------------------------------------");
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]+"      ");
			
		}
		
	}
	public void dispOnlyRedcar(Car[] c)
	{
		System.out.println("Name\t\t Color \t\t Price");
		System.out.println("--------------------------------------");
		for(int i=0;i<c.length;i++)
		{
			if(c[i].getColor().equalsIgnoreCase("Red"))
				System.out.println(c[i]);
		}
	
	}
	public void dispRedcarWithPriceGrt20L(Car[] c)
	{
		System.out.println("Name \t\t Color \t\t Price");
		System.out.println("--------------------------------------");
		for(int i=0;i<c.length;i++)
		{
			if(c[i].getColor().equals("Red") && c[i].getPrice()>2000000.00)
				System.out.println(c[i]);
		}
	
	}
	public void highestPriceCar(Car[] c)
	{
		System.out.println("Name \t\t Color \t\t Price");
		System.out.println("--------------------------------------");
		
		//find highest price
		double highest = c[0].getPrice();
		for(int i=0;i<c.length;i++)
		{
			if(c[i].getPrice() > highest)
			{
				highest = c[i].getPrice();
			}
		}
		
		//disp highest price
		for(int i= 0; i<c.length;i++)
		{
			if(c[i].getPrice() == highest)
			{
				System.out.println(c[i]);
			}
		}
		
		
		
	}

}
