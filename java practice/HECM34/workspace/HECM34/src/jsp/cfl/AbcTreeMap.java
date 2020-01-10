package jsp.cfl;

import java.util.*;
import java.util.Map.Entry;

public class AbcTreeMap 
{
	public static void main(String[] args)
	{
		Map<Character, Integer> m = new TreeMap<Character, Integer>();
		char ch='a';
		for(int i =1,j=0;i<=26;i++,j++)
		{
			m.put((char)('a'+j),i);
		}
			
		Set<Entry<Character, Integer>> s = m.entrySet();
		Iterator<Entry<Character, Integer>> itr = s.iterator();
		while(itr.hasNext())
		{
			Entry<Character, Integer> e = itr.next();
			System.out.println(e.getKey()+"\t\t"+e.getValue());
		}
		System.out.println();
		
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in); 
		String s1 = sc.nextLine();
		int total = 0;
		for(int i =0;i<s1.length();i++)
		{
			total+= m.get(s1.charAt(i));
		}
		System.out.println("Total "+total);
		
		System.out.println("Enter a string: ");
		Scanner sc1 = new Scanner(System.in); 
		String s2 = sc1.next();
		for(int i =0;i<s1.length();i++)
		{
		if(m.get(s2.charAt(i)) == null)
		{
			 m.put(s2.charAt(i), 1);
		}
		else
		{
			m.put(s2.charAt(i),m.get(s2.charAt(i))+1);
		}
		Set<Entry<Character, Integer>> s3 = m.entrySet();
		Iterator<Entry<Character, Integer>> itr1 = s3.iterator();
		while(itr1.hasNext())
		{
			Entry<Character, Integer> e = itr1.next();
			System.out.println(e.getKey()+"\t\t"+e.getValue());
		}
		System.out.println();
		
		
		
		
		}	
		
	}

}
