package com.capgemini.forestrymanagementsystemjdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import com.capgemini.forestrymanagementsystemjdbc.bean.ProductBean;

public class ProductDAOImpl implements ProductDAO {
	
	FileReader reader;
	Properties prop;
	ProductBean productBean;
	
	public ProductDAOImpl() {
		try 
		{
			reader = new FileReader("productdb.properties");
			prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean addProduct(ProductBean bean) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), 
				prop.getProperty("dbUser"), prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("addQuery"))){
			pstmt.setInt(1, bean.getProductId());
			pstmt.setString(2, bean.getProductName()); 
			pstmt.setInt(3, bean.getProductQuantity());
	
			int count = pstmt.executeUpdate();
			
			if(count>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteProduct(int productId) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), 
				prop.getProperty("dbUser"), prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("deleteQuery"))){
			pstmt.setInt(1, productId);
			
			int count = pstmt.executeUpdate();
			
			if(count>0)
			{
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
		
	}

	@Override
	public boolean modifyProduct(int productId) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), 
				prop.getProperty("dbUser"), prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("modifyQuery"))){
			pstmt.setInt(1, productId);
		//	pstmt.setString(2, productName);
			int count = pstmt.executeUpdate();
			
			if(count>0)
			{
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

}
