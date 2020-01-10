package Practice;
import java.util.Scanner;
public class Armstrongnumber
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number ");
		int num= sc.nextInt();
		int temp=num;
		int count=0,sum=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		num=temp;
		while(num>0)
		{
			int rem=num%10;
			int val=1;
			for(int i=1;i<=count;i++)
				val=val*rem;
			sum=sum+val;
			num=num/10;
		}
		if(temp==sum)
			System.out.println(+temp+ " is an armstrong number");
		else
			System.out.println(+temp+ " is not an armstrong number");
	}
}
		
