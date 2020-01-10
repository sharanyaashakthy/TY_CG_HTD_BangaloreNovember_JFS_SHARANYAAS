package jsp.abstracts;
import java.util.Scanner;

public class Program7 
{
	public static void main(String[] args)
	{
		Oracle o = new Oracle();
		DB2 d = new DB2();
		SQLServer s = new SQLServer();
		
		while(true)
		{
			System.out.println("enter your choice");
			System.out.println("\n 1.Oracle \n 2.DB2 \n 3.SQLServer \n 4.Exit");
			
			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();
			switch(ch)
			{
					case 1: System.out.println("enter your choice");
					 		System.out.println("\n 1.Connect \n 2.Disconnect");
					 		int ch1=sc.nextInt();
					 		switch(ch1)
					 		{
					 			case 1: o.connect();
					 					break;
					 			case 2: o.disconnect();
					 					break;
					 		}
					 		break;
					case 2: System.out.println("enter your choice");
				 			System.out.println("\n 1.Connect \n 2.Disconnect");
				 			int ch2=sc.nextInt();
				 			switch(ch2)
				 			{
				 				case 1: d.connect();
				 						break;
				 				case 2: d.disconnect();
				 						break;
				 			}
				 			break;
					case 3: System.out.println("enter your choice");
					 		System.out.println("\n 1.Connect \n 2.Disconnect");
					 		int ch3=sc.nextInt();
					 		switch(ch3)
					 		{
					 			case 1: s.connect();
					 					break;
					 			case 2: s.disconnect();
					 					break;
					 		}
					 		break;
					case 4: System.exit(0);
							break;
					default:System.out.println("invalid choice");
			}
		}
	}

}
