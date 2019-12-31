package com.capgemini.forestrymanagementsystem.controller;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.forestrymanagementsystem.bean.ContractBean;
import com.capgemini.forestrymanagementsystem.dao.ContractDAO;
import com.capgemini.forestrymanagementsystem.factory.ContractFactory;

public class TestContract {
	public static void contractPredicate()
	{
		Scanner sc = new Scanner(System.in);
		
		ContractDAO dao = ContractFactory.instanceOfContractDAOImpl();
		ContractBean bean = new ContractBean();
		
		System.out.println("YOU ARE IN CONTRACT PAGE");
		System.out.println("************************");
		
		while(true) {
			System.out.println("1.Add contract \n2.Delete contract");
			int ch = sc.nextInt();
			
			switch (ch) {
			
			case 1://validating contract number
				   boolean validateContractNumber = true;
				   System.out.println("Enter the contract number to add");
			       int contractNumber = sc.nextInt();
			       String contractNumber1 = Integer.toString(contractNumber);
			       do {
			    	   String regex1 = "[0-9]{2}";
			    	   Pattern pattern1 = Pattern.compile(regex1);
			    	   Matcher matcher1 = pattern1.matcher(contractNumber1);
			    	   if(matcher1.matches()) {
			    		   bean.getContractNumber();
			    		   validateContractNumber = true;
			    	   }else {
			    		   System.err.println("Please enter valid contract number");
			    		   contractNumber1 = sc.next();
			    		   validateContractNumber = false;
			    	   }
			       }while(validateContractNumber = false);
			       
			       //validating customer id
			       boolean validateCustId = true;
			       System.out.println("Enter the customer id");
			       int custId = sc.nextInt();
			       String custId1 = Integer.toString(custId);
			       do {
			    	   String regex2 = "[0-9]{2}";
			    	   Pattern pattern2 = Pattern.compile(regex2);
			    	   Matcher matcher2 = pattern2.matcher(custId1);
			    	   if(matcher2.matches()) {
			    		   bean.getCustomerId();
			    		   validateCustId = true;
			    	   }else {
			    		   System.err.println("Please enter valid customer id");
			    		   validateCustId = false;
			    	   }
			    			  
			       }while(validateCustId = false);
			       
			       //validating product id
			       boolean validateProdId = true;
			       System.out.println("Enter the product id");
			       int prodId = sc.nextInt();
			       String prodId1 = Integer.toString(custId);
			       do {
			    	   String regex3 = "[0-9]{2}";
			    	   Pattern pattern3 = Pattern.compile(regex3);
			    	   Matcher matcher3 = pattern3.matcher(prodId1);
			    	   if(matcher3.matches()) {
			    		   bean.getProductId();
			    		   validateProdId = true;
			    	   }else {
			    		   System.err.println("Please enter valid product id");
			    		   validateProdId = false;
			    	   }
			    			  
			       }while(validateProdId = false);
			       
			       
			       //validating haulier id
			       boolean validateHaulierId = true;
			       System.out.println("Enter the haulier id");
			       int haulId = sc.nextInt();
			       String haulId1 = Integer.toString(haulId);
			       do {
			    	   String regex4 = "[0-9]{2}";
			    	   Pattern pattern4 = Pattern.compile(regex4);
			    	   Matcher matcher4 = pattern4.matcher(haulId1);
			    	   if(matcher4.matches()) {
			    		   bean.getHaulierId();
			    		   validateHaulierId = true;
			    	   }else {
			    		   System.err.println("Please enter valid haulier id");
			    		   validateHaulierId = false;
			    	   }
			    			  
			       }while(validateHaulierId = false);
			       
			       System.out.println("Enter the delivery date");
			       String delDate = sc.next();
			       System.out.println("Enter the delivery day");
			       String delDay = sc.next();
			       
			       
			       
			       //validating quantity
			       boolean validateQuantity = true;
			       System.out.println("Enter the quantity");
			       int quan = sc.nextInt();
			       String quan1 = Integer.toString(quan);
			       do {
			    	   String regex7 = "[0-9]{2}";
			    	   Pattern pattern7 = Pattern.compile(regex7);
			    	   Matcher matcher7 = pattern7.matcher(quan1);
			    	   if(matcher7.matches()) {
			    		   bean.getQuantity();
			    		   validateQuantity = true;
			    	   }else {
			    		   System.err.println("Please enter valid Quantity");
			    		   validateQuantity = false;
			    	   }
			    			  
			       }while(validateQuantity = false);
			       
			       Integer.parseInt(contractNumber1);
			       bean.setContractNumber(contractNumber);
			       
			       Integer.parseInt(custId1);
			       bean.setCustomerId(custId);
			       
			       Integer.parseInt(prodId1);
			       bean.setProductId(prodId);
			       
			       Integer.parseInt(haulId1);
			       bean.setHaulierId(haulId);
			       
			       bean.setDeliveryDate(delDate);
			       bean.setDeliveryDay(delDay);
			       
			       Integer.parseInt(quan1);
			       bean.setQuantity(quan);
			       
			       boolean b1 = dao.addContract(bean);
			       if(b1) {
			    	   System.out.println("Contract details added successfully");
			       }
			       else {
			    	   System.out.println("Unable to add contract details");
			       }
			       break;
			       
			case 2:System.out.println("Enter the contract number to delete");
			       int contractNum1 = sc.nextInt();
			       boolean b2 = dao.deleteContract(contractNum1);
			       if(b2) {
			    	   System.out.println("Contract details are deleted successfully");
			       }
			       else {
			    	   System.out.println("Unable to delete the contract details");
			       }
			       break;
			

			default:Home.main(null);
				    break;
			}
		}

	}

}
