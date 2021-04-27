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
import model.Movie;
import view.Cart;
import view.Main;

/**
 *
 * @author Alysson Chinque
 */
public class CartController {
    private final Cart view;
    Connection conn;
    ArrayList<Movie> moviesArray;

    public CartController(Cart view) {
        this.view = view;
    }

    public void backMain(int session) {
         try {
             conn = new ConnectionDB().getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Failed");
        }
        MovieDAO moviedao = new MovieDAO(conn);
        try {
             moviesArray = moviedao.getLast10Movies();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
        
        Main main = new Main(moviesArray, session);
        main.setVisible(true);
        this.view.dispose();
    }
    
}
