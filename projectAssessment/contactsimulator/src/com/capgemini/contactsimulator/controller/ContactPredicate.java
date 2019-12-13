package com.capgemini.contactsimulator.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.contactsimulator.dto.ContactBean;

public class ContactPredicate {
	public static void testContact() {
		System.out.println("You are in ContractPredicate page!");
	    System.out.println("**********************************");
	    

	    List<ContactBean> list = new ArrayList<ContactBean>();
	    
	    Scanner  sc = new Scanner(System.in);
	    
	    while(true) {
	    	System.out.println("1.ShowAllContacts \n2.SearchContact \n3.AddContact"
	    		            	+ " \n4.DeleteContact \n5.updateContact");
	    	
	    	int choice1 = sc.nextInt();
	    	
	    	switch (choice1) {
			case 1:System.out.println("All Contact Details");
			      for(int i = 0; i< list.size(); i++) {
			    	  System.out.println(list.get(i).getName());
			    	  System.out.println(list.get(i).getNumber());
			    	  System.out.println(list.get(i).getCategory());
				}
				break;
				
			case 2:System.out.println("Enter a name to search for the contact details");
			       String name = sc.next();
			       
			       for (ContactBean contactBean : list) {
			    	   if(contactBean.getName() == name) {
			    		   contactBean.getName();
			    		   contactBean.getNumber();
			    		   contactBean.getCategory();
			    	   }
			    	   else {
			    		   System.err.println("Unable to get the contact details");
			    	   }
				}

			case 3:System.out.println("Enter a name to add to contacts");
			       String name1 = sc.next();
			       System.out.println("Enter the number");
			       long num = sc.nextLong();
			       System.out.println("Enter the category");
			       String category = sc.next();
			       
			       for(int i=0; i<list.size();i++) {
			    	   if(list.get(i).getName() != name1) {
			    		   list.get(i).setName(name1);
				    	   list.get(i).setNumber(num);
				    	   list.get(i).setCategory(category);
			           }
			    	   else {
			    		   System.err.println("unableto add the details");
			    	   }
			    	}
			       break;
			    
			case 4:System.out.println("Enter a name to delete from contacts");
			       String name2 = sc.next();
			       
			       ContactBean bean = new ContactBean();
			       
			       for(int i=0; i<list.size(); i++) {
			    	   if(list.get(i).getName() == name2) {
			    		   list.remove(bean);
			    	   }
			    	   else {
			    		   System.err.println("Unable to delete the details");
			    	   }
			       }
			       break;
			       
			case 5:System.out.println("Enter a name to update the contact details");
                   String name3 = sc.next();
	                while(true) {
	                	System.out.println("1.UpdateName \n2.UpdateNumber \n3.UpdateCategory");
				        int choice2 = sc.nextInt();
				        
				        switch (choice2) {
				        
						case 1:System.out.println("Enter the newName");
						       updateName(name3, sc.next());
						       break;
						       
						case 2:System.out.println("Enter the newNumber");
						       updateNumber(name3, sc.nextLong());
						       break;
						       
						case 3:System.out.println("Enter the newCategory");
						       updateCategory(name3, sc.next());
						       break;
						 
						default:System.out.println("Invalid Choice");
							    break;
						}break;
	                }
				        
		    default:Home.main(null);
		            break;
			
	         }	
			}
	    }
	static  List<ContactBean> list1 = new ArrayList<ContactBean>();

    public static boolean updateCategory(String name3, String newCategory) {
    	for(int i =0; i<list1.size(); i++) {
			if(list1.get(i).getName() == name3) {
				list1.get(i).setCategory(newCategory);
				return true;
			}
		}
		return false;
		
	}

	public static boolean updateNumber(String name3, long newNumber) {
    	for(int i =0; i<list1.size(); i++) {
			if(list1.get(i).getName() == name3) {
				list1.get(i).setNumber(newNumber);
				return true;
			}
		}
		return false;
	}

	public static boolean updateName(String name3, String newName) {
		for(int i=0; i<list1.size(); i++) {
			if(list1.get(i).getName() == name3) {
				list1.get(i).setName(newName);
				return true;
			}
		}
		return false;
	}

}
