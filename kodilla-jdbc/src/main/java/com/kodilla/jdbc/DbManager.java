package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbManager {
    private Connection conn;
    private static DbManager dbManagerInstance = null;

    private DbManager() throws SQLException{
        Properties props = new Properties();
        props.put("user","kodilla_user");
        props.put("password","kodilla_password");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodilla_course?serverTimezone=Europe/Warsaw" +
                "&useSSL=False",props);
    }
    public static DbManager getInstance() throws SQLException{
        if(dbManagerInstance ==null){
            dbManagerInstance = new DbManager();
        }
        return dbManagerInstance;
    }

    public Connection getConnection() {
        return conn;
    }
}
