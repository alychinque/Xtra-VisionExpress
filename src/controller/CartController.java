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
 */
/**
 * 
 * @author Maicon 
 * Class that will control the cart created
 * There a few variables such as an array that will hold the movies chosen and a connection with the database
 */
public class CartController implements ActionListener {
    private final Cart view;
    private Connection conn;
    private MoviesCartDAO movieCartdao;
    private ArrayList<Movie> moviesCart = new ArrayList<>();
    /**
     * This method let me view the cart and it will try a connection with the database . 
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
     * 
     * This array will get the movies and will keep them in the cart
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
     * This method will bring me to the checkout, the movies chosen will be kept in an array to be disposed once 
     * you go to checkout
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
