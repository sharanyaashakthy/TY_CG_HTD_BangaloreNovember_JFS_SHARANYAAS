package jsp.abstracts;
import java.util.Scanner;

public class Mainclass1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int x = sc.nextInt();
		
		System.out.println("enter the second number");
		int y = sc.nextInt();
		
		Addition a = new Addition(x,y);
		a.add();
	}

}