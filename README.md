# JDBC Statement CRUD Operations

A Java-based JDBC project that demonstrates CRUD (Create, Read, Update, Delete) operations using the JDBC `Statement` interface and a MySQL database.

## 📌 Project Overview

This project demonstrates how Java applications connect to a MySQL database using JDBC and perform basic student record management operations.

## 🚀 Features

- Database connection using JDBC
- Insert student records
- Display all student records
- Perform CRUD operations using the `Statement` interface
- Organize code using packages and separate Java classes

## 🛠️ Technologies Used

- **Language:** Java
- **Database:** MySQL
- **Database Connectivity:** JDBC
- **IDE:** VS Code / Eclipse

## 📂 Project Structure

```text
jdbc_statement_crud_operation/
└── src/
    └── com/
        └── ibm/
            └── jdbc_statement_crud_operation/
                ├── connection/
                │   └── MyJdbcConnection.java
                ├── controller/
                │   ├── DisplayAllStudentController.java
                │   └── InsertStudentController.java
                └── dto/
                    └── Student.java
```

## ⚙️ Prerequisites

Before running the project, install:

- Java JDK
- MySQL Server
- MySQL JDBC Driver

## 🗄️ Database Setup

1. Open MySQL Workbench or your MySQL client.
2. Create a database for the project:

```sql
CREATE DATABASE student_db;
```

3. Create the required student table according to the fields used in your `Student.java` and controller classes.
4. Configure your database URL, username, and password in `MyJdbcConnection.java`.

> Note: The database name and table columns must match your Java code.

## ▶️ How to Run

1. Clone this repository:

```bash
git clone https://github.com/shahidzamali/jdbc-statement-crud-operation.git
```

2. Open the project in your Java IDE.
3. Add the MySQL JDBC driver to the project classpath.
4. Configure your database connection.
5. Run the required controller or main class to perform the operation.

## 🎯 Learning Objectives

- Understand JDBC architecture and database connectivity.
- Learn how the `Statement` interface executes SQL queries.
- Practice Java database operations.
- Understand basic DAO/controller-style code organization.

## 👨‍💻 Author

**Md Shahid Zamali**

- GitHub: [@shahidzamali](https://github.com/shahidzamali)

This project is available for educational and learning purposes.
