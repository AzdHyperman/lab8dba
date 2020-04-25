package com.lab8;

import java.sql.*;

public class Database {

    private static Database instance = null;
    private Connection connection;

    private Database() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/musicalbums?serverTimezone=UTC";
        String username = "root";
        String password = "root";
        this.connection = DriverManager.getConnection(url, username, password);
    }

    public Connection getConnection() {
        return connection;
    }

    public static Database getInstance() throws SQLException {
        if (instance == null) {
            instance = new Database();
        } else if (instance.getConnection().isClosed()) {
            instance = new Database();
        }
        return instance;
    }

    public void closeConnection() throws SQLException {
        this.connection.close();
    }
}
