package jsp.cfl;

import java.util.*;

public class ArrayListStudEmp
{
	public static void main(String[] args) 
	{
		List l=new ArrayList();
		l.add(new Student("Dinga", 10, 87.87));
		l.add(new Student("Binga", 20, 67.87));
		l.add(new Student("Pinga", 30, 57.87));
		l.add(new Student("Singa", 40, 77.87));
		l.add(new Student("Tanga", 50, 47.87));
		
		l.add(new Emp("Dingi", 60, 87000.87));
		l.add(new Emp("Bingi", 70, 67000.87));
		l.add(new Emp("Pingi", 80, 57000.87));
		l.add(new Emp("Singi", 90, 77000.87));
		l.add(new Emp("Tingi", 100, 97000.87));
		
		/*System.out.println("Name\t\tId\t\tMarks");
		System.out.println("----------------------------------------");
		for(int i=0;i<l.size();i++)
		{
			Object o=l.get(i);
			System.out.println(o);//overridden toString
		}
		
		//displaying only student objects
		for(int i=0;i<l.size();i++)
		{
			Object o=l.get(i);
			if(o instanceof Student)
			{
				System.out.print(o+" ");
			}
			}
		
		
		//displaying student whose marks is>60
		System.out.println();
		for(int i=0;i<l.size();i++)
		{
			Object o=l.get(i);
			if(o instanceof Student)
			{
				Student s=(Student)o;//downcasting
				if(s.getMarks() > 60.00)
				System.out.println(s);
			}
		}
		
		//displaying all students name starting with D
		for(int i=0;i<l.size();i++)
		{
			Object o=l.get(i);
			if(o instanceof Student)
			{
				Student s=(Student)o;
				if(s.getName().startsWith("D"))
				{
					System.out.println(s);
				}
			}
		}
		
		//empl name starts with 'T' and earning more than 50000 sal
		for(int i=0;i<l.size();i++)
		{
			Object o=l.get(i);
			if(o instanceof Emp)
			{
				Emp e=(Emp)o;
				if(e.getName().startsWith("T") && e.getSal() > 50000.00)
				{
					System.out.println(e);
				}
			}
		}
		*/
		//displaying highest marks
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i) instanceof Student) 
			{
				int j;
				hmarks=((Student)l.get(i)).getMarks();
				for(j=i+1;j<l.size();i++)
				{
					if(l.get(j) instanceof Student && ((Student)l.get(j).getMarks() > hmarks)
					{
						hmarks= ((Student)l.get(j)).getMarks();
					}
				}
				if(j == l.size())
				{
					break;
				}
					
				
			}
		}
		
	//find highest sal
					
	}}					
					
					
					
					
					
					
					
			
