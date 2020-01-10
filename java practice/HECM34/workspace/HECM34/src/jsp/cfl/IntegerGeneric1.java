package jsp.cfl;

import java.util.*;

public class IntegerGeneric1 
{
	public static void main(String[] args) 
	{
		List<Integer> l = new ArrayList<Integer> ();
		l.add(20);
		l.add(65);
		l.add(62);
		l.add(59);
		l.add(278);
		
		/*System.out.println("Displaying only the even numbers");
		for(int i=0;i<l.size();i++)
		{
			Integer itr = l.get(i);//there is no downcasting and instanceof use in generics.It can be directly done
			if(itr % 2 == 0)
				System.out.println(itr);
		}*/
		Collections.sort(l);
		System.out.println("After sort: "+l);//by default, ascending order
		
		Collections.reverse(l);
		System.out.println("Descending order: "+l);//descending order
		
		
		
	}

}
