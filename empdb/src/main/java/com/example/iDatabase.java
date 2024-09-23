package com.example;

import java.sql.Connection;
import java.sql.SQLException;

public interface iDatabase {
    public Connection connectDb() throws SQLException;
    public void closeDb(Connection connection);
}
