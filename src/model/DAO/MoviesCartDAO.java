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
import model.Movie;
import model.MoviesCart;

/**
 *
 * @author Alysson Chinque
 */
public class MoviesCartDAO {

    private final Connection connection;
    private MoviesCart moviesCart;
    private Movie movies;
    private ArrayList<Movie> moviesInCart = new ArrayList<>();

    public MoviesCartDAO(Connection conn) {
        this.connection = conn;
    }

    public int addFirstMovieInTheCart(int idMovie) throws SQLException {
        String query = "INSERT INTO movies_cart (id_movie) values(?);";
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
        String query = "UPDATE Alysson_2019305.movies_cart\n"
                + "SET session = ?\n"
                + "WHERE id = ?;";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1, session);
        stmt.setInt(2, session);
        stmt.execute();
    }

    public int getNumberOfMoviesCart(int session) throws SQLException {
        String query = "SELECT session, COUNT(*) AS `count` \n"
                + "FROM movies_cart\n"
                + "WHERE session = ?;";
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

    public void addMovieInTheCart(int session, int idMovie) throws SQLException {
        String query = "INSERT INTO movies_cart (session, id_movie) values(?, ?);";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1, session);
        stmt.setInt(2, idMovie);
        stmt.execute();
    }

    public ArrayList<Movie> getMoviesSession(int session) throws SQLException {
        String query = "SELECT movies_cart.id_movie, movie.title, movie.subTitle\n"
                + "FROM movies_cart\n"
                + "INNER JOIN movie ON movie.id_movie = movies_cart.id_movie\n"
                + "where movies_cart.session = ?;";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1, session);
        stmt.execute();
        ResultSet resultSet = stmt.getResultSet();
        while (resultSet.next()) {
            int idMovie = resultSet.getInt("id_movie");
            String title = resultSet.getString("title");
            String subTitle = resultSet.getString("subTitle");
            movies = new Movie(idMovie, title, subTitle);
            moviesInCart.add(movies);
        }
        return moviesInCart;
    }

    public void deleteMovieFromCart(int movieId, int session) throws SQLException {
        String query = "delete  FROM Alysson_2019305.movies_cart\n"
                + "where session = ?\n"
                + "and id_movie = ?;";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1, session);
        stmt.setInt(2, movieId);
        stmt.execute();
    }

    public String[] getIdMovies(int session, int numberOfMovies) throws SQLException {
        String query = "SELECT id_movie FROM Alysson_2019305.movies_cart\n"
                + "where session = ?;";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setInt(1, session);
        stmt.execute();
        String[] idMovie = new String[numberOfMovies];
        int count = 0;
        ResultSet resultSet = stmt.getResultSet();
        while (resultSet.next()) {
            idMovie[count] = Integer.toString(resultSet.getInt("id_movie"));
            count++;
        }
        return idMovie;
    }
}
