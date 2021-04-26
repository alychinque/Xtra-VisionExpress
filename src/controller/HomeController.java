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
import view.Return;

/**
 *
 * @author Alysson Chinque
 */
public class HomeController {
    private final Home view;
    private Connection conn;
    private ArrayList<Movie> moviesArray = new ArrayList<>();
    
    
    public HomeController(Home view) {
        this.view = view;
    }
    

    public void goMain() {
        try {
            conn = new ConnectionDB().getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Failed");
        }
        MovieDAO moviedao = new MovieDAO(conn);
        try {
            moviesArray = moviedao.getMovies();
            System.out.println(moviesArray);
            System.out.println(moviesArray.get(0).getIdMovie());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
        
        //Main main = new Main();
        Main main = new Main(moviesArray);
        //main.setMoviesArray(moviesArray);
        main.setVisible(true);
        this.view.dispose();
        
    }

    public void goReturn() {
        Return returnS = new Return();
        returnS.setVisible(true);
        this.view.dispose();
    }
    
}
