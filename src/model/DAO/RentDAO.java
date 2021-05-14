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
import java.util.Arrays;
import model.Rent;

/**
 *
 * @author Alysson Chinque
 */
public class RentDAO {

    private final Connection connection;

    public RentDAO(Connection conn) {
        this.connection = conn;
    }

    public boolean checkRandomNumber(int number) {
        try {
            String query = "select rent_number from Alysson_2019305.rent\n"
                    + "where rent_number = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, number);
            stmt.execute();
            ResultSet resultSet = stmt.getResultSet();
            int result = 0;
            while (resultSet.next()) {
                result = resultSet.getInt("rent_number");
            }
            if (result == 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            System.out.println("erro no sql");
        }
        return false;
    }

    public void registerRent(Rent rent, int session) throws SQLException {
        String query = "insert into rent (id_user, id_movie, session, rent_number, rent_date, return_date, returned, rent_charge)\n"
                + "values(?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1, rent.getIdUser());
        stmt.setString(2, Arrays.toString(rent.getIdMovie()));
        stmt.setInt(3, session);
        stmt.setInt(4, rent.getRentNumber());
        stmt.setString(5, rent.getRentDate());
        stmt.setString(6, rent.getReturnDate());
        stmt.setBoolean(7, rent.isReturned());
        stmt.setFloat(8, rent.getRentCharge());
        stmt.execute();
    }

}
