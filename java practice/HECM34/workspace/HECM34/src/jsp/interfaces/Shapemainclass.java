package jsp.interfaces;
import java.util.Scanner;

public class Shapemainclass
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
				case 1: new ShapeFactory().getShape("Circle").draw();
						break;
				case 2: new ShapeFactory().getShape("Square").draw();
						break;
				
				case 3: new ShapeFactory().getShape("Rectangle").draw();
						break;
					
				case 4: System.exit(0);
				
				default: System.out.println("Invalid choice");
				
						
			}
		}
	}

}
