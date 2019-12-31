package com.cg.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.springcore.beans.Animal;
import com.cg.springcore.beans.Hello;
import com.cg.springcore.beans.Pet;

public class AnnotationConfigApp {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
		Hello hello1 = context.getBean(Hello.class);
		Hello hello2 = context.getBean(Hello.class);
		
		System.out.println("*******************************");
		System.out.println(hello1);
		System.out.println(hello2);
		System.out.println(hello1==hello2);
		
		System.out.println("*******************************");
		System.out.println(hello1.getMessage());
		System.out.println(hello1.getCount());
		
		System.out.println("********************************");
		Animal animal = context.getBean(Animal.class);
		animal.makeSound();
		
		
		System.out.println("********************************");
		Pet pet = context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		
		
		
	
	
	
	}

}