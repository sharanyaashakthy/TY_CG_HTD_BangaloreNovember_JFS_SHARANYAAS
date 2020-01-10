class Program1
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		System.out.println("Area of triangle using modular programming");
		final double half=0.5;
		double base=9.8,height=19.8;
		double area=areaoftriangle(half,base,height);
					
		System.out.println("The base value is = "+base);
		System.out.println("The height value is = "+height);
		System.out.println("area of the triangle is = "+area);
		System.out.println("main method ended");
	}

	public static double areaoftriangle(final double half, double base, double height)
	{
		double area=half*base*height;
		return area;
	}
}



