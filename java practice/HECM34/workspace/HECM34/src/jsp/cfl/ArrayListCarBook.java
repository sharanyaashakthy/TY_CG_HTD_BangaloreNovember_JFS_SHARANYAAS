package jsp.cfl;
import java.util.*;
public class ArrayListCarBook 
{
	public static void main(String[] args)
	{
		List l= new ArrayList();
		l.add(new Car("Red", 1000000.00));
		l.add(new Car("Black", 2500000.00));
		l.add(new Car("blue", 8000000.00));
		l.add(new Car("Red", 3000000.00));
		l.add(new Car("Black", 1500000.00));
		
		l.add(new Book("Reddy", "Java"));
		l.add(new Book("Reddy", "DS"));
		l.add(new Book("John", "SQL"));
		l.add(new Book("Henry", "Java"));
		l.add(new Book("Reddy", "OS"));
		System.out.println("Displaying the details ");
		System.out.println("Abt1\t\tAbt2");
		System.out.println("-------------------------------------");
		for(int i=0;i<l.size();i++)
		{
			Object o=l.get(i);
			System.out.println(o);//overridden toString
		}
		System.out.println();
		
		System.out.println("Displaying only the red color cars");
		System.out.println();
		for(int i=0;i<l.size();i++)
		{
			Object o=l.get(i);
			if(o instanceof Car)
			{
				Car c=(Car)o;//downcasting
				if(c.getColor().equalsIgnoreCase("red"))
					System.out.println(c);
			}
		}
		System.out.println();
		
		System.out.println("Displaying all black cars whose price>20L");
		for(int i=0;i<l.size();i++)
		{
			Object o=l.get(i);
			if(o instanceof Car)
			{
				Car c=(Car)o;//downcasting
				if(c.getColor().equalsIgnoreCase("black") && c.getPrice() > 2000000.00 )
				{
					System.out.println(c);
				}
			}
		}
		System.out.println();
		
		
		System.out.println("Displaying all books written by PadhmaReddy");
		for(int i=0;i<l.size();i++)
		{
			Object o=l.get(i);
			if(o instanceof Book)
			{
				Book b=(Book)o;//downcasting
				if(b.getAuthor().equalsIgnoreCase("Reddy"))
					System.out.println(b);
			}
		}
		System.out.println();
		
		System.out.println("Displaying different authors of Java book");
		for(int i=0;i<l.size();i++)
		{
			Object o=l.get(i);
			if(o instanceof Book)
			{
				Book b=(Book)o;//downcasting
				if(b.getTitle().equalsIgnoreCase("java"))
					System.out.println(b);
			}
		}
	}
		
}
