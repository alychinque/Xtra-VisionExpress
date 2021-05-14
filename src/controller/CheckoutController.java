/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import model.DAO.ConnectionDB;
import model.DAO.RentDAO;
import model.DAO.UserDAO;
import model.Rent;
import model.User;
import view.Cart;
import view.Checkout;

/**
 *
 * @author Alysson Chinque
 */
public class CheckoutController implements ActionListener {

    private final Checkout view;
    private Connection conn;
    private String email;
    private String cardName;
    private String cardNumber;
    private String cvc;
    private int month;
    private int year;
    private boolean validEmailEmpty;
    private final UserDAO userdao;
    private final int session;
    private User user;
    private int idUser = 0;
    private String[] idMovies = null;
    private int rentNumber = 0;
    private boolean returned = false;
    private float rentCharge;
    private Rent rent;
    private String rentDate;
    private String returnDate;

    public CheckoutController(Checkout view) {
        this.view = view;
        try {
            conn = new ConnectionDB().getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Failed creating the connection");
        }
        userdao = new UserDAO(conn);
        this.session = view.getSession();
    }

    public void backCart(int session) {
        Cart cart = new Cart(session);
        this.view.dispose();
        cart.setVisible(true);
    }

    public void checkCode() {
        String code = this.view.getInputCode().getText();
        if (code.equals("FREEMOVIE")) {
            this.view.setResponseCode(true);
        } else {
            this.view.setResponseCode(false);
        }
    }

    public void payMovie(int session) {
        try {
            if (checkFields()) {
                RentDAO rentdao = new RentDAO(conn);
                if (userIsInTheDB()) {
                    System.out.println("customer in the database");
                    if (!validEmailEmpty) {
                        //save email old customer and register rent
                        try {
                            userdao.registerEmail(cardNumber, email);
                            //register rent
                            rent = getDataRent();
                            rentdao.registerRent(rent, session);
                            System.out.println("save email old customer and register rent");
                            return;

                        } catch (Exception e) {
                        }
                    }
                    rent = getDataRent();
                    rentdao.registerRent(rent, session);
                    System.out.println("register the rent only");
                    return;
                } else if (checkPromoCode()) {
                    this.idUser = createUser();
                    rent = getDataRent();
                    if (!validEmailEmpty) {
                        System.out.println("its a new customer with email and the promocode is valid, register rent");
                        //Register rent
                        rentdao.registerRent(rent, session); //with discount
                        return;
                    }
                    System.out.println("its a new customer without email and the promocode is valid, register rent");
                    //Register rent
                    rentdao.registerRent(rent, session);
                    return;

                } else {
                    this.idUser = createUser();
                    //GET ID USER =============================
                    rent = getDataRent();
                    if (!validEmailEmpty) {
                        System.out.println("its a new customer with email and the promocode is invalid, register rent");
                        //Register rent
                        rentdao.registerRent(rent, session);
                        return;
                    }
                    System.out.println("its a new customer without email and the promocode is invalid, register rent");
                    //Register rent
                    rentdao.registerRent(rent, session);
                    return;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed connection");
        }
        System.out.println("hit the end of the method");
        //insertRent(cardNumber);
    }

    private boolean checkFields() {
        try {
            email = this.view.getInputEmail().getText().toLowerCase();
            cardName = this.view.getInputCardName().getText();
            cardNumber = this.view.getInputCardNumber().getText();
            cvc = this.view.getInputCVC().getText();

            if (checkEmail(email) && checkCardName(cardName) && checkCardNumber(cardNumber) && checkCVC(cvc)) {
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error checking fields, Please try again.");
            return false;
        }
        return false;
    }
    
    private boolean checkEmail(String email) {
        if (email.isEmpty()) {
            return true;
        } else {
            try {
                String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."
                        + "[a-zA-Z0-9_+&*-]+)*@"
                        + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                        + "A-Z]{2,7}$";
                Pattern pat = Pattern.compile(emailRegex);
                if (pat.matcher(email).matches() == true) {
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Email is not valid!\nPlease enter again!");
                    return false;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Email is not valid!\nPlease enter again!");
                return false;
            }
        }
    }

    private boolean checkCardName(String cardName) {
        if (cardName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Card name is empty!\nPlease enter again!");
            return false;
        } else {
            return true;
        }
    }

    private boolean checkNumberCard(String numberCard) {
        if (numberCard.length() == 16) {
            int[] numCard = new int[numberCard.length()];
            for (int i = 0; i < numberCard.length(); i++) {
                if (Character.isDigit(numberCard.charAt(i))) {
                    numCard[i] = Integer.parseInt(numberCard.substring(i, i + 1));
                } else {
                    JOptionPane.showMessageDialog(null, "You must enter only numbers in the Card Number!");
                    return false;
                }
            }
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Card number incorrect!");
            return false;
        }
    }

    private boolean checkDateValid(String valid) {
        String[] date = new String[2];
        date = valid.trim().split("/");
        int month = 0;
        int year = 0;
        try {
            month = Integer.parseInt(date[0]);
            year = Integer.parseInt(date[1]);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Only number in Valid Thru");
            return false;
        }
        if (month > 0 && month < 13) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "First two digits must be between 1 and 12\nRelated the months of the year");
            return false;
        }

    }

    private boolean checkCVC(int cvc) {
        if(cvc != 3){
            JOptionPane.showMessageDialog(null, "Failed CVC!");
            return false;
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "month") {
            JComboBox jcbx = (JComboBox) e.getSource();
            this.month = (int) jcbx.getSelectedItem();
        }
        if (e.getActionCommand() == "year") {
            JComboBox jcbx = (JComboBox) e.getSource();
            this.year = (int) jcbx.getSelectedItem();
        }
    }
}
