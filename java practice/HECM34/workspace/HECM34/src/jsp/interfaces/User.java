package jsp.interfaces;
import java.util.Scanner;
// abstraction or loose coupling
public class User
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Chrome \n 2.Opera \n 3.Mozilla \n 4.Exit ");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			
			switch(ch)
			{
				case 1: new BrowserFactory().getBrowser(new Chrome());
						break;
				case 2: new BrowserFactory().getBrowser(new Opera());
						break;
				
				case 3: new BrowserFactory().getBrowser(new Mozilla());
						break;
					
				case 4: System.exit(0);
				
				default: System.out.println("Invalid choice");
				
						
			}
		}
	}

}
