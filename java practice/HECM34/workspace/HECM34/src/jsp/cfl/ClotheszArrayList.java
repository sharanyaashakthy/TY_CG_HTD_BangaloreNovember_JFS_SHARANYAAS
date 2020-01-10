package jsp.cfl;

import java.util.*;

public class ClotheszArrayList
{
	public static void main(String[] args)
	{
		List<Clothesz> l = new ArrayList<Clothesz>();
		l.add(new Clothesz("Shirt", 900.00));
		l.add(new Clothesz("T-Shirt", 700.00));
		l.add(new Clothesz("Skirt", 1000.00));
		l.add(new Clothesz("Phant", 800.00));
		l.add(new Clothesz("Frock", 900.00));
		System.out.println("Type\t\tPrice");
		System.out.println("------------------------");
		Iterator<Clothesz>itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Before sorting ");
		System.out.println(l);
		Collections.sort(l, new Clothesz());
		System.out.println("After sorting ");
		System.out.println(l);
		
		
		
		
		
		
	}

}
