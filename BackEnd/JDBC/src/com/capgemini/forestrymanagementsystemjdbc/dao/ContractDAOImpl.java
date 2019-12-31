package com.capgemini.forestrymanagementsystemjdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import com.capgemini.forestrymanagementsystemjdbc.bean.ContractBean;

public class ContractDAOImpl implements ContractDAO {
	FileReader reader;
	Properties prop;
	ContractBean contractBean;
	
	public ContractDAOImpl() {
		try 
		{
			reader = new FileReader("contractdb.properties");
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
	public boolean addContract(ContractBean bean) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), 
				prop.getProperty("dbUser"), prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("addQuery"))){
			pstmt.setInt(1, bean.getContractNumber());
			pstmt.setInt(2, bean.getCustomerId());
			pstmt.setInt(3, bean.getProductId());
			pstmt.setInt(4, bean.getHaulierId());
			pstmt.setInt(5, bean.getQuantity());
			pstmt.setString(6, bean.getDeliveryDate());
			pstmt.setString(7, bean.getDeliveryDay());
					
					
					
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
	public boolean deleteContract(int contractNumber) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"), 
				prop.getProperty("dbUser"), prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("deleteQuery"))){
			pstmt.setInt(1, contractNumber);
			
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
