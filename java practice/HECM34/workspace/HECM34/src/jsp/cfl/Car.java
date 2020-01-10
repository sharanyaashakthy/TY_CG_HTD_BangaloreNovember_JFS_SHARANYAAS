package jsp.cfl;

public class Car 
{
		private String color;
		private double price;
		
		public Car(String color,  double price)
		{
			this.color=color;
			this.price=price;
		}
		public String getColor()
		{
			return color;
		}
		public double getPrice()
		{
			return price;
		}
		
		public void setColor()
		{
			this.color=color;
		}
		public void setPrice()
		{
			this.price=price;
		}
	
		//@override
		public String toString()
		{
			return color+"\t\t"+price;
		}
}
