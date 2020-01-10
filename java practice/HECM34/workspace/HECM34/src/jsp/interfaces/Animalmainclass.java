package jsp.interfaces;

import java.util.Scanner;

public class Animalmainclass 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println(" 1.Dog \t 2.Cat \t 3.Lion \t4.Exit ");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			
			switch(ch)
			{
				case 1: new AnimalFactory().AnimalSound(new Dog());
						break;
				case 2: new AnimalFactory().AnimalSound(new Cat());
						break;
				
				case 3: new AnimalFactory().AnimalSound(new Lion());
						break;
					
				case 4: System.exit(0);
				
				default: System.out.println("Invalid choice");
				
						
			}
		}
	}

}
