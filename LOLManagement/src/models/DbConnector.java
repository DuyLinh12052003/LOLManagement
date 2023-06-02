package models;

import java.sql.*;

public class DbConnector {
    private Connection conn;
    
    private String connectionUrl =
        "jdbc:sqlserver://localhost:1433;"
                + "database=LOLManagement;"
                + "user=sa;"
                + "password=nguyenDUONG07122003@;"
                + "encrypt=true;"
                + "trustServerCertificate=true;"
                + "loginTimeout=30;";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(connectionUrl);
    }

    public void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
