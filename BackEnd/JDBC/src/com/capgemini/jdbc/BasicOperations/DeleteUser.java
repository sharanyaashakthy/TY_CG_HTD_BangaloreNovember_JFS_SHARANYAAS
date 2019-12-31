package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteUser {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		try {
			//1.Load the driver
//			Driver driver = new com.mysql.jdbc.Driver();
//			DriverManager.registerDriver(driver);
			Class.forName(" com.mysql.jdbc.Driver()");
			System.out.println("Driver loaded.....");
			
			
			
			
			//2.Get the DB connection via the driver
			String dburl = "jdbc:mysql://127.0.0.1:3307/ty_cg_nov6";
			System.out.println("Enter the username and password");
			String dbUser = sc.nextLine();
			String dbPass = sc.nextLine();
			conn = DriverManager.getConnection(dburl, dbUser, dbPass);
			System.out.println("Connection Established");
			
			//3.Issue the SQL queries via the connection
			String query = "DELETE FROM users_info where userid = ? AND password = ? ";
			pstmt = conn.prepareStatement(query);
			System.out.println("Enter userid");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter Password: ");
			pstmt.setString(2, sc.nextLine());
			
			//4.Process the results returned by the SQL queries
			int count = pstmt.executeUpdate();
			if(count>0)
			{
				System.out.println("User Deleted");
			}
			else
			{
				System.err.println("Something went wrong");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		

		finally
		{
			//5.Close all the JDBC objects
			try {
				if(conn != null)
				    conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			try {
				if(pstmt != null)
					pstmt.close();
		    }catch(SQLException e) {
		    	e.printStackTrace();
		    }
			
			
			try {
				if(sc != null)
					sc.close();
		    }catch(Exception e) {
		    	e.printStackTrace();
		    }

			
		}

	
		}
		
	}

