package com.capgemini.abstractkeyword;

public class TestHeroHonda {
	public static void main(String[] args) {
		Honda h = new Honda();
		h.design();
		h.engine();
		
		System.out.println("-----------------------");
		
		HeroHonda h1 = new Honda();
		h1.design();
		h1.engine();
	}

}
/*
HeroHonda is designed
HeroHonda engine is fine
-----------------------
HeroHonda is designed
HeroHonda engine is fine
 */
