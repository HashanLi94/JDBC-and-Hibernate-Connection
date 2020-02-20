package com.springboot.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Collections;

public class TestJdbc {
    public static void main(String[] args){

        String url = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
        String user = "root";
        String  pass = "1234";
        try {
            System.out.println("connecting to the db" + url);

            Connection con = DriverManager.getConnection(url, user, pass);

            System.out.println("Connection is Successfully");
        }catch (Exception exc){
            exc.printStackTrace();
        }
    }
}
