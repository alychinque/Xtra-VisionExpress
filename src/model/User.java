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
    private String cardNumber;
    private String cvc;
    private int month;
    private int year;

    public User(String email, String nameUser, String cardNumber, String cvc, int month, int year) {
        this.email = email;
        this.nameUser = nameUser;
        this.cardNumber = cardNumber;
        this.cvc = cvc;
        this.month = month;
        this.year = year;
    }

    public User(String nameUser, String cardNumber, String cvc, int month, int year) {
        this.nameUser = nameUser;
        this.cardNumber = cardNumber;
        this.cvc = cvc;
        this.month = month;
        this.year = year;
    }

    public String getEmail() {
        return email;
    }

    public String getNameUser() {
        return nameUser;
    }

    public String getCvc() {
        return cvc;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getCardNumber() {
        return cardNumber;
    }
    
}
