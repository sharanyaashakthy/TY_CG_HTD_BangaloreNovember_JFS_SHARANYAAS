package com.cg.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springcore.beans.Hello;

public class LifeCycleTest {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Hello hello = context.getBean(Hello.class);
		System.out.println(hello.getMessage());
		System.out.println(hello.getCount());
		
		context.close();
		
		
	
	}

}
