//hierarchical inhertance
class Animal 
{
	void eat()
	{
		System.out.println("I eat");
	}
}

class Dog extends Animal
{
	void walk()
	{
		System.out.println("I walk");
	}

}

class Lion extends Animal
{
	void run()
	{
		System.out.println("I run");
	}

}

class MainAnimal
{
	public static void main(String args[])
	{
		Animal a = new Animal();
		Dog d = new Dog();
		d.eat();
		d.walk();

		Lion l = new Lion();
		l.eat();
		l.run();
	}
}

/*
D:\java practice\javaQsp>javac Animal.java

D:\java practice\javaQsp>java MainAnimal
I eat
I walk
I eat
I run

*/
