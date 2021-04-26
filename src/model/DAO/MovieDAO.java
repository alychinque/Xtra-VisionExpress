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

    public MovieDAO(Connection conn) {
        this.connection = conn;
    }
    
    //THIS METHOD RETRIEVE ALL MOVIES
    public ArrayList<Movie> getMovies() throws SQLException{
        //query to get all movies
        String query = "SELECT * FROM Alysson_2019305.movie;";
        //creating a Statement assigning a connection with the select query
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.execute();
        
        ResultSet resultSet = stmt.getResultSet();
        
        ArrayList<Movie> moviesArray = new ArrayList<>();
        
        while (resultSet.next()) {
            int id = resultSet.getInt("id_movie");
            String title = resultSet.getString("title");
            String subTitle = resultSet.getString("subTitle");
            System.out.println("inside while: " +id+ title+subTitle);
            movies = new Movie(id, title, subTitle);
            moviesArray.add(movies);
        }
        System.out.println("size: "+ moviesArray.size());
        return moviesArray;
    }
}
