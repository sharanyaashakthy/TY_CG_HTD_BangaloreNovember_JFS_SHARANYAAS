package jsp.abstracts;

public class SQLServer extends Connection 
{
	boolean b = true;
	public void connect()
	{
		if(b == true)
		{
			System.out.println("SQL Server is connected");
			b=false;
		}
		else
		{
			System.out.println("SQL Server is connected already");
			
		}
	}
	public void disconnect()
	{
		if(b == false)
		{
			System.out.println("SQL Server is disconnected");
			b = true;
		}
		else
		{
			System.out.println("SQL Server is disconnected already");
		}
	}
}
