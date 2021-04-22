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
public class HomeController {
    private final Home view;

    public HomeController(Home view) {
        this.view = view;
        
    }

    public void goMain() {
        Main main = new Main();
        main.setVisible(true);
        this.view.dispose();
        
    }
    
}
