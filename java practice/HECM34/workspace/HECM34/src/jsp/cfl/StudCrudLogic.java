package jsp.cfl;

import java.util.*;

public class StudCrudLogic
{
	List<StudCrud> l = new ArrayList<StudCrud>();
	Scanner sc;
	
	public StudCrudLogic(Scanner sc) 
	{
		this.sc = sc;
	}
	public void addStud()
	{
		l.add(readDetails());
	}
	
	public void dispStud()
	{
		if(!l.isEmpty())
		{
			System.out.println("Name\t\tId\t\tMarks\t\tMobile");
			System.out.println("----------------------------------------------------");			
			//for(int i = 0; i < l.size(); i++)
			Iterator<StudCrud> itr=l.iterator();
			while(itr.hasNext())
			{
				StudCrud s =  itr.next();
				//System.out.println(l.get(i));
				System.out.println(s);
			}
		}
		else
		{
			System.out.println();
		}		
	}
	
	public void searchStud()
	{
		if(!l.isEmpty())
		{
			System.out.println("Enter the id to be searched");
			int id = sc.nextInt();
			
			for(int i = 0 ; i < l.size(); i++)
			{
				if(l.get(i).getId() == id)
				{
					System.out.println("Student Exists !!");
					return;
				}
			}
			
			System.out.println("Student doesn't exists !!");
		}
		else
		{
			System.out.println("List is empty !!");
		}
	}
	
	public void removeStud()
	{
		if(!l.isEmpty())
		{
			System.out.println("Enter the id to be removed");
			int id = sc.nextInt();
			
			for(int i = 0 ; i < l.size(); i++)   
			{
				if(l.get(i).getId() == id)
				{
					l.remove(i);
					System.out.println("Student removed !!");
					return;
				}
			}
			
			System.out.println("Student doesn't exists !!");
		}
		else
		{
			System.out.println("List is empty !!");
		}
	}
	
	/*public void updateStud()
	{
		if(!l.isEmpty())
		{
			System.out.println("1.Update Marks\n2.Update Mobile");
			int ch = sc.nextInt();
			
			System.out.println("Enter the id to update");
			int id = sc.nextInt();
			
			switch(ch)
			{
				case 1: System.out.println("Enter the new marks");
						updateMarks(id,sc.nextDouble());
					
						break;
						
				case 2: System.out.println("Enter the new mobile");
						updateMobile(id,sc.nextLong());
						break;
			}
		}
		else
		{
			System.out.println("List is empty !!");
		}
	}
	
	public void updateMarks(int id, double newMarks)
	{
		for(int i = 0 ; i < l.size(); i++)
		{
			if(l.get(i).getId() == id)
			{
				l.get(i).setMarks(newMarks);
			}
		}
	}
	
	public void updateMobile(int id, long newMoible)
	{
		for(int i = 0 ; i < l.size(); i++)
		{
			if(l.get(i).getId() == id)
			{
				l.get(i).setMobile(newMoible);
			}
		}
	}*/
	
	public void sortStud()
	{
		
	}
	public StudCrud readDetails()
	{
		sc.nextLine();
		
		System.out.println("Enter the name");
		String name = sc.nextLine();
		
		System.out.println("Enter the id");
		int id = sc.nextInt();
		
		System.out.println("Enter the marks");
		double marks = sc.nextDouble();
		
		System.out.println("Enter the mobile");
		long mobile = sc.nextLong();
		
		return new StudCrud(name, id, marks);
	}

}