package com.capgemini.forestrymanagementsystemjdbc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.forestrymanagementsystemjdbc.bean.ProductBean;
import com.capgemini.forestrymanagementsystemjdbc.factory.ProductFactory;
import com.capgemini.forestrymanagementsystemjdbc.services.ProductServices;

public class TestProduct {
	public static void productPredicate() {
		Scanner sc = new Scanner(System.in);
		ProductServices services = ProductFactory.instanceOfProductServices();
		ProductBean bean = new ProductBean();
		
		while(true) {
			System.out.println("1.Add Product \n2.DeleteProduct \n3.Modify Product");
			int ch = sc.nextInt();
			
			switch(ch) {
				case 1:System.out.println("Enter the product id to add");
				       bean.setProductId(sc.nextInt());
	                   System.out.println("Enter the product name");
			           bean.setProductName(sc.next());
			           System.out.println("Enter the product quantity");
			           bean.setProductQuantity(sc.nextInt());
			           
			           boolean b1 = services.addProduct(bean);
			           if(b1) {
			        	   System.out.println("Product details are added successfully");
			           }
			           else {
			        	   System.out.println("Unable to add the product details");
			           }
			           break;
			           
				case 2:System.out.println("Enter the product id to delete the product details");
				       int prodId = sc.nextInt();
				       
				       boolean b2 = services.deleteProduct(prodId);
				       if(b2) {
				    	   System.out.println("Product details are deleted successfully");
				       }
				       else {
				    	   System.out.println("Unable to delete the product details");
				       }
				       break;
				       
				case 3:System.out.println("1.Modify product name \n2.Modify product quantity");
					   int ch1 = sc.nextInt();
					   
					   System.out.println("Enter the product id to modify");
					   int prodId1 = sc.nextInt();
					   
					   switch (ch1) {
						case 1:System.out.println("Enter the new product name");
						       modifyprodName(prodId1, sc.next());
						       break;
						 
						case 2:System.out.println("Enter the new product quantity");
	                           modifyProdQuantity(prodId1, sc.nextInt());
	                           break;
	                           
						default:System.out.println("Invalid choice");
							break;
					
					}
					 
					   boolean b3 = services.modifyProduct(prodId1);
					   if(b3) {
						  System.out.println("Product details are modified successfully");
					   }
					   else {
						  System.out.println("Unable to modify product details");
					   }
					   break;
					       
			   default:Home.main(null);
				         break;
				    	   
			}
		}
		
		
	}
	

	static List<ProductBean> bean = new ArrayList<ProductBean>();
	

	public static void modifyprodName(int prodId1, String newName) {
		   for(int i = 0; i<bean.size(); i++) {
			   if(bean.get(i).getProductId() == prodId1) {
				  bean.get(i).setProductName(newName);
			   }
			   
		   }
	}

	public static void modifyProdQuantity( int prodId1, int newQuantity ) {
		for(int i = 0; i<bean.size(); i++) {
			if(bean.get(i).getProductId() == prodId1) {
				bean.get(i).setProductQuantity(newQuantity);
			}
		}
			
	}

}
