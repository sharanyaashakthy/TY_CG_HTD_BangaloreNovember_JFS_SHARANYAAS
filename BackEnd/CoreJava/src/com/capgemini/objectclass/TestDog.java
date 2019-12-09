package com.capgemini.objectclass;

public class TestDog {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Dog d = new Dog("Jimmy");
		Class c = d.getClass();
		System.out.println(c);
		
		//creating object by using newInstance() present inside class Class
		Dog d1 = (Dog)c.newInstance(); //downcasting Class to Dog type and handle the exception
		System.out.println(d1.name); //returns null
		
		Class c1 = Class.forName("Dog");//acessing the forName() from Class to get the class name
		System.out.println(c1);//looks for the class only in the default package
	}
}

//class edu.capgemini.objectclass.Dog

//null

//Exception in thread "main" java.lang.ClassNotFoundException: Dog
//at java.net.URLClassLoader.findClass(URLClassLoader.java:382)
//at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
//at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:349)
//at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
//at java.lang.Class.forName0(Native Method)
//at java.lang.Class.forName(Class.java:264)
//at edu.capgemini.objectclass.TestDog.main(TestDog.java:14)