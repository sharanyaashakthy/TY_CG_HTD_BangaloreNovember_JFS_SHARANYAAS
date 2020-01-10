class Areaofcircle
{
	public static double areaofcircle(final double pi, double rad)
	{
		double area=pi*rad*rad;
		System.out.println("area of circle is = "+pi*rad*rad);
		return area;
	}
}
class Areaoftriangle
{
	public static double areaoftriangle(final double half, double base, double height)
	{
		double area = half*base*height;
		System.out.println("Area of triangle = "+area);
		return area;
	}
}
class Program1
{
	public static void main(String[] args)
	{
		
		Areaofcircle.areaofcircle(3.14, 4.58);
	
		Areaoftriangle.areaoftriangle(0.5, 12.98, 20.98);


	}
}