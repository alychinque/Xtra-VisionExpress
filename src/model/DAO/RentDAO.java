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
import java.util.ArrayList;
import java.util.Arrays;
import model.Rent;

/**
 *
 * @author Alysson Chinque
 */
public class RentDAO {

    private final Connection connection;
    private ArrayList<String> moviesTitle = new ArrayList<>();
    private ArrayList<Integer> rentNumber = new ArrayList<>();

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
        String query = "insert into rent (id_user, title, session, rent_number, rent_date, return_date, returned, rent_charge)\n"
                + "values(?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1, rent.getIdUser());
        stmt.setString(2, rent.getMovieTitle());
        stmt.setInt(3, session);
        stmt.setInt(4, rent.getRentNumber());
        stmt.setString(5, rent.getRentDate());
        stmt.setString(6, rent.getReturnDate());
        stmt.setBoolean(7, rent.isReturned());
        stmt.setFloat(8, rent.getRentCharge());
        stmt.execute();
    }

    public ArrayList<String> getMovies() throws SQLException {
        String query = "SELECT DISTINCT title FROM Alysson_2019305.rent\n"
                + "WHERE returned = 0\n"
                + "ORDER BY TITLE ASC;";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.execute();
        ResultSet resultSet = stmt.getResultSet();
        while (resultSet.next()) {
            moviesTitle.add(resultSet.getString("title"));
        }
        return moviesTitle;
    }

    public ArrayList<Integer> getRentNumbers() throws SQLException {
        String query = "SELECT DISTINCT rent_number FROM Alysson_2019305.rent\n"
                + "where returned = 0\n"
                + "ORDER BY rent_number ASC;";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.execute();
        ResultSet resultSet = stmt.getResultSet();
        while (resultSet.next()) {
            rentNumber.add(resultSet.getInt("rent_number"));
        }
        return rentNumber;
    }

    public boolean checkIfRentNumberMatchesMovie(String rentNumberSelected, String movie) throws SQLException {
        int rentQuery = Integer.parseInt(rentNumberSelected);
        String query = "SELECT title FROM Alysson_2019305.rent\n"
                + "where rent_number = ?;";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1, rentQuery);
        stmt.execute();
        ResultSet resultSet = stmt.getResultSet();
        while (resultSet.next()) {
            if (movie.equals(resultSet.getString("title"))) {
                updateRent(rentQuery, movie);
                return true;
            }
        }
        return false;
    }

    
    
}
