//checking the defaukt values of the datatypes
lass Car 
{
	String brand;
	int ShowRoomPrice;
	double OnRoadPrice;
	boolean isAvailable;
	char ch;

	void carDetails()
	{
		System.out.println("brand is "+brand+" ShowRoomPrice is "+ ShowRoomPrice+" OnRoadPrice is "+OnRoadPrice+ "and "+isAvailable+ "and char is"+ch+"****");
	}
}
class MainCar
{
	public static void main(String[] args)
	{
		Car c = new Car();
		c.carDetails();
	}
}
/*
D:\java practice\javaQsp>javac Car.java

D:\java practice\javaQsp>java MainCar
brand is null ShowRoomPrice is 0 OnRoadPrice is 0.0and falseand char is ****
*/
