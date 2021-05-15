
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
/**
 *Creating a Class implementing the Action listener, also some other variables.
 */
public class MainController implements ActionListener{
    
    private final Main view;
    private Connection conn;
    private ArrayList<Movie> movieDescription = new ArrayList<>();
    private int numOfGenres = 5;
    private String[] genre = new String[numOfGenres];
    private MovieDAO moviedao;
    private ArrayList<Movie> moviesArray = new ArrayList<>();
    
    /**
     * This a constructor try to make a connection with the DataBase to get the movie`s name.
     */
    public MainController(Main view) {
        this.view = view;
        
        try {
            conn = new ConnectionDB().getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Failed");
        }
    }
    
    /**
     * 
    *This method will call the Home page once you click back
    */
    public void backHome() {
        Home home = new Home();
        this.view.dispose();
        home.setVisible(true);
    }
    /*
    This method will have parameters to get the movie description, It will have a connection with the database
    that will add the movie description to the movie.
    */
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
    /*
    This method will define a genre to the movies, every movie has been associate to a number from 1 to 5 in the database
    so basically here it will get the genre for that movie chosen
    */
    public void setGenre() {
        GenreDAO genredao = new GenreDAO(conn);
        try {
            genre = genredao.getGenre();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed in the genre");
        }
        this.view.setOption(genre);
    }
    /*
    This other mothed has an array that will get the last 10 movies from the database. 
    hint : they should be star wars :D
    */
    public ArrayList<Movie> getLast10Movies(){
        moviedao = new MovieDAO(conn);
        try {
            moviesArray = moviedao.getLast10Movies();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
        return moviesArray;
    }

    @Override
        /*
        This method will dispose the cart with the movies.
    */
    public void actionPerformed(ActionEvent e) {
        this.view.dispose();
        Cart cart = new Cart(Integer.parseInt(e.getActionCommand()));
        cart.setVisible(true);
    }
    
}
