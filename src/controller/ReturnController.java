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

    

}
