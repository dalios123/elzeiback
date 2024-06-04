package com.example.app.javatechie.spring.auth.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	

	    private static Connection connection = null;

	    public static Connection getConnection() throws SQLException {
	        if (connection != null) {
	            return connection;
	        } else {
	        	String driver = "org.postgresql.Driver";
	            String url = "jdbc:postgresql://localhost:5432/postgres";
	            String username = "postgres";
	            String password = "chaima123";

	            try { Class.forName(driver);
	                connection = DriverManager.getConnection(url,username, password);
	            } catch (ClassNotFoundException e) {
	                e.printStackTrace();
	            }

	            return connection;
	        }
	    }
	}


