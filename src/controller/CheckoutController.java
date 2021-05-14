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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import model.DAO.ConnectionDB;
import model.DAO.MoviesCartDAO;
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
            validEmailEmpty = true;
            return true;
        } else {
            try {
                String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."
                        + "[a-zA-Z0-9_+&*-]+)*@"
                        + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                        + "A-Z]{2,7}$";
                Pattern pat = Pattern.compile(emailRegex);
                if (pat.matcher(email).matches() == true) {
                    validEmailEmpty = false;
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Email is not valid!\nPlease enter again!");
                    validEmailEmpty = false;
                    return false;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Email is not valid!\nPlease enter again!");
                validEmailEmpty = false;
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

    private boolean checkCardNumber(String numberCard) {
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

    private boolean checkCVC(String cvc) {
        if (cvc.length() != 3) {
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
    
    private Rent getDataRent() {
        try {
            //get movies id []
            MoviesCartDAO moviescartdao = new MoviesCartDAO(conn);
            int numberOfMovies = moviescartdao.getNumberOfMoviesCart(session);
            this.idMovies = new String[numberOfMovies];
            this.idMovies = moviescartdao.getIdMovies(session, numberOfMovies);
            //get random number
            RentDAO rentdao = new RentDAO(conn);
            while (true) {
                int number = generateRandomNumber();
                if (rentdao.checkRandomNumber(number)) {
                    this.rentNumber = number;
                    break;
                }
            }
            //get rent date(taday)
            Calendar cal = new GregorianCalendar();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            rentDate = sdf.format(cal.getTime());

            //get rent return(number the day is equal the number of movies rented)
            int numberOfDaysOfRent = idMovies.length;
            cal.add(Calendar.DAY_OF_MONTH, numberOfDaysOfRent);
            returnDate = sdf.format(cal.getTime());

            //set boolean returned
            returned = false;

            //get rent price
            if(checkPromoCode() && !userIsInTheDB()){
                rentCharge = 0;
            }else{
                switch (idMovies.length) {
                    case 1:
                        rentCharge = (float) 2.99;
                        break;
                    case 2:
                        rentCharge = (float) 5.98;
                        break;
                    case 3:
                        rentCharge = (float) 8.97;
                        break;
                    case 4:
                        rentCharge = (float) 11.96;
                        break;
                }
            }
            System.out.println("idUser: " + idUser);
            for (int i = 0; i < idMovies.length; i++) {
                System.out.println("idMovie: " + idMovies[i]);
            }
            System.out.println("rentNumber: " + rentNumber);
            System.out.println("rentDate: " + rentDate + " *** returnDate: " + returnDate);
            System.out.println("Returned: " + returned + " ** rentCharge: " + rentCharge);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "nao deu certo add um rental");
        }

        return rent = new Rent(idUser, idMovies, rentNumber, rentDate, returnDate, returned, rentCharge);
    }
    
    private boolean userIsInTheDB() throws SQLException {
        this.idUser = userdao.userIsInTheDB(cardNumber);
        if (idUser == 0) {
            return false;
        }
        return true;
    }
    
    private int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(9999);
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
}
