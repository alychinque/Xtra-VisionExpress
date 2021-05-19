/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.DAO.ConnectionDB;
import model.DAO.MoviesCartDAO;
import model.Movie;
import view.Cart;
import view.Checkout;
import view.Main;

/**
 *
 * @author Alysson Chinque
 * @author Maicon 
 * 
 */
public class CartController implements ActionListener {
    private final Cart view;
    private Connection conn;
    private MoviesCartDAO movieCartdao;
    private ArrayList<Movie> moviesCart = new ArrayList<>();
    
    /**
     * Constructor of the class, creating the connection with the database and 
     * instantiating movieCartDAO 
     */
    public CartController(Cart view) {
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
     * This is just a method to get back to the main session.
     */
    public void backMain(int session) {        
        Main main = new Main(session);
        main.setVisible(true);
        this.view.dispose();
    }
    
    /**
     * This method will get the movies accordingly with the session, and will 
     * return an array list with the movies
     */
    public ArrayList<Movie> getMoviesSession(int session) {
        try {
            moviesCart = movieCartdao.getMoviesSession(session);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed creating the connection");
        }
        
        return moviesCart;
    }
    
    /**
     * This method will bring me to the checkout, and it will pass as a parameter
     * the session and the sizeArray
     * @param session : 
     * @param sizeArray
     */
    
    public void goCheckout(int session, int sizeArray) {
        Checkout checkout = new Checkout(session, sizeArray);
        this.view.dispose();
        checkout.setVisible(true);
    }

    @Override
    
    /**
     * This method will allow you to delete a movie from your cart
     */
    
    public void actionPerformed(ActionEvent e) {
        int session = this.view.getSession();
        try {
            movieCartdao.deleteMovieFromCart(Integer.parseInt(e.getActionCommand()), session);
        } catch (Exception exp) {
            JOptionPane.showMessageDialog(null, "Failed deleting the connection");
        }
        backMain(session);
    } 
}
