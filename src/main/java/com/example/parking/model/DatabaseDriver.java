package com.example.parking.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseDriver {
    private static DatabaseDriver instance;
    private Connection connection;

    private DatabaseDriver(){
        try{
            String url = "jdbc:oracle:thin:@//localhost:1521/xe";
            String user = "BD123";
            String password = "123456";
            connection = DriverManager.getConnection(url, user, password);
        }catch (SQLException e ){
            e.printStackTrace();
        }
    }

    public static  DatabaseDriver getInstance(){
        if(instance == null){
            instance = new DatabaseDriver();
        }
        return  instance;
    }
    public Connection getConnection(){
        return  connection;
    }
}
