package Practice;
import java.util.Scanner;
public class Firstsecondlarge
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size: ");
		int[] arr= new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int firstlarge=arr[0];
		int secondlarge=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(firstlarge<arr[i])
			{
				secondlarge=firstlarge;
				firstlarge=arr[i];
				
			}
			else if(secondlarge<arr[i] && arr[i] != firstlarge)
			{
				secondlarge=arr[i];
			}
			
		}
		System.out.println(firstlarge);
		System.out.println(secondlarge);
		
		
		
	}

}
