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
import model.MoviesCart;

/**
 *
 * @author Alysson Chinque
 */
public class MoviesCartDAO {

    private final Connection connection;
    private MoviesCart moviesCart;
    private ArrayList<MoviesCart> moviesInCart = new ArrayList<>();
    String query1;

    public MoviesCartDAO(Connection conn) {
        this.connection = conn;
    }
    
    public int addMovieInTheCart(int idMovie) throws SQLException {
        String query = "INSERT INTO movies_cart (movie) values(?);" ;
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1, idMovie);
        stmt.execute();
        int session = getSession();
        setSession(session);
        return session;
    }
    
      private int getSession() throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("SELECT * FROM movies_cart ORDER BY ID DESC LIMIT 1;");
        stmt.execute();
        ResultSet resultSet = stmt.getResultSet();
        int id = 0;
        while (resultSet.next()) {
            id = resultSet.getInt("id");
        }
        return id;
    }
      
    private void setSession(int session) throws SQLException {
        String query = "UPDATE Alysson_2019305.movies_cart\n" +
                        "SET session = ?\n" +
                        "WHERE id = ?;";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1, session);
        stmt.setInt(2, session);
        stmt.execute();
    }
    
    public int getMoviesCart(int session) throws SQLException{
        String query ="SELECT session, COUNT(*) AS `count` \n" +
                        "FROM movies_cart\n" +
                        "WHERE session = ?;";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1, session);
        stmt.execute();
        ResultSet resultSet = stmt.getResultSet();
        int numberOfMovies = 0;
        while (resultSet.next()) {
            numberOfMovies = resultSet.getInt("count");
        }
        return numberOfMovies;
    }
}
