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
import model.DAO.GenreDAO;
import model.DAO.MovieDAO;
import model.Movie;
import view.Cart;
import view.Home;
import view.Main;
import view.MovieDescription;

/**
 *
 * @author Alysson Chinque
 */
public class MainController implements ActionListener{
    private final Main view;
    private Connection conn;
    private ArrayList<Movie> movieDescription = new ArrayList<>();
    private int numOfGenres = 5;
    private String[] genre = new String[numOfGenres];
    private MovieDAO moviedao;
    private ArrayList<Movie> moviesArray = new ArrayList<>();

    public MainController(Main view) {
        this.view = view;
        
        try {
            conn = new ConnectionDB().getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Failed");
        }
    }
    

    public void backHome() {
        Home home = new Home();
        this.view.dispose();
        home.setVisible(true);
    }

    public void goMovieDescription(int session, int idMovie) {
        moviedao = new MovieDAO(conn);
        try {
            movieDescription.add(moviedao.getDescription(idMovie));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
        MovieDescription movieD = new MovieDescription(session, movieDescription);
        movieD.setVisible(true);
        this.view.dispose();
    }

    public void setGenre() {
        GenreDAO genredao = new GenreDAO(conn);
        try {
            genre = genredao.getGenre();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed in the genre");
        }
        this.view.setOption(genre);
    }

    public ArrayList<Movie> getLast10Movies() {
         try {
            conn = new ConnectionDB().getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Failed");
        }
        moviedao = new MovieDAO(conn);
        try {
            moviesArray = moviedao.getLast10Movies();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
        return moviesArray;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.view.dispose();
        Cart cart = new Cart(Integer.parseInt(e.getActionCommand()));
        cart.setVisible(true);
    }
    
}
