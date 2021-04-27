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
import view.Home;
import view.Main;
import view.MovieDescription;

/**
 *
 * @author Alysson Chinque
 */
public class MainController {
    private final Main view;
    private Connection conn;
    private ArrayList<Movie> movieDescription = new ArrayList<>();

    public MainController(Main view) {
        this.view = view;
    }

    public void backMain() {
        Home home = new Home();
        this.view.dispose();
        home.setVisible(true);
    }

    public void goMovieDescription(int idMovie) {
        try {
            conn = new ConnectionDB().getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Failed");
        }
        MovieDAO moviedao = new MovieDAO(conn);
        try {
            movieDescription.add(moviedao.getDescription(idMovie));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
        MovieDescription movieD = new MovieDescription(movieDescription);
        movieD.setVisible(true);
        this.view.dispose();
    }
    
}
