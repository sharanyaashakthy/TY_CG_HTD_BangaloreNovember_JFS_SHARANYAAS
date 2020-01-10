package jsp.cfl;

public class Book 
{
			private String author;
			private String title ;
			private double price;
			
			public Book(String author, String title,double price)
			{
				this.author=author;
				this.title=title;
				this.price=price;
			}
			public String getAuthor()
			{
				return author;
			}
			public String getTitle()
			{
				return title;
			}
			public double getPrice()
			{
				return price;
			}
			
			public void setAuthor(String author)
			{
				this.author=author;
			}
			public void setTitle(String title)
			{
				this.title=title;
			}
			public void setPrice(double price)
			{
				this.price=price;
			}
		
			//@override
			public String toString()
			{
				return author+"\t\t"+title;
			}
}
