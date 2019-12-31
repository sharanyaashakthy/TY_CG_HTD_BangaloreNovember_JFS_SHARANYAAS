package com.capgemini.forestrymanagementsystem.controller;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.forestrymanagementsystem.bean.ProductBean;
import com.capgemini.forestrymanagementsystem.dao.ProductDAO;
import com.capgemini.forestrymanagementsystem.factory.ProductFactory;

public class TestProduct {
	public static void productPredicate()
	{
		Scanner sc = new Scanner(System.in);
		
		ProductDAO dao = ProductFactory.instanceOfProductDAOImpl();
		ProductBean bean = new ProductBean();
		
		System.out.println("YOU ARE IN PRODUCT PAGE");
		System.out.println("************************");
		
		while(true) {
			System.out.println("1.Add product \n2.Delete product \n3.Modify product");
			int ch = sc.nextInt();
					
			switch (ch) {
			case 1:  //validating product id
				       boolean validateProductId = true;
				       System.out.println("Enter the product id to add");
				       int productId = sc.nextInt();
				       String productId1 = Integer.toString(productId);
				       do {
				    	   String regex1 = "[0-9]{2}";
				    	   Pattern pattern1 = Pattern.compile(regex1);
				    	   Matcher matcher1 = pattern1.matcher(productId1);
				    	   if(matcher1.matches()) {
				    		   bean.getProductId();
				    		   validateProductId = true;
				    	   }else {
				    		   System.err.println("Please enter valid product id");
				    		   validateProductId = false;
				    	   }
				    			  
				       }while(validateProductId = false);
			
				   //validating product name
				   System.out.println("Enter the product name");
			       String productName = sc.next();
				   boolean validateproductName = true;
					do {
						String regex2 = "^[a-zA-Z\\s]{3,15}$";
						Pattern pattern2 = Pattern.compile(regex2);
						Matcher matcher2 = pattern2.matcher(productName);
						if(matcher2.matches()) {
							bean.getProductName();
							validateproductName = true;
						}else {
							System.err.println("Please enter valid product name");
							productName = sc.next();
							validateproductName= false;
						}
					}while(validateproductName = false);
					
					
				   //validating product quantity
			       System.out.println("Enter the product quantity");
			       int productQuantity = sc.nextInt();
			      
			       boolean validateProdQuantity = true;
			       System.out.println("Enter the product quantity");
			       int prodQuan = sc.nextInt();
			       String prodQuan1 = Integer.toString(prodQuan);
			       do {
			    	   String regex3 = "[0-9]{2}";
			    	   Pattern pattern3 = Pattern.compile(regex3);
			    	   Matcher matcher3 = pattern3.matcher(prodQuan1);
			    	   if(matcher3.matches()) {
			    		   bean.getProductQuantity();
			    		   validateProdQuantity = true;
			    	   }else {
			    		   System.err.println("Please enter valid product Quantity");
			    		   validateProdQuantity = false;
			    	   }
			    			  
			       }while(validateProdQuantity = false);
			       
			       Integer.parseInt(productId1);
			       bean.setProductId(productId);
			       
			       bean.setProductName(productName);
			       
			       Integer.parseInt(prodQuan1);
			       bean.setProductQuantity(productQuantity);
			       
			       boolean b1 = dao.addProduct(bean);
			       if(b1) {
			    	   System.out.println("Product details added successfully");
			       }
			       else {
			    	   System.out.println("Unable to add product details");
			       }
				
				   break;
				   
			case 2: System.out.println("Enter the product id to delete");
			        int productId2 = sc.nextInt();
			        boolean b2 = dao.deleteProduct(productId2);
			        if(b2) {
			        	System.out.println("Product details deleted successfully");
			        }
			        else {
			        	System.out.println("Unable to delete the product details");
			        }
			        break;
			        
			case 3: System.out.println("Enter the Product id to update"); 
					int productId3 = sc.nextInt();
		
					boolean b3 = dao.modifyProduct(productId3);
					if(b3) {
						System.out.println("Product details are modified successfully");
					}
					else {
						System.out.println("Unable to modify product details");
					}
					break;
			    

			default: Home.main(null);
				     break;
			}
		}

	}

}
