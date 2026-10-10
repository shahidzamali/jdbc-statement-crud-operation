package com.ibm.jdbc_statement_crud_operation.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.ibm.jdbc_statement_crud_operation.connection.MyJdbcConnetion;

public class InsertStudentController {

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;

        try {

//            // Step 1: Load/Register JDBC Driver
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            // Step 2: Create Connection
//            String url = "jdbc:mysql://localhost:3306/jdbc-a16";
//            String username = "root";
//            String password = "@Shahid2331237";
//
//            connection = DriverManager.getConnection(url, username, password);
        	
        	 connection = MyJdbcConnetion.getMyConnection();

            // Step 3: Create Statement
            statement = connection.createStatement();

            // Step 4: Execute SQL Query
            final String INSERT_STUDENT_QUERY =
                    "INSERT INTO student(id, name, email, password, dob, phone, address) "
                    + "VALUES (106, 'mangor', 'mango@gmail.com', 'pqrww@123', "
                    + "'2003-08-29', 7968468780, 'Kolkata')";

            int a = statement.executeUpdate(INSERT_STUDENT_QUERY);

            String msg = a != 0
                    ? "Student registered successfully"
                    : "Something went wrong";

            System.out.println(msg);

        } catch (SQLException e) {

            e.printStackTrace();

        } finally {

            // Close Statement
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            // Close Connection
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}