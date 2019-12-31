package com.capgemini.forestrymanagementsystem.controller;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.forestrymanagementsystem.bean.CustomerBean;
import com.capgemini.forestrymanagementsystem.dao.CustomerDAO;
import com.capgemini.forestrymanagementsystem.factory.CustomerFactory;

public class TestCustomer {
	public static void customerPredicate()
	{
		Scanner sc = new Scanner(System.in);
		
		CustomerBean bean = new CustomerBean();

		CustomerDAO dao = CustomerFactory.instanceOfCustomerDAOImpl();

		System.out.println("YOU ARE IN CUSTOMER PAGE");
		System.out.println("************************");
		while(true)
		{
			System.out.println("1.Add Customer \n2.Delete Customer \n3.Modify Customer"
					+ "\n4.Get Customer Details \n5.Get All Cutomer Details");
			int ch = sc.nextInt();

			switch(ch)
			{

				case 1: System.out.println("Enter the Customer id to add");
						int id = sc.nextInt();
						//validating customer id
					       boolean validateId = true;
					       String id1 = Integer.toString(id);
					       do {
					    	   String regex0 = "[0-9]{2}";
					    	   Pattern pattern0 = Pattern.compile(regex0);
					    	   Matcher matcher0 = pattern0.matcher(id1);
					    	   if(matcher0.matches()) {
					    		   bean.getCustomerId();
					    		   validateId = true;
					    	   }else {
					    		   System.err.println("Please enter valid customer id");
					    		   id1=sc.next();
					    		   validateId = false;
					    	   }
					    			  
					       }while(validateId = false);
						
						//validating name
						boolean validateName = true;
						System.out.println("Enter the Customer Name");
						String name = sc.next();
						do {
							String regex1 = "^[a-zA-Z\\s]{3,15}$";
							Pattern pattern1 = Pattern.compile(regex1);
							Matcher matcher1 = pattern1.matcher(name);
							if(matcher1.matches()) {
								bean.getCustomerName();
								validateName = true;
							}else {
								System.err.println("Please enter valid name");
								name = sc.next();
								validateName = false;
							}
						}while(validateName = false);
						
						//validating address1
						boolean validateAddress1 = true;
						System.out.println("Enter the Address1");
						String address1 = sc.next();
						do {
							String regex2 = "^[a-zA-Z\\s]{5,20}$";
							Pattern pattern2 = Pattern.compile(regex2);
							Matcher matcher2 = pattern2.matcher(address1);
							if(matcher2.matches()) {
								bean.getAddress1();
								validateAddress1 = true;
							}else {
								System.err.println("Please enter valid address1");
								address1 = sc.next();
								validateAddress1 = false;
							}
						}while(validateAddress1 = false);
						
					
						//validating address2
						boolean validateAddress2 = true;
						System.out.println("Enter the Address2");
						String address2 = sc.next();
						do {
							String regex3 = "^[a-zA-Z\\s]{5,20}$";
							Pattern pattern3 = Pattern.compile(regex3);
							Matcher matcher3 = pattern3.matcher(address2);
							if(matcher3.matches()) {
								bean.getAddress2();
								validateAddress2 = true;
							}else {
								System.err.println("Please enter valid address2");
								address2 = sc.next();
								validateAddress2 = false;
							}
						}while(validateAddress2 = false);
						
						//validating town
						boolean validateTown = true;
						System.out.println("Enter the Town");
						String town = sc.next();
						do {
							String regex4 = "^[a-zA-Z\\s]{5,15}$";
							Pattern pattern4 = Pattern.compile(regex4);
							Matcher matcher4 = pattern4.matcher(town);
							if(matcher4.matches()) {
								bean.getTown();
								validateTown = true;
							}else {
								System.err.println("Please enter valid name for the town");
								town = sc.next();
								validateTown = false;
							}
						}while(validateTown = false);
						
						
						//validating postalcode
						boolean validatePostalcode = true;
						System.out.println("Enter the Postal Code");
						int postalcode = sc.nextInt();
						String postalcode1 = Integer.toString(postalcode);
						do {
							String regex5 = "[0-9]{6}";
							Pattern pattern5 = Pattern.compile(regex5);
							Matcher matcher5 = pattern5.matcher(postalcode1);
							if(matcher5.matches()) {
								bean.getPostalCode();
								validatePostalcode = true;
							}else {
								System.err.println("Please enter valid postalcode");
								postalcode1 = sc.next();
								validatePostalcode = false;
							}
						}while(validatePostalcode = false);
						
						
						//validating email
						boolean validateEmail = true;
						System.out.println("Enter the Email");
						String email = sc.next();
						do {
							String regex6 = "^[A-Za-z0-9+_.-]+@(.+)$";
							Pattern pattern6 = Pattern.compile(regex6);
							Matcher matcher6 = pattern6.matcher(email);
							if(matcher6.matches()) {
								bean.getEmail();
								validateEmail = true;
							}else {
								System.err.println("Please enter valide email address");
								email = sc.next();
								validateEmail = false;
							}
						}while(validateEmail = false);
						
						//validating mobile number
						boolean validateMobilenumber = true;
						System.out.println("Enter the Mobile Number");
						long mobilenumber = sc.nextLong();
						String mobilenumber1 = Long.toString(mobilenumber);
						do {
							String regex7 = "[6789]{1}[0-9]{9}";
							Pattern pattern7 = Pattern.compile(regex7);
							Matcher matcher7 = pattern7.matcher(mobilenumber1);
							if(matcher7.matches()) {
								bean.getMobileNumber();
								validateMobilenumber = true;
							}else {
								System.err.println("Please enter valid mobile number");
								mobilenumber1 = sc.next();
							}
						}while(validateMobilenumber = false);
			
						bean.setCustomerId(id);
						bean.setCustomerName(name);
						bean.setAddress1(address1);
						bean.setAddress2(address2);
						bean.setTown(town);
						
						Integer.parseInt(postalcode1);
						bean.setPostalCode(postalcode);
						bean.setEmail(email);
						
						Long.parseLong(mobilenumber1);
						bean.setMobileNumber(mobilenumber);
			
						boolean b1 = dao.addCustomer(bean);
						if(b1) {
							System.out.println("Customer details added successfully");
						}
						else
						{
							System.out.println("Unable to add customer details");
						}
						break;

				case 2: System.out.println("Enter the customer id to delete");
						int id2 = sc.nextInt();
						boolean b2 = dao.deleteCustomer(id2);
						if(b2) {
							System.out.println("Customer details are deleted successfully");
						}
						else {
							System.out.println("Unable to delete customer details");
						}
						break;

				case 3: System.out.println("Enter the Customer id to modify"); 
						int id3 = sc.nextInt();
			
						boolean b3 = dao.modifyCustomer(id3);
						if(b3) {
							System.out.println("Customer details are modified");
						}
						else {
							System.out.println("Unable to modify customer details");
						}
						break;
	
				case 4: System.out.println("Enter the customer id to get details about a customer");
						int id4 = sc.nextInt();
			
						CustomerBean bean1 = dao.getCustomer(id4);
						if(bean1 != null) {
							System.out.println(bean1.getCustomerId());
							System.out.println(bean1.getCustomerName());
							System.out.println(bean1.getAddress1());
							System.out.println(bean1.getAddress2());
							System.out.println(bean1.getTown());
							System.out.println(bean1.getPostalCode());
							System.out.println(bean1.getEmail());
							System.out.println(bean1.getMobileNumber());
						}
						else {
							System.out.println("The customer with the given id does not exist");
						}
						break;

				case 5: System.out.println("All customer details");
						List<CustomerBean> bean2 = dao.getAllCustomers();
						if(bean2 != null) {
							for (CustomerBean customerBean : bean2) {
								System.out.println(bean2);
							}
						}
						else {
							System.out.println("Unable to get all the customer details");
						}
						break;

			    default: Home.main(null);
			}
		}	
	}



}
