package com.capgemini.forestrymanagementsystemjdbc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.forestrymanagementsystemjdbc.bean.CustomerBean;
import com.capgemini.forestrymanagementsystemjdbc.factory.CustomerFactory;
import com.capgemini.forestrymanagementsystemjdbc.services.CustomerServices;

public class TestCustomer {
	public static boolean customerPredicate() {
		Scanner sc = new Scanner(System.in);

		CustomerServices services = CustomerFactory.instanceOfCustomerServices();
		CustomerBean bean = new CustomerBean();

		System.out.println("YOU ARE IN CUSTOMER PAGE");
		System.out.println("************************");
		while(true)
		{
			System.out.println("1.Add Customer \n2.Delete Customer \n3.Modify Customer"
					+ "\n4.Get Customer Details \n5.Get All Cutomer Details");
			int ch = sc.nextInt();
			
			switch(ch) {
			
				case 1: System.out.println("Enter the customer id to add");
						bean.setCustomerId(sc.nextInt());
						System.out.println("Enter the customer name");
						bean.setCustomerName(sc.next());
						System.out.println("Enter the address1");
						bean.setAddress1(sc.next());
						System.out.println("Enter the address2");
						bean.setAddress2(sc.next());
						System.out.println("Enter the town");
						bean.setTown(sc.next());
						System.out.println("Enter the postal code");
						bean.setPostalCode(sc.nextInt());
						System.out.println("Enter the email");
						bean.setEmail(sc.next());
						System.out.println("Enter the mobile number");
						bean.setMobileNumber(sc.nextLong());
						
						if(services.addCustomer(bean))
						{
							System.out.println("Customer details are added successfully");
						}
						else
						{
							System.err.println("Unable to add the customer details");
						}
						break;
						
				case 2: System.out.println("Enter the customer id to delete");
				        bean.setCustomerId(Integer.parseInt(sc.next()));
				        
				        if(services.deleteCustomer(bean.getCustomerId())){
				        	System.out.println("Customer details are deleted successfully");
				        }
				        else {
				        	System.err.println("Unable to delete the customer details");
				        }
				        break;
				        
				case 3:System.out.println("1.Modify CustomerName \n2.Modify Address1"
											+ "\n3.Modify Address2 \n4.Modify Town \n5.Modify PostalCode "
											+ "\n6.Modify Email"+ "\n7.Modify MobileNumber");
						int ch1 = sc.nextInt();
						
						System.out.println("Enter the Customer id to modify");
					    int id = sc.nextInt();
						
						switch (ch1) {
						case 1: System.out.println("Enter the new CustomerName");
								modifyName(id, sc.next());
								break;
						case 2: System.out.println("Enter the new Address1");
						        modifyAddress1(id, sc.next());
						        break;
						case 3: System.out.println("Enter the new Address2");
						        modifyAddress2(id, sc.next());
						        break;
						case 4: System.out.println("Enter the new Town");
						        modifyTown(id, sc.next());
						        break;
						case 5: System.out.println("Enter the new Postal Code");
						        modifyPostalCode(id, sc.nextInt());
						        break;
						case 6: System.out.println("Enter the new Email");
						        modifyEmail(id, sc.next());
						        break;
						case 7: System.out.println("Enter the new Mobile Number");
						        modifyMobileNumber(id, sc.nextLong());
						        break;
						default:System.out.println("Invalid choice");
								break;
						}
				
						if(services.modifyCustomer(customerBean)) {
							System.out.println("Customer details are modified successfully");
						}else {
							System.err.println("Unable to modify customer details");
						}
						break;
						
				case 4: System.out.println("Enter a customer id to get the details");
				        int id1 = sc.nextInt();
				        
				         CustomerBean bean1 = services.getCustomer(id1);
				         if(bean1 != null) {
				        	 System.out.println(bean1.getCustomerId());
				        	 System.out.println(bean1.getCustomerName());
				        	 System.out.println(bean1.getAddress1());
				        	 System.out.println(bean1.getAddress2());
				        	 System.out.println(bean1.getTown());
				        	 System.out.println(bean1.getPostalCode());
				        	 System.out.println(bean1.getEmail());
				        	 System.out.println(bean1.getMobileNumber());
				         }else {
				        	 System.err.println("Unable to get the customer details");
				         }
				         break;
				case 5: System.out.println("All customer details");
				        List<CustomerBean> customerBeanList = services.getAllCustomers();
				        System.out.println(customerBeanList);
				        break;

	         }
		}
	}

	

	static List<CustomerBean> customerBean = new ArrayList<CustomerBean>();
	
	public static boolean modifyName(int id, String newName) {
		for(int i = 0; i<customerBean.size(); i++ ) {
			if(customerBean.get(i).getCustomerId() == id) {
				customerBean.get(i).setCustomerName(newName);
				return true;
			}
		}
		return false;
	}
	
	public static boolean modifyAddress1(int id, String newAddress1) {
		for(int i =0; i<customerBean.size();i++) {
			if(customerBean.get(i).getCustomerId() == id) {
				customerBean.get(i).setAddress1(newAddress1);
				return true;
			}
		}
		return false;
	}
	
	public static boolean modifyAddress2(int id, String newAddress2) {
		for(int i = 0; i<customerBean.size();i++) {
			if(customerBean.get(i).getCustomerId() == id) {
				customerBean.get(i).setAddress2(newAddress2);
				return true;
			}
		}
		return false;
	}
	
	public static boolean modifyTown(int id, String newTown) {
		for(int i = 0; i<customerBean.size(); i++) {
			if(customerBean.get(i).getCustomerId() == id) {
				customerBean.get(i).setTown(newTown);
				return true;
			}
		}
		return false;
	}
	
	public static boolean modifyPostalCode(int id, int newPostalCode) {
		for(int i = 0; i<customerBean.size(); i++) {
			if(customerBean.get(i).getCustomerId() == id) {
				customerBean.get(i).setPostalCode(newPostalCode);
				return true;
			}
		}
		return false;
	}
	
	public static boolean modifyEmail(int id, String newEmail) {
		for(int i = 0; i<customerBean.size(); i++) {
			if(customerBean.get(i).getCustomerId() == id) {
				customerBean.get(i).setEmail(newEmail);
				return true;
			}
		}
		return false;
	}
	
	public static boolean modifyMobileNumber(int id, long newMobileNumber) {
		for(int i =0; i<customerBean.size(); i++) {
			if(customerBean.get(i).getCustomerId() == id) {
				customerBean.get(i).setMobileNumber(newMobileNumber);
				return true;
			}
		}
		return false;
	}
}

	
