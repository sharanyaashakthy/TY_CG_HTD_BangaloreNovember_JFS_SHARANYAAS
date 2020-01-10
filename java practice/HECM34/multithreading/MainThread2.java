class MyThread extends Thread
{
	/*@Override
	public void run()
	{
		System.out.println("Hello World");
	}
	@Override
		public void start()
	{
		super.start();
		System.out.println("Hello JSP");
	}*/

}
class MainThread2
{
	public static void main(String[] args) 
	{
		MyThread t=new MyThread();
		//t.setName("Thread-A");
		//t.setPriority(11);
		//t.start();
		//t.stop();
		//t.start();

		System.out.println("Before--->main " + Thread.currentThread().getPriority()) ;
		System.out.println("before--->Child " + new MyThread().getPriority()) ;
		
		Thread.currentThread().setPriority(10);

		System.out.println("After--->main " + Thread.currentThread().getPriority()) ;
		System.out.println("After--->Child " + new MyThread().getPriority()) ;

	/*Before--->main 5
	before--->Child 5
	After--->main 10
	After--->Child 10*/
		
	}
}
