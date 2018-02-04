package com.dataSource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection getConnection(String name) {
        try {
        	Class.forName("com.mysql.jdbc.Driver");
        	String tenantName=name;
   	     Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/"+tenantName+"?autoreconnect=true&useSSL=true","root", "root");
            return con;
        } catch (Exception ex) {
            System.out.println("Database.getConnection() Error -->" + ex.getMessage());
            return null;
        }
    }
 
    public static void close(Connection con) {
        try {
            con.close();
        } catch (Exception ex) {
        }
    }
}
