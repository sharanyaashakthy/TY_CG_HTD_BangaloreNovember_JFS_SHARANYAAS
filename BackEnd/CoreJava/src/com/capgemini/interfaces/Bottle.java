package com.capgemini.interfaces;

public interface Bottle {
	 void open();
	 void drink();
	 
	 //Here, default isn't a access modifier, but a keyword to write concrete method
	 default void juice()
	 {
		 System.out.println("Fanta Juice");
		 
	 }
	 
	 static void close()
	 {
		 System.out.println("Close Bottle");
	 }

}
