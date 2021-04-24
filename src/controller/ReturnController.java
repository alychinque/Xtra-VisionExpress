/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.Home;
import view.Return;

/**
 *
 * @author alych
 */
public class ReturnController {
    private final Return view;

    public ReturnController(Return view) {
        this.view = view;
    }

    public void backMain() {
        Home home = new Home();
        this.view.dispose();
        home.setVisible(true);
    }
    
}
