package jsp.cfl;

public class StudCrud
{
		private String name;
		private double marks;
		private int id;
		private long mobile;
		
		public StudCrud(String name, int id, double marks)
		{
			this.name=name;
			this.id=id;
			this.marks=marks;
		}
		public String getName()
		{
			return name;
		}
		public int getId()
		{
			return id;
		}
		public double getMarks()
		{
			return marks;
		}
		public long getMobile()
		{
			return mobile;
		}
		
		public void setName()
		{
			this.name=name;
		}
		public void setId()
		{
			this.id=id;
		}
		public void setMarks()
		{
			this.marks=marks;
		}
		public void setMobile()
		{
			this.mobile=mobile;;
		}
		
		//@override
		public String toString()
		{
			return name+"\t\t"+id+"\t\t"+marks+"\t\t"+mobile;
		}
}
