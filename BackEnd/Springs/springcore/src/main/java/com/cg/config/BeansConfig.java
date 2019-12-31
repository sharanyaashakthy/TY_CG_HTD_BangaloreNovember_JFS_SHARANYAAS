package com.cg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.cg.springcore.beans.Cat;
import com.cg.springcore.beans.Dog;
import com.cg.springcore.beans.Hello;
import com.cg.springcore.beans.Pet;

@Configuration//it represents empty beans xml 
public class BeansConfig {
	
	@Bean("hello")// name of the bean for representing the bean xml with content
	@Scope("prototype")
	public Hello  getHello() {
		Hello hello=new Hello();
		hello.setMessage("hi");
		hello.setCount(100);
		return hello;
	}
	
	//@Bean("dog") // by default, bean name will be same as the method name
	@Bean(name="dog")
	public Dog getDog() {
		return new Dog();
	}
	
	@Bean("pet")
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("catyy");
		//pet.setAnimal(getDog());
		return pet;
	}
	
	@Bean("cat")
	@Primary
	public Cat getCat() {
		return new Cat();
	}

}
