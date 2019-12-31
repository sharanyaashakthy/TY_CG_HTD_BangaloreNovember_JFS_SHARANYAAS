package com.capgemini.forestrymanagementsystemjdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.forestrymanagementsystemjdbc.bean.CustomerBean;


public class CustomerDAOImpl implements CustomerDAO {
	FileReader reader;
	Properties prop;
	CustomerBean customerBean;
	
	public CustomerDAOImpl() {
		try 
		{
			reader = new FileReader("customerdb.properties");
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
	public List<CustomerBean> getAllCustomers() {
		List<CustomerBean> list = new ArrayList<CustomerBean>();
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"), 
				prop.getProperty("dbUser"), prop.getProperty("dbPassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("getAllQuery"))){
					while(rs.next())
					{
						customerBean = new CustomerBean();
						customerBean.setCustomerId(rs.getInt(1));
						customerBean.setCustomerName(rs.getString(2));
						customerBean.setAddress1(rs.getString(3));
						customerBean.setAddress2(rs.getString(4));
						customerBean.setTown(rs.getString(5));
						customerBean.setPostalCode(rs.getInt(6));
						customerBean.setEmail(rs.getString(7));
						customerBean.setMobileNumber(rs.getLong(8));
						list.add(customerBean);
					}
					return list;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addCustomer(CustomerBean bean) {

		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), 
				prop.getProperty("dbUser"), prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("addQuery"))){
			pstmt.setInt(1, bean.getCustomerId());
			pstmt.setString(2, bean.getCustomerName());
			pstmt.setString(3, bean.getAddress1());
			pstmt.setString(4, bean.getAddress2());
			pstmt.setString(5, bean.getTown());
			pstmt.setInt(6, bean.getPostalCode());
			pstmt.setString(7, bean.getEmail());
			pstmt.setLong(8, bean.getMobileNumber());
	
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
	public boolean deleteCustomer(int customerId) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), 
				prop.getProperty("dbUser"), prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("deleteQuery"))){
			pstmt.setInt(1, customerId);
			
			int count = pstmt.executeUpdate();
			
			if(count>0)
			{
				return true;
			}else {
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
	public boolean modifyCustomer(int customerId) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), 
				prop.getProperty("dbUser"), prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("modifyNameQuery"))){

//			pstmt.setInt(1, customerBean.getCustomerId());
//			pstmt.setString(2, customerBean.getCustomerName());
//			pstmt.setString(3, customerBean.getAddress1());
//			pstmt.setString(4, customerBean.getAddress2());
//			pstmt.setString(5,customerBean.getTown());
//			pstmt.setInt(6, customerBean.getPostalCode());
//			pstmt.setString(7,customerBean.getEmail());
//			pstmt.setLong(8, customerBean.getMobileNumber());
		
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
	public CustomerBean getCustomer(int customerId) {
		CustomerBean customerBean= null;
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), 
				prop.getProperty("dbUser"), prop.getProperty("dbPassword"));
				
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("getQuery"))){
			    pstmt.setInt(1, customerId);
			    ResultSet rs = pstmt.executeQuery();
			  while(rs.next())
			  {
				customerBean = new CustomerBean();
				customerBean.setCustomerId(rs.getInt(1));
				customerBean.setCustomerName(rs.getString(2));
				customerBean.setAddress1(rs.getString(3));
				customerBean.setAddress2(rs.getString(4));
			    customerBean.setTown(rs.getString(5));
			    customerBean.setPostalCode(rs.getInt(6));
			    customerBean.setEmail(rs.getString(7));
			    customerBean.setMobileNumber(rs.getLong(8));
			  }	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return customerBean;
	}

}