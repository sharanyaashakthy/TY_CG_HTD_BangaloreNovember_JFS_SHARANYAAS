package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class EvolvedJDBC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dbUrl = "jdbc:mysql://127.0.0.1:3307/ty_cg_nov6";
		System.out.println("Enter the username and password");
		String dbUser = sc.nextLine();
		String dbPass = sc.nextLine();
		String query = "SELECT * FROM users_info";
		
		try(Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query)){
			while(rs.next())
			{
				System.out.println("UserId : "+ rs.getInt("userid"));
			    System.out.println("UserName : "+rs.getString("UserName"));
			    System.out.println("UserEmail : "+rs.getString("Email"));
			   // System.out.println("userPhone : "+rs.getLong("phone"));
			    System.out.println("*************************************");	
			}
			sc.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
