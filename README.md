# JDBC and Hibernate Connection
 This is a source code for check the connection when we use hibernate tool to connect to the database

1. set the hibernate with start of the project
2. project structure --> libraries--> add the sql connector jar
3. databse --> set the configs
4. execute the following code

	package com.springboot.jdbc;

	import java.sql.Connection;
	import java.sql.DriverManager;

public class TestJdbc {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/hb_student_tracker";
        String user = "root";
        String pass = "1234";

        try {
            System.out.println("Connecting to the database" + url);

            Connection con = DriverManager.getConnection(url, user,pass);

            System.out.println("Connection is successfully");

        }catch (Exception exc){
            exc.printStackTrace();
        }
    }
}

database name = hb_student_tracker
