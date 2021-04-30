/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import view.Cart;
import view.Main;

/**
 *
 * @author Alysson Chinque
 */
public class CartController {
    private final Cart view;
    Connection conn;

    public CartController(Cart view) {
        this.view = view;
    }

    public void backMain(int session) {        
        Main main = new Main(session);
        main.setVisible(true);
        this.view.dispose();
    }
    
}
