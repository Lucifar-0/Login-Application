package com.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnector {
	public static Connection getConnection() {
		
		Connection con=null;
		try {
		 Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "admin");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return con;
	}
}
