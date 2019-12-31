package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserLogin0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//1.Load the driver
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver Loaded....");
			
			
			//2.Get the DB connection via the driver
			String dbUrl = "jdbc:mysql://127.0.0.1:3307/ty_cg_nov6";
			
			System.out.println("Enter username and password");
			String dbUser = sc.nextLine();
			String dbPass = sc.nextLine();
			
			conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
			System.out.println("Connection Established....");
			
			
			//3.Issue the SQL queries via the connection
			String query = "SELECT * FROM users_info "
					+ "where userid = 1  AND password = 'hi' ";
			stmt = conn.createStatement();//statement is interface which has executeQuery()
			rs = stmt.executeQuery(query);
			System.out.println("Query Issued and Executed....");
			System.out.println("*****************************************");
			
			//4.Process the results returned by the SQL queries
			if(rs.next())
			{
				System.out.println("UserId : "+rs.getInt(1));
				System.out.println("UserName : "+rs.getString(2));
				System.out.println("UserEmail : "+rs.getString("email"));
				System.out.println("-------------------------------------");
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
				
				
		sc.close();
		
	  }

	}
}

//Driver Loaded....
//Enter username and password
//root
//root
//Connection Established....
//Query issued...
//*****************************************
//Query Issued and Executed....
//UserId : 1
//UserName : Shakthy
//UserEmail : sharanshakthy@gmail.com
//-------------------------------------

