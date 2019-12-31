package com.capgemini.forestrymanagementsystem.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.forestrymanagementsystem.bean.ProductBean;

public class ProductDAOImpl implements ProductDAO {
	
	Scanner sc = new Scanner(System.in);
	

	List<ProductBean> productBean = new ArrayList<ProductBean>();
	
	
	@Override
	public boolean addProduct(ProductBean bean) {
		for (ProductBean productBean2 : productBean) {
			if(productBean2.getProductId() == bean.getProductId())
			{
				return false;
			}
		}
		productBean.add(bean);
		return true;	
	}

	@Override
	public boolean deleteProduct(int productId) {
		for (ProductBean productBean2 : productBean) {
			if(productBean2.getProductId() == productId)
			{
				productBean.remove(productBean2);
				
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean modifyProduct(int productId) {
		if(! productBean.isEmpty())
		{
			System.out.println("1.Modify productName \n2.Modify ProductQuantity");
			int ch = sc.nextInt();
			
//			System.out.println("Enter the product id to modify");
//			int id = sc.nextInt();
//			
			switch (ch) {
			case 1:System.out.println("Enter the new ProductName");
				   modifyName(productId, sc.next());
			       //modifyName(id, sc.next());
			       break;
			case 2:System.out.println("Enter the new ProductQuantity");
			       modifyQuantity(productId, sc.nextInt());
			      // modifyQuantity(id, sc.nextInt());
			       break;

			default:System.out.println("Invalid choice");
				    break;
			}
			return true;
		}
		return false;
	}

	
	//modify methods
	//modifying product name
	public boolean modifyName(int id, String newName) {
		for(int i = 0; i<productBean.size(); i++) {
			if(productBean.get(i).getProductId() == id) {
				productBean.get(i).setProductName(newName);
				return true;
			}
		}
		return false;
	}
	
	//modifying product quantity
	public boolean modifyQuantity(int id, int newQuantity) {
		for(int i = 0; i<productBean.size(); i++) {
			if(productBean.get(i).getProductId() == id) {
				productBean.get(i).setProductQuantity(newQuantity);
				return true;
			}
		}
		return false;
	}

}
