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
 * @author Maicon
 * Creating a Class implementing the Action listener, also some other variables.
 */
public class MainController implements ActionListener {

    private final Main view;
    private Connection conn;
    private ArrayList<Movie> movieDescription = new ArrayList<>();
    private int numOfGenres = 5;
    private String[] genre = new String[numOfGenres];
    private MovieDAO moviedao;
    private GenreDAO genredao;
    private ArrayList<Movie> moviesArray = new ArrayList<>();
    private ArrayList<Movie> moviesArrayTotal = new ArrayList<>();

    /**
     * This a constructor try to make a connection with the DataBase.
     * Instantiating movieDao and genreDao.
     */
    public MainController(Main view) {
        this.view = view;

        try {
            conn = new ConnectionDB().getConnection();
            moviedao = new MovieDAO(conn);
            genredao = new GenreDAO(conn);
        } catch (SQLException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Failed");
        }
    }

    /**
     * This method will call the Home page once you click back
     */
    public void backHome() {
        Home home = new Home();
        this.view.dispose();
        home.setVisible(true);
    }
    
    /**
     * This method will bring you to the movie description, it carries a session and idMovie.
     * @param session : current session.
     * @param idMovie : movie selected.
     */
    public void goMovieDescription(int session, int idMovie) {

        try {
            movieDescription.add(moviedao.getDescription(idMovie));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
        MovieDescription movieD = new MovieDescription(session, movieDescription);
        movieD.setVisible(true);
        this.view.dispose();
    }

    /**
     * This method will bring you to the cart.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        this.view.dispose();
        Cart cart = new Cart(Integer.parseInt(e.getActionCommand()));
        cart.setVisible(true);
    }
    
    /**
     * This method will get all the movies and
     * @return an array list of movies.
     */
    public ArrayList<Movie> getMoviesTotal() {
        try {
            moviesArrayTotal = moviedao.getMovies();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
        return moviesArrayTotal;
    }
    
    /**
     * This method will get the genres from the DB and 
     * @return an array of genre.
     */
    public String[] getGenre() {
        String[] genre = null;
        try {
            return genredao.getGenre();
        } catch (Exception e) {
            return genre;
        }
    }

}
