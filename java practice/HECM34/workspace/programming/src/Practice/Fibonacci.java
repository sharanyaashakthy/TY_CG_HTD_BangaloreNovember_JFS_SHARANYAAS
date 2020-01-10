package Practice;
import java.util.Scanner;
class Fibonacci
{
	public static void main(String[] args)
	{
		int n1=0,n2=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length: ");
		int length = sc.nextInt();
		
		if(length == 1)
			System.out.println(n1);
		else if(length == 2)
			System.out.println(n1+" "+n2);
		else
		{
			System.out.print(n1+" "+n2+" ");
			for(int i=3;i<=length;i++)
			{
				int n3 = n1+n2;
				System.out.print(n3+" ");
				n1=n2;
				n2=n3;
			}
		}
			
	}
}