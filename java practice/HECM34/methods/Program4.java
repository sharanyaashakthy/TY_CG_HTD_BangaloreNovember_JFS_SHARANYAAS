class Program4 
{
	public static void main(String[] args) 
	{
		System.out.println("Area of circle by using modular programming");//storing and then passing the arguments
		final double pi=3.14;
		double rad=9.88;
		double area=areaofcircle(pi,rad);
		System.out.println("Area of circle is = "+area);
	}
	public static double areaofcircle(final double pi, double rad)
	{
		System.out.println("The pi value is = "+pi);
		System.out.println("The radius value is = "+rad);
		double area=pi*rad*rad;
		return area;
	}
}
