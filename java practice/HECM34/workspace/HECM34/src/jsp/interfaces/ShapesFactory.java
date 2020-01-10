package jsp.interfaces;

public class ShapesFactory
{
	public Shapes getShapes(String types)
	{
		Shapes s1=null;
		if(types.equalsIgnoreCase("circles"))
		{
			s1= new Circleshapes();
			s1.draw();
		}
		else if(types.equalsIgnoreCase("Squares"))
		{
			s1= new Squareshapes();
			s1.draw();
		
		}
		else 
		{
			 s1= new Rectangleshapes();
			 s1.draw();
		}
		return s1; 
	}

}
