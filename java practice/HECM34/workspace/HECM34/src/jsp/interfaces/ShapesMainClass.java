package jsp.interfaces;

import java.util.Scanner;

public class ShapesMainClass
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Circle \n 2.Square \n 3.Rectangle \n 4.Exit ");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			
			switch(ch)
			{
				case 1: new ShapesFactory().getShapes("Circles");
						break;
				case 2: new ShapesFactory().getShapes("Squares");
						break;
				
				case 3: new ShapesFactory().getShapes("Rectangles");
						break;
					
				case 4: System.exit(0);
				
				default: System.out.println("Invalid choice");
			}
		}
		
	}
	
	

}
