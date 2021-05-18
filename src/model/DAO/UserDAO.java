/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.User;

/**
 *
 * @author Alysson Chinque
 */
/**
 * 
 * @author Maicon
 * This class will instantiate a connection with the database, that will have a query to get the user information, 
 * such as name and card details
 */
public class UserDAO {

    private final Connection connection;

    public UserDAO(Connection conn) {
        this.connection = conn;
    }

    public int insertUser(User user) throws SQLException {
        String query = "INSERT INTO Alysson_2019305.user (card_number, name_user, month_card, year_card, cvc, email_user)\n"
                + "values (?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, user.getCardNumber());
        stmt.setString(2, user.getNameUser());
        stmt.setInt(3, user.getMonth());
        stmt.setInt(4, user.getYear());
        stmt.setString(5, user.getCvc());
        stmt.setString(6, user.getEmail());
        stmt.execute();
        return getIdUser(user.getCardNumber());
    }
    /**
     * This query will get the user id from the database 
     */
    public int userIsInTheDB(String cardNumber) throws SQLException {
        String query = "SELECT id_user FROM Alysson_2019305.user\n"
                + "where card_number = ?;";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, cardNumber);
        stmt.execute();
        ResultSet resultSet = stmt.getResultSet();
        int idUser = 0;
        while (resultSet.next()) {
            idUser = resultSet.getInt("id_user");
        }
        if (idUser == 0) {
            return idUser;
        }
        return idUser;
    }
    /**
     * 
     * This query will add a new user even if the user doesn`t want to register an email.
     * the payment will be possible without having to register themselves.
     */
    public int insertUserWithoutEmail(User user) throws SQLException {
        String query = "INSERT INTO Alysson_2019305.user (card_number, name_user, month_card, year_card, cvc)\n"
                + "values (?, ?, ?, ?, ?)";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, user.getCardNumber());
        stmt.setString(2, user.getNameUser());
        stmt.setInt(3, user.getMonth());
        stmt.setInt(4, user.getYear());
        stmt.setString(5, user.getCvc());
        stmt.execute();
        return getIdUser(user.getCardNumber());
    }
    /**
     * This query will allow the user to register their email if they want.
     */
    public void registerEmail(String cardNumber, String email) throws SQLException {
        String query = "UPDATE Alysson_2019305.user\n"
                + "SET email_user = ?"
                + "WHERE card_number = ?;";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, email);
        stmt.setString(2, cardNumber);
        stmt.execute();
    }
    /**
     * This query will get the user id
     */
    private int getIdUser(String cardNumber) throws SQLException {
        String query = "SELECT id_user from Alysson_2019305.user\n"
                + "where card_number = ?;";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, cardNumber);
        stmt.execute();
        ResultSet resultSet = stmt.getResultSet();
        int idUser = 0;
        while (resultSet.next()) {
            idUser = resultSet.getInt("id_user");
        }
        return idUser;
    }

}
