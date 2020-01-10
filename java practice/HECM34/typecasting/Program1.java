
/*D:\java practice\HECM34\typecasting>javac Program1.java

D:\java practice\HECM34\typecasting>java Program1
x = 10
y = 10.0
*/
class Program1 
{
	public static void main(String[] args) 
	{
		int x=(int)10.11; // explicit narrowing
		double y = 10; // implicit widening
		System.out.println("x = "+x);
		System.out.println("y = "+y);

		double z = 3.14f;//implicit widening
		float f = (float)3.14;//explicit narrowing
		System.out.println("z = "+z);
		System.out.println("f = "+f);
	}
}
