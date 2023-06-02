package DAO;

import models.DbConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    private final DbConnector dbConnector;
    private String email;
    private Integer role;

    public UserDAO() {
        dbConnector = new DbConnector();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public int checkSignin(String email, String password) {
        String SQL_SELECT = "SELECT ID FROM [User] WHERE email = ? AND Password = ?";

        try (Connection connection = dbConnector.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT)) {

            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    this.setEmail(email);
                    this.setRole(role);
                    
                    return resultSet.getInt("ID");
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return -1;
    }
    
    
    
    public int addAccountkSignup(String email, String password) {
        String SQL_INSERT = "INSERT INTO [User] (Email, Password, Rank, Role) VALUES (?, ?, ?, ?)";
        String rank = "Unrank";
        int role = 0;

        try (Connection connection = dbConnector.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT)) {

            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, rank);
            preparedStatement.setInt(4, role);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }
        return -1;
    }
}
