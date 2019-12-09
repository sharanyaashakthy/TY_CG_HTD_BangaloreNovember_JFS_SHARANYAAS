//multi level inheritance+
class oneGMobile 
{
	void call()
	{
		System.out.println("you can call");
	}
	void msg()
	{
		System.out.println("you can message");
	}
	
}

class twoGMobile extends oneGMobile
{
	void radio()
	{
		System.out.println("you can listen FM");
	}
}
class threeGMobile extends twoGMobile
{
	void camera()
	{
		System.out.println("you can capture pics");
	}
}

class MainMobile
{
	public static void main(String[] args)
	{
		
		/*System.out.println("1GMobile");
		oneGMobile one = new oneGMobile();
		one.call();
		one.msg();
		System.out.println();

		System.out.println("2GMobile");
		twoGMobile two = new twoGMobile();
		two.call();
		two.msg();
		two.radio();
		System.out.println();

		System.out.println("3GMobile");
		threeGMobile three = new threeGMobile();
		three.call();
		three.msg();
		three.radio();
		three.camera();*/

		// accessing the sub class props by superclass ref.var
		oneGMobile one = new  threeGMobile();
		one.call();
		one.msg();

		twoGMobile two = new threeGMobile();
		two.call();
		two.msg();
		two.radio();

		threeGMobile three = new threeGMobile();
		three.call();
		three.msg();
		three.radio();
		three.camera();




	}
}
/*
D:\java practice\javaQsp>javac Mobile.java

D:\java practice\javaQsp>java MainMobile
1GMobile
you can call
you can message

2GMobile
you can call
you can message
you can listen FM

3GMobile
you can call
you can message
you can listen FM
you can capture pics
*/