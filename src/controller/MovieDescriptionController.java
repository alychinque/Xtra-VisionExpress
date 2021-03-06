/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.DAO.ConnectionDB;
import model.DAO.MovieDAO;
import model.DAO.MoviesCartDAO;
import view.Cart;
import view.Main;
import view.MovieDescription;

/**
 *
 * @author Alysson Chinque
 * @author Maicon
 * Creating a class and instantiating some variables that will be used to display the movie description.
 */
public class MovieDescriptionController {
    private final MovieDescription view;
    private Connection conn;
    private final MoviesCartDAO movieCartdao;
    private int moviesCart;
    private int sessionFromCart = 0;
    
    /**
     * This is a constructor of the class that will try a connection with the database
     */
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
    
    /**
     * This function is instantiating the Main class, so it will bring you to the main page if you click back
     */
    public void backMain(int session) {
        Main main = new Main(session);
        main.setVisible(true);
        this.view.dispose();
    }
    
    /**
     * This function will bring you to the cart.
     */
    public void goCart(int session) {
        this.view.dispose();
        Cart cart = new Cart(session);
        cart.setVisible(true);
    }
    
    /**
     * Here is defined that you can`t have more than 4 movies into your cart.
     */
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
    
    /**
     * This method will try to add a movie into the cart
     * @param session : current session
     * @param idMovie : selected movie
     */
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
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Failed adding");
        }
   
    }  
}
