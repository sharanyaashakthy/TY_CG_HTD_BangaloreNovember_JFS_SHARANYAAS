package jsp.cfl;

import java.util.Scanner;

public class StudCrudMain 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		
		StudCrudLogic scl = new StudCrudLogic(sc);
		while(true)
		{
			System.out.println("1.Add\n2.Display\n3.Search\n4.Remove\n5.Update\n6.Sort\n7.Exit");
			System.out.println("Enter your choice: ");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1: //call add
						scl.addStud();
						break;
				case 2: //call Display
						scl.dispStud();
						break;
				case 3: //call Search
						scl.searchStud();
						break;
				case 4: //call Remove
						scl.removeStud();
						break;
				//case 5: //call Update
						//scl.updateStud();
						//break;
				case 6: //call Sort
						scl.sortStud();
						break;
				case 7: //Exit
						System.exit(0);
						break;
				default:System.out.println("Invalid");
			}	
		}
		
	}

}
