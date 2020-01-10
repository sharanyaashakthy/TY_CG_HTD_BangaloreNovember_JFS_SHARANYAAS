package jsp.abstracts;

public class Dog extends Animal 
{
	Dog(String food)
	{
		super(food);
		
	}

	public void eat()
	{
		System.out.println("Dog eats "+food);
		System.out.println();
	}
	
}
