package com.example.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/hibernate?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		String user = "hbstudent";
		String pass = "hbstudent";
		
		try {
			System.out.println("Connecting to database: " + jdbcUrl);
			
			Connection myConn =
					DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Connection successful!!!");
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
	}
	
}
