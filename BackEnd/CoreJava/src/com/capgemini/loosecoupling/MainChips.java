package com.capgemini.loosecoupling;

public class MainChips {
	public static void main(String[] args) {
		EatChips e = new EatChips();
		Chips c = new Chips();
		Lays l = new Lays();
		Kurkure k = new Kurkure();
		Bingo b = new Bingo();	
		e.feed(l);
	}

}
/*
Open Lays pack
Eat Lays
*/
