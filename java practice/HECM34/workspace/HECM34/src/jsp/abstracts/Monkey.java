package jsp.abstracts;

public class Monkey extends Animal
{
	Monkey (String food)
	{
		super(food);
		
	}
	public void eat()
	{
		System.out.println("Monkey eats "+food);
		System.out.println();
	}

}
