package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class BankConnection {

	static String driver="com.mysql.cj.jdbc.Driver";
	static String url= "jdbc:mysql://localhost:3306/MyProjectJDBC_db";
	static String username="root";
	static String password="Mapapa@8390";
	static Connection conn;
	
	public static Connection connection() {
		try {
			Class.forName(driver);
			System.out.println("Driver loaded");
			try {
				conn= DriverManager.getConnection(url,username,password);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			System.out.println("connected successfully");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		return conn;
	}

//	public static Connection getConnection() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
