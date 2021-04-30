/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import view.Home;
import view.Main;
import view.Return;

/**
 *
 * @author Alysson Chinque
 */
public class HomeController {
    private final Home view;
    private Connection conn;;
    
    
    public HomeController(Home view) {
        this.view = view;
    }
    

    public void goMain() {       
        Main main = new Main();
        main.setVisible(true);
        this.view.dispose();
        
    }

    public void goReturn() {
        Return returnS = new Return();
        returnS.setVisible(true);
        this.view.dispose();
    }
    
}
