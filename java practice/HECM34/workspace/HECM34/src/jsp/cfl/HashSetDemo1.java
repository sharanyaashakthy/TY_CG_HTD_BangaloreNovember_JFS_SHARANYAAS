package jsp.cfl;
import java.io.Serializable;
import java.util.*;

public class HashSetDemo1 
{
	public static void main(String[] args)
	{
		Set<Integer> s = new HashSet<Integer> ();
		s.add(54);
		s.add(43);
		s.add(12);
		s.add(87);
		s.add(46);
		s.add(32);
		s.add(54);
		s.add(97);
		System.out.println(s);//[32, 97, 54, 87, 43, 12, 46]
		System.out.println(s instanceof Cloneable);//true
		System.out.println(s instanceof Serializable);//true
		System.out.println(s instanceof RandomAccess);//false
		List<Integer> l = new ArrayList<Integer>(s);//changing the collection type to list
	
		Collections.sort(l);	
		System.out.println("sort " +l);//sort [12, 32, 43, 46, 54, 87, 97]
		Collections.reverse(l);
		System.out.println("reverse "+l);//reverse [97, 87, 54, 46, 43, 32, 12]
		//getting the objects from hash set...new concept
		for(int i=0;i<l.size();i++)
		{
			
		}

		
		
	}

}
