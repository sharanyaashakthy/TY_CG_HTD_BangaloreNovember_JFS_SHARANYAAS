package jsp.cfl;

import java.util.*;
import java.util.Map.Entry;

public class EmpHashMap
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m = new HashMap<Integer, String>();
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1 : readDetails();
					 break;
			case 2 : dispEmp();
					 break;
			case 3 : checkId();
					 break;
			case 4 : deletId();
					 break;
			case 5 : dispId();
					 break;
			case 6 : dispName();
			         break;
			default:System.out.println("Invalid choice");
		}

		
		while(true)
		{
			System.out.println("Enter the id: ");
			System.out.println("Enter the name: ");
			int key = sc.nextInt();
			String value = sc.nextLine();
			m.put(key, value);
		
			for(int i=0;i<m.size();i++)
			{
				System.out.println(m);
			}
	
	
		
		System.out.println("Key-Id\t\tvalue-Name");
		System.out.println("---------------------------------");
		
		Set<Entry<Integer,String>> s = m.entrySet();
		Iterator<Entry<Integer, String>> itr = s.iterator();
		while(itr.hasNext())
		{
			Entry<Integer, String> e = itr.next();
			System.out.println(e.getKey()+"\t\t"+e.getValue());
		}
		System.out.println();
		
		System.out.println("Enter the id to be searched: ");
		int key1 = sc.nextInt();
		if(m.containsKey(key1))
		{
			System.out.println(+key1+ " exists");
		}
		else
		{
			System.out.println("id does not exists");
		}
		
		System.out.println("Enter the id to be deleted: ");
		int key2 = sc.nextInt();
		if(m.containsKey(key2))
		{
			m.remove(key2);
		}
		
		Set<Integer> keys = m.keySet();
		System.out.println("Key :"+keys);
		Collection<String> values = m.values();
		System.out.println("Value :"+values);
		
		
		}
		
	}
}
