package jsp.interfaces;

public class ColorFactory extends AbstractFactory
{
	public Color getColor(String color)
	{
		Color c =null;
		if(color.equalsIgnoreCase("red"))
		{
			c= new Red();
		}
		else if(color.equalsIgnoreCase("green"))
		{
			c= new Green();
		}
		else 
		{
			 c= new Blue();
		}
		return c; 
	}
		
		public Shape getShape(String Shape)
		{
			return null;
		}
		
			
		
	}


