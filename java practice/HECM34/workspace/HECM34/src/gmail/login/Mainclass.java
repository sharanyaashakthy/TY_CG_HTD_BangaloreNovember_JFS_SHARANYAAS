package gmail.login;

import gmail.logout.Sample;

public class Mainclass
{
	public static void main(String[] args)
	{
		System.out.println("main method started");
		System.out.println();
		Demo d = new Demo();
		d.disp();
		
		Sample s = new Sample();
		s.print();
		System.out.println();
	
		
		
		Pen p1= new Pen("Renault","black");//passing arguments to the constructor

		System.out.println("Before");
		System.out.println("name = "+p1.getName());//accessing the private d.m through the public methods
		System.out.println("color = "+p1.getColor());
		System.out.println();

		p1.setName("cello");//re-assigning the values of get method
		p1.setColor("blue");

		System.out.println("After");
		System.out.println("name = "+p1.getName());//accessing the changed values
		System.out.println("color = "+p1.getColor());
		System.out.println();
		

		
		System.out.println("main method ended");

		
	}
}
