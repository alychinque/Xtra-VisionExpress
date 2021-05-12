/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author alych
 */
public class User {
    private String email;
    private String nameUser;
    private String numberCard;
    private String cvc;
    private int month;
    private int year;

    public User(String email, String nameUser, String numberCard, String cvc, int month, int year) {
        this.email = email;
        this.nameUser = nameUser;
        this.numberCard = numberCard;
        this.cvc = cvc;
        this.month = month;
        this.year = year;
    }

    public User(String nameUser, String numberCard, String cvc, int month, int year) {
        this.nameUser = nameUser;
        this.numberCard = numberCard;
        this.cvc = cvc;
        this.month = month;
        this.year = year;
    }
    
}
