package jsp.cfl;

public class Student 
{
	private String name;
	private double marks;
	private int id;
	
	public Student(String name, int id, double marks)
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
	
	//@override
	public String toString()
	{
		return name+"\t\t"+id+"\t\t"+marks;
	}
	
	
	

}
