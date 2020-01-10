package jsp.typecasting;

public class Zoo
{
	public void AnimalFood(Animal a)//generalized code with superclass type reference variable
	{
		a.print();
		//a.eat();
		
		if(a instanceof Dog)
		{
			Dog d=(Dog)a;
			d.eat();
		}
		
		else if(a instanceof Monkey)
		{
			Monkey m=(Monkey)a;
			m.eat();
		}
		
		else if(a instanceof Lion)
		{
			Lion l=(Lion)a;
			l.eat();
		}
		
		
	}

}
