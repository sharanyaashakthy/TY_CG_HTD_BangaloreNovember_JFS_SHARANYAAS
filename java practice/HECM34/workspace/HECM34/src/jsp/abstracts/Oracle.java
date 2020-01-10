package jsp.abstracts;

public class Oracle extends Connection 
{
	boolean b = true;
	public void connect()
	{
		if(b == true)
		{
			System.out.println("Oracle is connected");
			b=false;
		}
		else
		{
			System.out.println("Oracle is connected already");
			
		}
	}
	public void disconnect()
	{
		if(b == false)
		{
			System.out.println("Oracle is disconnected");
			b = true;
		}
		else
		{
			System.out.println("Oracle is disconnected already");
		}
	}


}
