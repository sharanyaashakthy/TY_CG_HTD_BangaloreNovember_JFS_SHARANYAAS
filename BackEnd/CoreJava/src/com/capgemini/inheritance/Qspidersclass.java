class Qspiders 
{

	static int totalCount=0;
	int branchCount=0;
	void swipe()
	{
		branchCount++;
		totalCount++;
	}
}
class Main
{

	public static void main(String[] args) 
	{

		Qspiders BTM = new Qspiders();
		BTM.swipe();
		System.out.println(BTM.branchCount);
		
		Qspiders BTR = new Qspiders();
		BTR.swipe();
		BTR.swipe();
		BTR.swipe();
		System.out.println(BTR.branchCount);
		
		System.out.println(Qspiders.totalCount);
	}

}

/*
D:\java practice\javaQsp>javac Qspidersclass.java

D:\java practice\javaQsp>java Main
1
3
4

*/
