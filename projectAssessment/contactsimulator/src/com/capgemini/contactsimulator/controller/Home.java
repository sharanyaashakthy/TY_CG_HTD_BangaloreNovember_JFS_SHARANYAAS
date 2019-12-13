package com.capgemini.contactsimulator.controller;

import java.util.Scanner;

public class Home {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Contact Simulator");
		System.out.println("****************************");
		
		while(true) {
			System.out.println("1.ContractPredicate \n2.Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:ContactPredicate.testContact();
			       break;

			case 2:Home.main(null);
				   break;
			}
		}
	}

}
