package jsp.interfaces;

public class Artist 
{
	public static void main(String[] args)
	{
		FactoryProducer fp =new FactoryProducer();
		/*fp.getFactory("shape").getShape("circle").draw();
		fp.getFactory("color").getColor("red").fill();*/
		
		AbstractFactory af= fp.getFactory("shape");
		Shape s=af.getShape("square");
		s.draw();
		
		af=fp.getFactory("color");
		Color c = af.getColor("blue");
		c.fill();
		
	}

}
