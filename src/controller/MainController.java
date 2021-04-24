/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.Home;
import view.Main;

/**
 *
 * @author alych
 */
public class MainController {
    private final Main view;

    public MainController(Main view) {
        this.view = view;
    }

    public void backMain() {
        Home home = new Home();
        this.view.dispose();
        home.setVisible(true);
    }
    
}
