package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserEmailUpdate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		try {
			//1.Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded........");
			
			//2.Get the db connection via driver
			String dbUrl = "jdbc:mysql://127.0.0.1:3307/ty_cg_nov6";
			
			System.out.println("Enter DB User Name and Password");
			String dbUser = sc.nextLine();
			String dbPass = sc.nextLine();
			
			conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
			System.out.println("Connection Established.......");
			
			//3.Issue the SQL queries via connection
			String query = "update users_info set email = ? where userid = ? and password = ?";
			pstmt = conn.prepareStatement(query);
			
			System.out.println("Enter the user id ");
			pstmt.setInt(2, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter the new Email ");
			pstmt.setString(1, sc.nextLine());
			System.out.println("Enter the password to update ");
			pstmt.setString(3, sc.nextLine());
			
			int count  = pstmt.executeUpdate();
			
			//4.Process the results returned by SQL queries 
			if(count>0)
			{
				System.out.println("Query Ok, " + count + " Row affected");
			}
			else
			{
				System.err.println("Something went wrong");
			}
			System.out.println("Query Issued......");
				
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
