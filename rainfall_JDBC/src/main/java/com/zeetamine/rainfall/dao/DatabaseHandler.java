package com.zeetamine.rainfall.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DatabaseHandler {
	public static Connection establishConnection() {
		ResourceBundle rb = ResourceBundle.getBundle("dbconfig");
		String dc = rb.getString("driveclass");
		String url = rb.getString("url");
		String user = rb.getString("user");
		String password = rb.getString("password");
		
		Connection con = null;
		try {
			Class.forName(dc);
			con = DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
		
		return con;
		
	}

}
