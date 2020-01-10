package jsp.cfl;

import java.util.*;

public class PenGeneric3 
{
	public static void main(String[] args)
	{
		List<Pen> l = new ArrayList<Pen>();
		l.add(new Pen("Black", 20.00));
		l.add(new Pen("Red", 22.00));
		l.add(new Pen("Blue", 30.00));
		l.add(new Pen("Black", 35.00));
		l.add(new Pen("Red", 15.00));
		l.add(new Pen("Blue", 20.00));
		
		System.out.println("Displaying all blue color pens");
		for(int i=0;i<l.size();i++)
		{
			Pen p = l.get(i);
			if(p.getColor().equalsIgnoreCase("blue"))
			{
				System.out.println(p);
			}
		}
		System.out.println();
		
		System.out.println("Displaying all pen's price between 25 and 50");
		for(int i=0;i<l.size();i++)
		{
			Pen p = l.get(i);
			if(p.getPrice() > 25 || p.getPrice()>50)
			{
				System.out.println(p);
			}
		}
		System.out.println();
		
		System.out.println("Displaying all Red pen's price < 25");
		for(int i=0;i<l.size();i++)
		{
			Pen p = l.get(i);
			if(p.getColor().equalsIgnoreCase("red") && p.getPrice() < 25 )
			{
				System.out.println(p);
			}
		}
		System.out.println();
		
		System.out.println("Displaying the costliest black color pen");
		for(int i=0;i<l.size();i++)
		{
			Pen p = l.get(i);
			if(p.getColor().equalsIgnoreCase("black") && )
		}
		

		
		
	}

}
