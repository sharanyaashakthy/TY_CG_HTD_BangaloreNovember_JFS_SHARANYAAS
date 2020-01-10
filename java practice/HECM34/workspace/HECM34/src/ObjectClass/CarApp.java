package ObjectClass;

public class CarApp 
{
	public static void main(String[] args) 
	{
		ShowRoom sr = new ShowRoom();
		 Car[] c = sr.ReadCarDetails();
		System.out.println();
		System.out.println();
		
		sr.dispCarDetails(c);
		System.out.println();
		System.out.println();
		
		sr.dispOnlyRedcar(c);
		System.out.println();
		System.out.println();
		
		sr.dispRedcarWithPriceGrt20L(c);
		System.out.println();
		System.out.println();
		
		sr.highestPriceCar(c);
		System.out.println();
		System.out.println();
		
	}

}
