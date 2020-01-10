package jsp.abstracts;
import java.util.Scanner;
public class Program
{
	public static void main(String[] args)
	{
		while(true)
		{
		
		System.out.println("Animals and their food");
		System.out.println("1.Dog \t 2.Monkey \t 3.Lion \t 4.Exit");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int n = sc.nextInt();
		switch(n)
		{
			case 1:	System.out.println("your choice is Dog");
					Dog d=new Dog("Pedigree");
					d.eat();
					break;
					
			case 2: System.out.println("your choice is Monkey");
				    new Monkey("Banana").eat();
					break;
					
			case 3: System.out.println("your choice is Lion");
					Lion l=new Lion("Meat");
					l.eat();
					break;
			case 4:System.exit(0);
			
			default:System.out.println("Invalid choice");
		}
	  }
	}
}
