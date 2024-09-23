package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mariadb implements iDatabase{
    
    public Connection connectDb() {
        try {
            return tryConnectDb();
        } catch (SQLException e) {
            System.err.println("Hiba! A kapcsolódás sikertelen.");
            System.err.println(e.getMessage());
            return null;
        }
    }
    
    
    public Connection tryConnectDb() throws SQLException {
       
        
        String url = "jdbc:mariadb://localhost:3306/surubt";
        DriverManager.getConnection(url, "surubt", "titok");
        return DriverManager.getConnection(url, "surubt", "titok");

    }
        

    @Override
    public void closeDb(Connection connection) {
        try {
            connection.close();
        }
        catch (SQLException e) {
            System.err.println("Hiba! A kapcsolódás sikertelen.");
            System.err.println(e.getMessage());
        }
    }
}
