package jsp.cfl;

import java.util.*;

public class CitizenHashMap 
{
	public static void main(String[] args)
	{
		Map<Integer, Citizen> m = new HashMap<Integer, Citizen> ();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.readDetails\n2.dispAge\n3.dispName");
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1: readDetails();
					break;
			case 2: dispAge();
					break;
			case 3: dispName();
					break;
			default: System.out.println("Invalid choice");
		}
		
	}
		
		
		
		
	}

}
