/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 * @author alych
 */
/**
 * This class will create the return screen.
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
    private double fee = 1.50;

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

    public void backHome() {
        Home home = new Home();
        this.view.dispose();
        home.setVisible(true);
    }

    public ArrayList<String> getMoviesRented() {
        try {
            moviesTitle = rentdao.getMovies();
            return moviesTitle;
        } catch (Exception e) {

        }
        return moviesTitle = null;
    }

    public ArrayList<Integer> getRentNumbers() {
        try {
            rentNumber = rentdao.getRentNumbers();
            return rentNumber;
        } catch (Exception e) {

        }
        return rentNumber = null;
    }

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
                                + "You were charged €" + (datesCompared * fee));
                            backHome();
                        } else {
                            JOptionPane.showMessageDialog(view, "You are more than or equal to 10 days overdue\n"
                                    + "You were charged €" + (10 * fee));
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

    private boolean checkFields() {
        if (rentNumberSelected.equals("") || rentNumberSelected.equals("0") || movie.equals("") || movie.equals("Movies")) {
            JOptionPane.showMessageDialog(view, "Please, pick a movie and a number!");
            return false;
        }
        return true;
    }

    

}
