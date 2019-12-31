package com.capgemini.forestrymanagementsystemjdbc.controller;

import java.util.Scanner;

import com.capgemini.forestrymanagementsystemjdbc.bean.ContractBean;
import com.capgemini.forestrymanagementsystemjdbc.factory.ContractFactory;
import com.capgemini.forestrymanagementsystemjdbc.services.ContractServices;

public class TestContract {
	public static void contractPredicate() {
		Scanner sc = new Scanner(System.in);
		ContractServices services =  ContractFactory.instanceOfContractServices();
		ContractBean bean = new ContractBean();
		System.out.println("YOU ARE IN CONTRACT PAGE");
		System.out.println("************************");
		while(true) {
			System.out.println("1.Add Contract \n2.Delete Contract");
			int ch = sc.nextInt();
			
			switch (ch) {
			case 1:System.out.println("Enter the contract number to add");
			       bean.setContractNumber(Integer.parseInt(sc.next()));
			       System.out.println("Enter the customer id");
			       bean.setCustomerId(Integer.parseInt(sc.next()));
			       System.out.println("Enter the product id");
			       bean.setProductId(Integer.parseInt(sc.next()));
			       System.out.println("Enter the haulier id");
			       bean.setHaulierId(Integer.parseInt(sc.next()));
			       System.out.println("Enter the delivery date");
			       bean.setDeliveryDate(sc.next());
			       System.out.println("Enter the delivery day");
			       bean.setDeliveryDay(sc.next());
			       System.out.println("Enter the quantity");
			       bean.setQuantity(Integer.parseInt(sc.next()));
			       
			       boolean b1 = services.addContract(bean);
			       
			       if(b1) {
			    	   System.out.println("Contract details are added successfully");
			       }
			       else {
			    	   System.out.println("Unable to add the contract details");
			       }
			       break;
			       
			       
			case 2:System.out.println("Enter the contract number to delete the contract");
                   int contractNum = sc.nextInt();
                   
                   boolean b2 = services.deleteContract(contractNum);
                   
                   if(b2) {
                	   System.out.println("Contract details are deleted successfully");
                   }
                   else {
                	   System.out.println("Unable to delete the contract details ");
                   }
                   break;
			
	
			default:System.out.println("Invalid choice");
				break;
			}

		}
		
	}
}
