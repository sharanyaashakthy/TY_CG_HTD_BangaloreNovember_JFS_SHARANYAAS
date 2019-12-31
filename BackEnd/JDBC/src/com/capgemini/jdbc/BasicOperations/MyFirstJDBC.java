package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJDBC {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; //object representation of the result table
		
		try {
			
			//1.Load the driver
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver loaded...");
			
			
			//2.Get the DB connection via the driver
			String dbUrl = "jdbc:mysql://localhost:3307/ty_cg_nov6"
					+ "?user=root&password=root";
			conn = DriverManager.getConnection(dbUrl);
			System.out.println("Connection Established...");
			
			
			//3.Issue the SQL queries via connection
			String query = "SELECT * FROM users_info";
			stmt = conn.createStatement();//statement is interface which has executeQuery()
			rs = stmt.executeQuery(query);
			System.out.println("Query issued...");
			System.out.println("*****************************************");
			
			
			//4.Process the results returned by the SQL queries
			while(rs.next()){
				System.out.println("UserId : "+ rs.getInt("userid"));
			    System.out.println("UserName : "+rs.getString("UserName"));
			    System.out.println("UserEmail : "+rs.getString("Email"));
			    System.out.println("*************************************");
				
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			//5.Close all the JDBC objects
		
				try {
					if(conn != null)
					    conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				
				try {
					if(stmt != null)
						stmt.close();
			    }catch(SQLException e) {
			    	e.printStackTrace();
			    }
				
				
				try {
					if(rs != null)
						rs.close();
			    }catch(SQLException e) {
			    	e.printStackTrace();
			    }
	
	
		}
		
	}

}


/*
Driver loaded...
Connection Established...
Query issued...
*****************************************
UserId : 1
UserName : Shakthy
UserEmail : sharanshakthy@gmail.com
*************************************
UserId : 2
UserName : Bala
UserEmail : bala@gmail.com
*************************************
UserId : 3
UserName : Ram
UserEmail : ram@gmail.com
*************************************
UserId : 5
UserName : Sam
UserEmail : sam@gmail.com
*************************************
 */
