/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author alych
 */
public class UserDAO {

    private final Connection connection;

    public UserDAO(Connection conn) {
        this.connection = conn;
    }

    public void insertUser(String email, String cardName, String numberCard, int month, int year, String cvc, int session) throws SQLException {
        String query = "INSERT INTO Alysson_2019305.user (card_number, name_user, month_card, year_card, cvc, session, email_user)\n"
                + "values (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, numberCard);
        stmt.setString(2, cardName);
        stmt.setInt(3, month);
        stmt.setInt(4, year);
        stmt.setString(5, cvc);
        stmt.setInt(6, session);
        stmt.setString(7, email);
        stmt.execute();
    }

}
