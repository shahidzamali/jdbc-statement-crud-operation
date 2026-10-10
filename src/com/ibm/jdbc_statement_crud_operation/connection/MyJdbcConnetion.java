package com.ibm.jdbc_statement_crud_operation.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class MyJdbcConnetion {
	
	public static Connection getMyConnection() throws SQLException {
		Driver driver = new Driver();
	 
		DriverManager.registerDriver(driver);
		
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-a16","root","@Shahid2331237");
	}

}
