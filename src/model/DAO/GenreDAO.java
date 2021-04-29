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
import model.Genre;

/**
 *
 * @author alych
 */
public class GenreDAO {
    private Connection connection;
    private Genre genres;
    
    public GenreDAO(Connection conn){
        this.connection = conn;
    }

    public String[] getGenre() throws SQLException {
        String query = "SELECT genre FROM Alysson_2019305.genre;";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.execute();
        
        ResultSet resultSet = stmt.getResultSet();
        
        int numOfGenres = 5;
        String [] genreNames = new String[numOfGenres];
        int count = 0;
        
        while(resultSet.next()){
            String genreName = resultSet.getString("genre");
            genreNames[count] = genreName;
            count++;
        }
        return genreNames;
    }

}
