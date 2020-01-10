package ObjectClass;

public class BookApp 
{
	public static void main(String[] args)
	{
			Library lr = new Library();
			 Book[] b = lr.ReadBookDetails();
			System.out.println();
			System.out.println();
			
			lr.dispBookDetails(b);
			System.out.println();
			System.out.println();
			
			lr.dispBookPriceGrt350(b);
			System.out.println();
			System.out.println();
			
			lr.dispBookByPadhma(b);
			System.out.println();
			System.out.println();
			
			lr.dispJavaBooks(b);
			System.out.println();
			System.out.println();
			
			lr.highestPriceBook(b);
			System.out.println();
			System.out.println();
			
			lr.highestPriceJavaBook(b);
			System.out.println();
			System.out.println();
			
			lr.dispPadhmaBookspriceBtwn250to500(b);
			System.out.println();
			System.out.println();
		
	}

}
