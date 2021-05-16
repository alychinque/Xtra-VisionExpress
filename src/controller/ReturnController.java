/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.util.ArrayList;
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
public class ReturnController {
    private final Return view;
    private Connection conn;
    private RentDAO rentdao;
    private int[] rentNumbers;
    private ArrayList<String> moviesTitle =  new ArrayList<>();
    private ArrayList<Integer> rentNumber =  new ArrayList<>();

    public ReturnController(Return view) {
        try {
            conn = new ConnectionDB().getConnection();
        } catch (Exception e) {
        }
        this.view = view;
        rentdao = new RentDAO(conn);
    }

    public void backMain() {
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
        try{
            rentNumber = rentdao.getRentNumbers();
            return rentNumber;
        } catch (Exception e) {
            
        }
        return rentNumber = null;
    }
    
}
