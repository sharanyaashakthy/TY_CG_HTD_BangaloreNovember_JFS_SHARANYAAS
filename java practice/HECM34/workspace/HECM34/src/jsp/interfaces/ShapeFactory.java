package jsp.interfaces;

public class ShapeFactory extends AbstractFactory
{
	public Shape getShape(String type)
	{
		Shape s=null;
		if(type.equalsIgnoreCase("circle"))
		{
			s= new Circle();
		}
		else if(type.equalsIgnoreCase("Square"))
		{
			s= new Square();
		}
		else 
		{
			 s= new Rectangle();
		}
		return s; 
	}
		
		public Color getColor(String Color)
		{
			return null;
		}
		
			
		
	}

