public class Citizen
{
	private String name;
	private String country;
	private long aadharid;

	public Citizen(String name, String country, long aadharid)
	{
		this.name = name;
		this.country = country;
		this.aadharid = aadharid ;
	}
	//getters
	public String getName()
	{
		return name;
	}

	public String getCountry()
	{
		return country;
	}

	public long getAadharid()
	{
		return aadharid;
	}
	//setters
	public void setName(String name)
	{
		this.name = name;
	}
	public void setCountry(String country)
	{
		this.country = country;
	}
	public void setAadharid(long aadharid)
	{
		this.aadharid = aadharid;
	}
}

class Program4
{
	public static void main(String[] args) 
	{
		
		Citizen c1= new Citizen("Rahul","India",563455365737l);

		System.out.println("Before");
		System.out.println("name = "+c1.getName());
		System.out.println("country = "+c1.getCountry());
		System.out.println("aadharid = "+c1.getAadharid());
		System.out.println();

		c1.setName("John");
		c1.setCountry("India");
		c1.setAadharid(456789094376l);

		System.out.println("After");
		System.out.println("name = "+c1.getName());
		System.out.println("country = "+c1.getCountry());
		System.out.println("aadharid = "+c1.getAadharid());


	}
}

