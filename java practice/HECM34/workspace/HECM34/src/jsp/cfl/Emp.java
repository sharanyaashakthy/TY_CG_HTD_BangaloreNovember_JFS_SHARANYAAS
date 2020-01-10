package jsp.cfl;

public class Emp
{
	private String name;
	private double sal;
	private int id;
	
	public Emp(String name, int id, double sal)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
	public double getSal()
	{
		return sal;
	}
	
	public void setName()
	{
		this.name=name;
	}
	public void setId()
	{
		this.id=id;
	}
	public void setSal()
	{
		this.sal=sal;
	}
	
	public String toString()
	{
		return name+"\t\t"+id+"\t\t"+sal;
	}
	
	
	


}
