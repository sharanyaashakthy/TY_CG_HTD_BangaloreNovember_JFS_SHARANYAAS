/*
Main method started
Thread[main,5,main]
100
101
Thread[Thread A,10,main]
1
102
103
104
105
106
107
108
109
110
Main method ended
2
3
4
5
6
7
8
9
10
*/

class MyThread extends Thread 
{
	//@Override
	public void run()
	{
		Thread t = Thread.currentThread();
		System.out.println(t);
		for(int i = 1; i<=10; i++)
		{
			try
			{
				System.out.println(i);
				Thread.sleep(1000);
				
			}
			catch (InterruptedException e)
			{
				System.out.println();
			}
			
		}


	}

}
class MainThread
{
	public static void main(String[] args)
	{
		System.out.println("Main method started");
		Thread t = Thread.currentThread();
		System.out.println(t);

		MyThread t1 = new MyThread();
		t1.setName("Thread A");
		t1.setPriority(10);
		t1.start();

		for(int i = 100; i<=110; i++)
		{
			System.out.println(i);
		}
		System.out.println("Main method ended");
	}
}
