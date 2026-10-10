package com.ibm.jdbc_statement_crud_operation.controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ibm.jdbc_statement_crud_operation.connection.MyJdbcConnetion;

public class DisplayAllStudentController {

	public static void main(String[] args) {
		try(Connection  connection = MyJdbcConnetion.getMyConnection();
				Statement statement = connection.createStatement();
				)
				{
			ResultSet resultSet=statement.executeQuery("select * from student");
			while(resultSet.next()) {
				
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String email = resultSet.getString("email");
				String password = resultSet.getString("password");
				long phone = resultSet.getLong("phone");
				Date dob = resultSet.getDate("dob");
				String address = resultSet.getString("address");
				
				
				
				System.out.println("id = "+id);
				System.out.println("name = "+name);
				System.out.println("email = "+email);
				System.out.println("password = "+password);
				System.out.println("phone = "+phone);
				System.out.println("dob = "+dob);
				System.out.println("Address = " + address);
				
				System.out.println("------------------------------");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
	}
}
