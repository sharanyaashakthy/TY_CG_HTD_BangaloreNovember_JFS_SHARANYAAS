package ObjectClass;

public class Bottle
{
	private String type;
	private int quantity;
	
	public Bottle(String type, int quantity)
	{
		this.type=type;
		this.quantity=quantity;
	}
	
	//@override
	public String toString()
	{
		return "Type= "+this.type + " Quantity= "+this.quantity ;
		
	}
	
	//@override
	public boolean equals(Object obj)
	{
		Bottle b = (Bottle)obj;
		return this.type.equals(b.type)  && 
		this.quantity == b.quantity;
	}
	


}
