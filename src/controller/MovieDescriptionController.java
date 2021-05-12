/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.DAO.ConnectionDB;
import model.DAO.MovieDAO;
import model.DAO.MoviesCartDAO;
import model.Movie;
import view.Cart;
import view.Main;
import view.MovieDescription;

/**
 *
 * @author Alysson Chinque
 */
public class MovieDescriptionController {
    private final MovieDescription view;
    private Connection conn;
    private MoviesCartDAO movieCartdao;
    private int moviesCart;
    private int sessionFromCart = 0;

    public MovieDescriptionController(MovieDescription view) {
        this.view = view;
        try {
            conn = new ConnectionDB().getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Failed creating the connection");
        }
        movieCartdao = new MoviesCartDAO(conn);
    }

    public void backMain(int session) {
        Main main = new Main(session);
        main.setVisible(true);
        this.view.dispose();
    }

    public void goCart(int session) {
        this.view.dispose();
        Cart cart = new Cart(session);
        cart.setVisible(true);
    }

    public boolean checkCart(int session) {
        try {
            moviesCart = movieCartdao.getNumberOfMoviesCart(session);
        } catch (Exception e) {
            
        }
        if (moviesCart == 4){
            return false;
        }
        return true;
    }
    

    public void addCart(int session, int idMovie) {

        MovieDAO moviedao = new MovieDAO(conn);
        try {
            if (session == 0){
                sessionFromCart = movieCartdao.addFirstMovieInTheCart(idMovie);
                goCart(sessionFromCart);
            } else {
                if(checkCart(session)){
                    movieCartdao.addMovieInTheCart(session, idMovie);
                    goCart(session);
                } else{
                    JOptionPane.showMessageDialog(null, "You can not add more than 4 movies"
                        + "\nTo add more movies, please delete one from the Cart");
                }
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed adding");
        }
        
    }
    
}
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public void insertData(String email, String cardName, String numberCard, int month, int year, String cvc, int session) throws SQLException {
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

    public void insertDataWithoutEmail(String cardName, String numberCard, int month, int year, String cvc, int session) throws SQLException {
        String query = "INSERT INTO Alysson_2019305.user (card_number, name_user, month_card, year_card, cvc, session)\n"
                + "values (?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, numberCard);
        stmt.setString(2, cardName);
        stmt.setInt(3, month);
        stmt.setInt(4, year);
        stmt.setString(5, cvc);
        stmt.setInt(6, session);
        stmt.execute();
    }

    public boolean checkFirstRent(String numberCard) throws SQLException {
        String query = "SELECT card_number FROM Alysson_2019305.user\n"
                + "where card_number = ?;";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, numberCard);
        stmt.execute();
        ResultSet resultSet = stmt.getResultSet();
        String result = null;
        while(resultSet.next()){
            result = resultSet.getString("card_number");
        }
        if(result.isEmpty()){
            JOptionPane.showMessageDialog(null, "Promo Code validated");
            return true;
        }
        JOptionPane.showMessageDialog(null, "This card is in our database\nPromoCode is applicable only for first rent!");
        return false;
    }
    
