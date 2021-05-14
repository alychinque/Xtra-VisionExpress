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
public class CartController implements ActionListener {
    private final Cart view;
    private Connection conn;
    private MoviesCartDAO movieCartdao;
    private ArrayList<Movie> moviesCart = new ArrayList<>();

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

    public void backMain(int session) {        
        Main main = new Main(session);
        main.setVisible(true);
        this.view.dispose();
    }

    public ArrayList<Movie> getMoviesSession(int session) {
        try {
            moviesCart = movieCartdao.getMoviesSession(session);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed creating the connection");
        }
        
        return moviesCart;
    }
    
    public void goCheckout(int session, int sizeArray) {
        Checkout checkout = new Checkout(session, sizeArray);
        this.view.dispose();
        checkout.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int session = this.view.getSession();
        try {
            movieCartdao.deleteMovieFromCart(Integer.parseInt(e.getActionCommand()), session);
        } catch (Exception exp) {
            JOptionPane.showMessageDialog(null, "Failed deleting the connection");
        }
        backMain(session);
    }

    

//    public int[] checkMoviesInTheCart(int session) {
//        int[] result = null;
//        try {
//            result = movieCartdao.getIdMovies(session);
//            return result;
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "error");
//            return result;
//        }
//        
//    }
    
}
