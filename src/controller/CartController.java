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
import model.DAO.MoviesCartDAO;
import model.Movie;
import view.Cart;
import view.Main;

/**
 *
 * @author Alysson Chinque
 */
public class CartController {
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
        }
        
        return moviesCart;
    }
    
}
