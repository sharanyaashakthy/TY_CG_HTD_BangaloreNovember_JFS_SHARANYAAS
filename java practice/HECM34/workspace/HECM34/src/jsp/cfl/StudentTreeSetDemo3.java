package jsp.cfl;

import java.util.Comparator;

public class StudentTreeSetDemo3 implements Comparator<StudentTreeSetDemo3>
{
	private String name;
	private double marks;
	private int id;
	
	public StudentTreeSetDemo3()
	{
		
	}
	public StudentTreeSetDemo3(String name, int id, double marks)
	{
		this.name=name;
		this.id=id;
		this.marks=marks;
	}
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
	public double getMarks()
	{
		return marks;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setMarks(double marks)
	{
		this.marks=marks;
	}
	@Override
	public String toString()
	{
		return this.name+"\t\t" + this.id+"\t\t" + this.marks;
	}
	
	@Override
	public int compare(StudentTreeSetDemo3 s1, StudentTreeSetDemo3 s2)
	{
		return ((Integer)s1.id).compareTo(s2.id);//based on id
	}
	
	
	

}
