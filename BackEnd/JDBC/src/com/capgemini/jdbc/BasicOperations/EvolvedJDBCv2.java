package com.capgemini.jdbc;


import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class EvolvedJDBCv2 {
	public static void main(String[] args) {
		FileReader reader = null;
		Properties prop  = null;
		try {
			 reader = new FileReader("C:\\Users\\Administrator\\Desktop\\db.properties");
			 prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
			System.out.println("Driver Loaded.......");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"), prop.getProperty("dbPassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query1"))
			)
		{
			while(rs.next()){
				System.out.println("UserId : "+ rs.getInt("userid"));
			    System.out.println("UserName : "+rs.getString("UserName"));
			    System.out.println("UserEmail : "+rs.getString("Email"));
			    System.out.println("*************************************");
				
			}	
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
