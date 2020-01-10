package ObjectClass;

import java.util.Scanner;

public class Library 
{
	Scanner sc = new Scanner(System.in);
	public Book[] ReadBookDetails()
	{
		Book[] b = new Book[5];
		String title,author;
		double price;
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Enter the title ");
			title=sc.nextLine();
			
			System.out.println("Enter the author");
			author=sc.nextLine();
			
			System.out.println("Enter the price");
			price=sc.nextDouble();
			
			sc.nextLine();
			b[i]=new Book(title, author, price);
		}
		return b;
		
	}
	public void dispBookDetails(Book[] b)
	{
		System.out.println("Title\t\tAuthor\t\t Price");
		System.out.println("--------------------------------------");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+"      ");
			
		}
	}
	
	public void dispBookPriceGrt350(Book[] b)
	{
		System.out.println("Name \t\t Color \t\t Price");
		System.out.println("--------------------------------------");
		for(int i=0;i<b.length;i++)
		{
			if(b[i].getPrice()>350.00)
				System.out.println(b[i]);
		}
	}
	public void dispBookByPadhma(Book[] b)
	{
		System.out.println("Name \t\t Color \t\t Price");
		System.out.println("--------------------------------------");
		for(int i=0;i<b.length;i++)
		{
			if(b[i].getAuthor().equalsIgnoreCase("Padhma"))
				System.out.println(b[i]);
		}
		
	}
	public void dispJavaBooks(Book[] b)
	{
		System.out.println("Name \t\t Color \t\t Price");
		System.out.println("--------------------------------------");
		for(int i=0;i<b.length;i++)
		{
			if(b[i].getTitle().equalsIgnoreCase("Java"))
				System.out.println(b[i]);
		}
		
	}
	public void highestPriceBook(Book[] b)
	{
		System.out.println("Name \t\t Color \t\t Price");
		System.out.println("--------------------------------------");
		//find highest price
				double highest = b[0].getPrice();
				for(int i=0;i<b.length;i++)
				{
					if(b[i].getPrice() > highest)
					{
						highest = b[i].getPrice();
					}
				}
				
				//disp highest price
				for(int i= 0; i<b.length;i++)
				{
					if(b[i].getPrice() == highest)
					{
						System.out.println(b[i]);
					}
				}
		
	}
	public void highestPriceJavaBook(Book[] b)
	{
		//find highest price
				double highest = b[0].getPrice();
				for(int i=0;i<b.length;i++)
				{
					if(b[i].getPrice() > highest)
					{
						highest = b[i].getPrice();
					}
				}
				
				//disp highest price
				for(int i= 0; i<b.length;i++)
				{
					if( b[i].getTitle().equalsIgnoreCase("Java") && b[i].getPrice() == highest )
					{
						System.out.println(b[i]);
					}
				}
		
	}
	public void dispPadhmaBookspriceBtwn250to500(Book[] b)
	{
		System.out.println("Name \t\t Color \t\t Price");
		System.out.println("--------------------------------------");
		for(int i = 0; i<b.length; i++)
		{
			if(b[i].getAuthor().equalsIgnoreCase("Padhma") && b[i].getPrice() > 250 && b[i].getPrice() <350)
			{
				System.out.println(b[i]);
			}
		}
		
	}


}
