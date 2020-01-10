package ObjectClass;

public class Watch
{
	private int hour,min,sec;
	
	public Watch(int hour, int min, int sec)
	{
		this.hour=hour;
		this.min=min;
		this.sec=sec;
	}
	
	//@override
	public String toString()
	{
		return "Hour= "+this.hour + "min= "+this.min + "sec= "+this.sec;
		
	}
	
	//@override
	public boolean equals(Object obj)
	{
		Watch w = (Watch)obj;
		return this.hour == w.hour && 
		this.min == w.min &&
		this.sec == w.sec;
	}
	

}
