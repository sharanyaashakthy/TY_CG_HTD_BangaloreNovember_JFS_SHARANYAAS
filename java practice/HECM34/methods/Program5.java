class Program5 
{
	public static void main(String[] args) 
	{
		System.out.println("Area of circle ");//directly passing the arguments
	    double area=areaofcircle(3.14,2.89);
		
		System.out.println("area of the circle is = "+area);
	}
	public static double areaofcircle(double pi, double rad)
	{
		double area=pi*rad*rad;
		
		return area;

	}

}
