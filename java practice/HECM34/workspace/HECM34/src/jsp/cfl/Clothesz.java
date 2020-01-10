package jsp.cfl;

import java.util.*;

public class Clothesz implements Comparator<Clothesz>
{
	private String type;
	private double price;
	public Clothesz()
	{
		
	}
	public Clothesz(String type, double price)
	{
		super();
		this.type = type;
		this.price = price;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public double getPrice() 
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	@Override
	public String toString()
	{
		return  type+"\t\t"+price;
	}
	
	public int compare(Clothesz c1, Clothesz c2)
	{
		return ((Double) c2.price).compareTo(c1.price);
	}
	
	

}
