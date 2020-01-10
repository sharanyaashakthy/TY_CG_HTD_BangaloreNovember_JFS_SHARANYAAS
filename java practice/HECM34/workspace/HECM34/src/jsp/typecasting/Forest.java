package jsp.typecasting;

import java.util.Scanner;
//with typecasting 
public class Forest
{
	public static void main(String[] args)
	{
		Zoo z= new Zoo();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println(" 1.Dog \t 2.Cat \t 3.Lion \t4.Exit ");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			
			switch(ch)
			{
				case 1: z.AnimalFood(new Dog());
						break;
				case 2: z.AnimalFood(new Monkey());
						break;
				case 3: z.AnimalFood(new Lion());
						break;
				case 4: System.exit(0);
						break;
				default: System.out.println("Invalid choice");
			}
		}
	}

}
