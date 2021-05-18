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

/**
 *
 * @author Alysson Chinque
 */
public class MovieDAO {

    private final Connection connection;
    private Movie movies;
    private ArrayList<Movie> moviesArray = new ArrayList<>();

    public MovieDAO(Connection conn) {
        this.connection = conn;
    }

    /**
     * THIS METHOD RETRIEVE THE LAST 10 MOVIES
     * 
     */
    public ArrayList<Movie> getLast10Movies() throws SQLException {
        //query to get the movies
        String query = "SELECT id_movie, title, subTitle FROM (\n"
                + "SELECT * FROM Alysson_2019305.movie ORDER BY id_movie DESC LIMIT 10\n"
                + ")var1\n"
                + "ORDER BY id_movie ASC;";
        /*
        creating a Statement assigning a connection with the select query
        */
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.execute();

        ResultSet resultSet = stmt.getResultSet();

        while (resultSet.next()) {
            int id = resultSet.getInt("id_movie");
            String title = resultSet.getString("title");
            String subTitle = resultSet.getString("subTitle");
            movies = new Movie(id, title, subTitle);
            moviesArray.add(movies);
        }
        return moviesArray;
    }

    public ArrayList<Movie> getMovies() throws SQLException {
        //query to get all movies
        String query = "SELECT id_movie, title, subTitle FROM Alysson_2019305.movie;";
        //creating a Statement assigning a connection with the select query
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.execute();

        ResultSet resultSet = stmt.getResultSet();

        ArrayList<Movie> moviesArray = new ArrayList<>();

        while (resultSet.next()) {
            int id = resultSet.getInt("id_movie");
            String title = resultSet.getString("title");
            String subTitle = resultSet.getString("subTitle");
            movies = new Movie(id, title, subTitle);
            moviesArray.add(movies);
        }
        System.out.println("size: " + moviesArray.size());
        return moviesArray;
    }

    public Movie getDescription(int idMovie) throws SQLException {
        //query to get all movies
        String query2 = "SELECT movie.*, genre.genre\n"
                + "from movie\n"
                + "INNER JOIN genre ON movie.id_genre = genre.id_genre\n"
                + "where id_movie = ?;";
        //creating a Statement assigning a connection with the select query
        PreparedStatement stmt = connection.prepareStatement(query2);
        stmt.setInt(1, idMovie);
        stmt.execute();

        ResultSet resultSet = stmt.getResultSet();

        while (resultSet.next()) {
            int id = resultSet.getInt("id_movie");
            String title = resultSet.getString("title");
            String subTitle = resultSet.getString("subTitle");
            String genre = resultSet.getString("genre");
            String description = resultSet.getString("description");
            int duration = resultSet.getInt("duration");
            movies = new Movie(id, title, subTitle, genre, description, duration);
        }
        return movies;
    }
}
