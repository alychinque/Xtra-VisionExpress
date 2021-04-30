/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.sql.Connection;
import java.util.ArrayList;
import model.MoviesCart;

/**
 *
 * @author Alysson Chinque
 */
public class MoviesCartDAO {

    private final Connection connection;
    private MoviesCart moviesCart;
    private ArrayList<MoviesCart> moviesInCart = new ArrayList<>();
    String query1;

    public MoviesCartDAO(Connection conn) {
        this.connection = conn;

    }
}
