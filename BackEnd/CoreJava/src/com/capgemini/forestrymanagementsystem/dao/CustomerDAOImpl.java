package com.capgemini.forestrymanagementsystem.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.capgemini.forestrymanagementsystem.bean.CustomerBean;

public class CustomerDAOImpl implements CustomerDAO {
	Scanner sc = new Scanner(System.in);
	
	List<CustomerBean> customerBean = new ArrayList<CustomerBean>();

	@Override
	public List<CustomerBean> getAllCustomers() {
		return customerBean ;
	}

	@Override
	public boolean addCustomer(CustomerBean bean) {
		for (CustomerBean customerBean : customerBean) {
			if(customerBean.getCustomerId() == bean.getCustomerId())
				return false;
		}
		customerBean.add(bean);
		return true;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		for (CustomerBean customerBean2 : customerBean) {
			if(customerBean2.getCustomerId() == customerId)
			{
				customerBean.remove(customerBean2);
				return true;
			}
		}
		return false;
	}
	
	@Override
	public CustomerBean getCustomer(int customerId) {
		for (CustomerBean customerBean2 : customerBean) {
			if(customerBean2.getCustomerId() == customerId)
			{
				return customerBean2;
			}
		}
		return null;
	}


	@Override
	public boolean modifyCustomer(int customerId) {
		if(! customerBean.isEmpty())
		{
			System.out.println("1.Modify CustomerName \n2.Modify Address1"
								+ "\n3.Modify Address2 \n4.Modify Town \n5.Modify PostalCode "
								+ "\n6.Modify Email"+ "\n7.Modify MobileNumber");
			int ch = sc.nextInt();
		
			
			switch (ch) {
			case 1: System.out.println("Enter the new CustomerName");
					modifyName(customerId, sc.next());
					break;
			case 2: System.out.println("Enter the new Address1");
			        modifyAddress1(customerId, sc.next());
			        break;
			case 3: System.out.println("Enter the new Address2");
			        modiyAddress2(customerId, sc.next());
			        break;
			case 4: System.out.println("Enter the new Town");
			        modifyTown(customerId, sc.next());
			        break;
			case 5: System.out.println("Enter the new Postal Code");
			        modifyPostalCode(customerId, sc.nextInt());
			        break;
			case 6: System.out.println("Enter the new Email");
			        modifyEmail(customerId, sc.next());
			        break;
			case 7: System.out.println("Enter the new Mobile Number");
			        modifyMobileNumber(customerId, sc.nextLong());
			        break;
			default:System.out.println("Invalid choice");
					break;
			}
		return true;
		}
		return false;
	}

	//modify methods 
	
	//updating name
	public boolean modifyName(int id, String newName) 
	{
		for(int i=0; i<customerBean.size();i++) {
			if(customerBean.get(i).getCustomerId() == id) {
				customerBean.get(i).setCustomerName(newName);
				return true;
			}
		}
		return false;
		
		
	}
	//updating address1
	public boolean modifyAddress1(int id, String newAddress1) 
	{
		for (CustomerBean customerBean2 : customerBean) {
			if(customerBean2.getCustomerId() == id) {
				customerBean2.setAddress1(newAddress1);
				return true;
			}
		}
		return false;
	}
	//updating address2
	public boolean modiyAddress2(int id, String newAddress2) {
		for (CustomerBean customerBean2 : customerBean) {
			if(customerBean2.getCustomerId() == id)
			{
				customerBean2.setAddress2(newAddress2);
				return true;
			}
		}	
		return false;
	}
	//updating town
	public boolean modifyTown(int id, String newTown) {
		for (CustomerBean customerBean2 : customerBean) {
			if(customerBean2.getCustomerId() == id)
			{
				customerBean2.setTown(newTown);
				return true;
			}
		}	
		return false;
	}
	//updating postal code
	public boolean modifyPostalCode(int id, int newPostalCode) {
		for (CustomerBean customerBean2 : customerBean) {
			if(customerBean2.getCustomerId() == id)
			{
				customerBean2.setPostalCode(newPostalCode);
				return true;
			}
		}	
		return false;
	}
	//updating email
	public boolean modifyEmail(int id, String newEmail) {
		for (CustomerBean customerBean2 : customerBean) {
			if(customerBean2.getCustomerId() == id)
			{
				customerBean2.setEmail(newEmail);
				return true;
			}
		}
		return false;
	}
	//updating mobile number
	public boolean modifyMobileNumber(int id, long newMobileNumber) {
		for (CustomerBean customerBean2 : customerBean) {
			if(customerBean2.getCustomerId() == id)
			{
				customerBean2.setMobileNumber(newMobileNumber);
				return true;
			}
		}
		return false;
	}
}
