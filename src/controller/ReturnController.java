
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import model.DAO.ConnectionDB;
import model.DAO.RentDAO;
import view.Home;
import view.Return;

/**
 *
 * @author alysson chinque
 * @author maicon
 * 
 */

public class ReturnController implements ActionListener {

    private final Return view;
    private Connection conn;
    private RentDAO rentdao;
    private String rentNumberSelected = "";
    private String movie = "";
    private ArrayList<String> moviesTitle = new ArrayList<>();
    private ArrayList<Integer> rentNumber = new ArrayList<>();
    private final Calendar cal;
    private final SimpleDateFormat sdf;
    private String today;
    private double fine = 1.50;

    /**
     * Constructor of the class, Creating a connection with the DB, instantiating rentDao
     * creating a Gregorian calendar and a simple date format.
     * @param view : from the return view class.
     */
    public ReturnController(Return view) {
        try {
            conn = new ConnectionDB().getConnection();
        } catch (Exception e) {
        }
        this.view = view;
        rentdao = new RentDAO(conn);
        cal = new GregorianCalendar();
        sdf = new SimpleDateFormat("dd/MM/yyyy");
    }
    
    /**
     * This method is instantiating the home page and setting as visible.
     * 
     */
    public void backHome() {
        Home home = new Home();
        this.view.dispose();
        home.setVisible(true);
    }
    
    /**
     * This method gets an array list with the movies rented.
     * @return : return an array list of movies rented.
     */
    public ArrayList<String> getMoviesRented() {
        try {
            moviesTitle = rentdao.getMovies();
            return moviesTitle;
        } catch (Exception e) {

        }
        return moviesTitle = null;
    }  
        
    /**
     * This method gets the rent numbers and 
     * @return : an array list of rent numbers.
     */
    public ArrayList<Integer> getRentNumbers() {
        try {
            rentNumber = rentdao.getRentNumbers();
            return rentNumber;
        } catch (Exception e) {

        }
        return rentNumber = null;
    }

    /**
     * Action performed gets the selected items in the combo box
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("movie")) {
            JComboBox jcbx = (JComboBox) e.getSource();
            this.movie = (String)jcbx.getSelectedItem();
        } else if (e.getActionCommand().equals("rentNumber")) {
            JComboBox jcbx = (JComboBox) e.getSource();
            this.rentNumberSelected = (String)jcbx.getSelectedItem();
        }
    }

    /**
     * This method will check if the movie and the rent number matches, also it will check
     * if the return overdue the return date, if so it applies a fine. 
     */
    public void checkReturn() {
        today = sdf.format(cal.getTime());
        if (checkFields()) {
            try {
                if (rentdao.checkIfRentNumberMatchesMovie(rentNumberSelected, movie)) {
                    String returnDate = rentdao.getReturnDate(rentNumberSelected);
                    int datesCompared = getDifferenceDates(today, returnDate);
                    if (datesCompared > 0){
                        if (datesCompared < 10){
                            JOptionPane.showMessageDialog(view, "Movie Returned with success but it is late\n"
                                + "You were charged €" + (datesCompared * fine));
                            backHome();
                        } else {
                            JOptionPane.showMessageDialog(view, "You are more than or equal to 10 days overdue\n"
                                    + "You were charged €" + (10 * fine));
                            backHome();
                        }
                        
                    } else {
                        JOptionPane.showMessageDialog(view, "Movie Returned with success");
                        backHome();
                    }
                } else {
                    JOptionPane.showMessageDialog(view, "Failed in return the movie\nPlease try agan!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(view, "Error connection DB", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    /**
     * It will check if the combo box is selected, then it will
     * @return : true if so, and it will return a error message if not selected.
     */
    private boolean checkFields() {
        if (rentNumberSelected.equals("") || rentNumberSelected.equals("0") || movie.equals("") || movie.equals("Movies")) {
            JOptionPane.showMessageDialog(view, "Please, pick a movie and a number!");
            return false;
        }
        return true;
    }

    /**
     * This method will check if the date overdue the return date.
     * @param today : passing the current date
     * @param returnDate : passing the date that the movie is supposed to be returned.
     * @return : if the date is overdue, return the number of days. If not return 0.
     */
    private int getDifferenceDates(String today, String returnDate) {
        String inputString1 =returnDate ;
        String inputString2 = today;

        try {
            Date date1 = sdf.parse(inputString1);
            Date date2 = sdf.parse(inputString2);
            long diff = date2.getTime() - date1.getTime();
            System.out.println("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
            float days = (diff / (1000*60*60*24));
            return Math.round(days);
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }

}
