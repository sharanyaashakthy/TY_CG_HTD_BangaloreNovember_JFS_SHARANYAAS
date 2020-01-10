package jsp.abstracts;

public class DB2 extends Connection 
{
	boolean b = true;
	public void connect()
	{
		if(b == true)
		{
			System.out.println("DB2 is connected");
			b=false;
		}
		else
		{
			System.out.println("DB2 is connected already");
			
		}
	}
	public void disconnect()
	{
		if(b == false)
		{
			System.out.println("DB2 is disconnected");
			b = true;
		}
		else
		{
			System.out.println("DB2 is disconnected already");
		}
	}
}

