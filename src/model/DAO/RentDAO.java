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
/**
 * This class will have some variables that will be used to return the movies.
 */
public class RentDAO {

    private final Connection connection;
    private ArrayList<String> moviesTitle = new ArrayList<>();
    private ArrayList<Integer> rentNumber = new ArrayList<>();
    //making a connection with the database.
    public RentDAO(Connection conn) {
        this.connection = conn;
    }
    /**
     * This method will have a query that will check the random number generated when you rent the movies.
     * It will check if your number is valid or not. 
     */
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
    /**
     * This query will insert some informations to register your rental. 
     */
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
    /**
     * This query will arrange the movies in an array. 
     */
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
    /**
     * This query will select the rental number from the database and will return a random number to the user.
     */
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
    /**
     * This query will check if number generated will match the movies selected, if the they are the same, the rent will be
     * successful
     */
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
    /**
     * This query will update the session of movies. 
     */
    private void updateRent(int rentQuery, String movie) throws SQLException {
        String query = "UPDATE Alysson_2019305.rent\n"
                + "SET returned = 1\n"
                + "WHERE rent_number = ?\n"
                + "AND title = ?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1, rentQuery);
        stmt.setString(2, movie);
        stmt.execute();
    }
    /**
     * This query will get the date to return the movies, based on the date you rented them. 
     */
    public String getReturnDate(String rentNumber) throws SQLException {
        int rentQuery = Integer.parseInt(rentNumber);
        String query = "SELECT return_date FROM Alysson_2019305.rent\n"
                + "WHERE rent_number = ?;";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1, rentQuery);
        stmt.execute();
        ResultSet resultSet = stmt.getResultSet();
        String returnDate = "";
        while(resultSet.next()){
            returnDate = resultSet.getString("return_date");
        }
        return returnDate;
    }

    
}
