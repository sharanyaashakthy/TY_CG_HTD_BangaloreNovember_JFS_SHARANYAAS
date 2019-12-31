package com.capgemini.forestrymanagementsystemjdbc.controller;

import java.util.Scanner;

public class Home {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("WELCOME TO HOME PAGE OF FORESTRY MANAGEMNET SYSTEM-JDBC");
			System.out.println("**************************************************");
			while(true)
			{
				System.out.println("Enter your choice");
				System.out.println("1.Customer \n2.Contract \n3.Product");
				System.out.println("**************************************************");
				int ch = sc.nextInt();
				switch(ch)
				{
					case 1: TestCustomer.customerPredicate();
							break;
					case 2: TestContract.contractPredicate();
							break;
					case 3: TestProduct.productPredicate();
							break;
					case 4: System.exit(0);
					default:System.out.println("Invalid choice");
				
				}	
			}
			
		}
	}
