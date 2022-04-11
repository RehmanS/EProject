package com.example.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBHelper {

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
        return con;
    }
}