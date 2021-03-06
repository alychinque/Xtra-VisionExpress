/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.HeadlessException;
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
import view.RentConfirmation;

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
    private String[] titleMovie = null;
    private int numberOfMovies;
    private int rentNumber = 0;
    private boolean returned = false;
    private boolean newUser = false;
    private float rentCharge;
    private Rent[] rent;
    private String rentDate;
    private String returnDate;

    /**
     * This method will generate my checkout page, getting a connection with the
     * database and it will create a session with the movies the user have
     * chosen
     */
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
    /**
     * This method will bring you back to the cart. 
     * @param session 
     */
    public void backCart(int session) {
        Cart cart = new Cart(session);
        this.view.dispose();
        cart.setVisible(true);
    }

    /**
     * This method will check if the user have the Promo code which is
     * "FREEMOVIE" if yes, then the rental will be free of charge, go on and try
     * it ;)
     */
    public boolean checkPromoCode() {
        String code = this.view.getInputCode().getText();
        if (code.equals("FREEMOVIE")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method will generate a register of the rent
     *
     * @param sizeArray
     */
    public void payMovie(int sizeArray) {
        this.numberOfMovies = sizeArray;
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
                            for (int i = 0; i < numberOfMovies; i++) {
                                rentdao.registerRent(rent[i], session);
                            }
                            goRentConfirmation(rent);
                            System.out.println("save email old customer and register rent");
                            return;

                        } catch (Exception e) {
                        }
                    }
                    rent = getDataRent();
                    for (int i = 0; i < numberOfMovies; i++) {
                        rentdao.registerRent(rent[i], session);
                    }
                    goRentConfirmation(rent);
                    System.out.println("register the rent only");
                } else if (checkPromoCode() && numberOfMovies <= 2) {
                    this.idUser = createUser();
                    rent = getDataRent();
                    if (!validEmailEmpty) {
                        //Register rent
                        for (int i = 0; i < numberOfMovies; i++) {
                            rentdao.registerRent(rent[i], session);
                        }//with discount
                        goRentConfirmation(rent);
                        System.out.println("its a new customer with email and the promocode is valid, register rent");
                        return;
                    }
                    //Register rent
                    for (int i = 0; i < numberOfMovies; i++) {
                        rentdao.registerRent(rent[i], session);
                    }
                    goRentConfirmation(rent);
                    System.out.println("its a new customer without email and the promocode is valid, register rent");

                } else if (numberOfMovies <= 2) {
                    this.idUser = createUser();
                    //GET ID USER =============================
                    rent = getDataRent();
                    if (!validEmailEmpty) {
                        //Register rent
                        for (int i = 0; i < numberOfMovies; i++) {
                            rentdao.registerRent(rent[i], session);
                        }
                        goRentConfirmation(rent);
                        System.out.println("its a new customer with email and the promocode is invalid, register rent");
                        return;
                    }
                    //Register rent
                    for (int i = 0; i < numberOfMovies; i++) {
                        rentdao.registerRent(rent[i], session);
                    }
                    goRentConfirmation(rent);
                    System.out.println("its a new customer without email and the promocode is invalid, register rent");
                } else {
                    JOptionPane.showMessageDialog(view, "You can rent only two movies in the first rental");
                }
            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Failed connection");
        }
    }

    /**
     * This method will check if all fields are filled correctly,for example for
     * the card you need to have 16 numbers, all the possible mistakes will be
     * catch, like if you type a letter for card number, it won`t work
     */
    private boolean checkFields() {
        try {
            email = this.view.getInputEmail().getText().toLowerCase();
            cardName = this.view.getInputCardName().getText();
            cardNumber = this.view.getInputCardNumber().getText();
            cvc = this.view.getInputCVC().getText();
            if (month == 0 || year == 0) {
                JOptionPane.showMessageDialog(null, "Date is invalid!");
                return false;
            }

            if (checkEmail(email) && checkCardName(cardName) && checkCardNumber(cardNumber) && checkCVC(cvc)) {
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error checking fields, Please try again.");
            return false;
        }
        return false;
    }

    /**
     *
     * This method will check if the email is valid.
     */
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

    /**
     * This method will check if the card name is filled.
     * all possible mistakes will be catch.
     */
    private boolean checkCardName(String cardName) {
        if (cardName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Card name is empty!\nPlease enter again!");
            return false;
        } else {
            return true;
        }
    }

    /**
     *
     * This method will check if your card has 16 numbers, and it will catch any
     * possible mistake, such as if you type a letter by mistake.
     */
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

    /**
     * Checking if you have a valid CVC, that should be strictly 3 numbers, no
     * more, no less.
     */
    private boolean checkCVC(String cvc) {
        if (cvc.length() != 3) {
            JOptionPane.showMessageDialog(null, "Failed CVC!");
            return false;
        }
        return true;
    }

    @Override
    /**
     * This method will have a combo box with the months, so you can add your
     * card information regarding when it will be expired. Just like any other
     * online shopping.
     */
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

    /**
     * This method will generate an object of rent with the renting information.
     */
    private Rent[] getDataRent() {
        try {
            //get movies id []
            MoviesCartDAO moviescartdao = new MoviesCartDAO(conn);
            this.titleMovie = new String[numberOfMovies];
            this.titleMovie = moviescartdao.getTitleMovies(session, numberOfMovies);
            //get random number
            RentDAO rentdao = new RentDAO(conn);
            while (true) {
                int number = generateRandomNumber();
                if (rentdao.checkRandomNumber(number)) {
                    this.rentNumber = number;
                    break;
                }
            }
            //get rent date(today)
            Calendar cal = new GregorianCalendar();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            rentDate = sdf.format(cal.getTime());

            //get rent return(number the day is equal the number of movies rented)
            int numberOfDaysOfRent = numberOfMovies;
            cal.add(Calendar.DAY_OF_MONTH, numberOfDaysOfRent);
            returnDate = sdf.format(cal.getTime());

            //set boolean returned
            returned = false;

            //get rent price
            rentCharge = (float) 2.99;
            if (checkPromoCode() && newUser) {
                rentCharge = 0;
            } else {
                rentCharge = (float) 2.99;
            }
            /**
             * Showing a resume of the movies chosen, dates to be returned and
             * etc.
             */
            System.out.println("idUser: " + idUser);
            for (int i = 0; i < numberOfMovies; i++) {
                System.out.println("idMovie: " + titleMovie[i]);
            }
            System.out.println("rentNumber: " + rentNumber);
            System.out.println("rentDate: " + rentDate + " *** returnDate: " + returnDate);
            System.out.println("Returned: " + returned + " ** rentCharge: " + rentCharge);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error creatinf a rent");
        }
        rent = new Rent[numberOfMovies];
        for (int i = 0; i < numberOfMovies; i++) {
            rent[i] = new Rent(idUser, titleMovie[i], rentNumber, rentDate, returnDate, returned, rentCharge);
        }

        return rent;
    }

    /**
     *
     * This method will check if the user in the database
     */
    private boolean userIsInTheDB() throws SQLException {
        this.idUser = userdao.userIsInTheDB(cardNumber);
        if (idUser == 0) {
            newUser = true;
            return false;
        }
        newUser = false;
        return true;
    }

    /**
     * Generating a random number for that session of movies, you will need this
     * number to return your movies.
     */
    private int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(9999);
    }
    
    /**
     * This method will set the user ID
     * @param idUser 
     */
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    
    /**
     * This method will create an object of user with the information about the user
     * @return 
     */
    private int createUser() {
        System.out.println("card number: " + cardNumber
                + "\ncard name: " + cardName
                + "\ncvc: " + cvc
                + "\nmonth: " + month + " year: " + year);
        try {
            if (validEmailEmpty) {
                user = new User(cardName, cardNumber, cvc, month, year);
                return userdao.insertUserWithoutEmail(user);
            } else {
                user = new User(email, cardName, cardNumber, cvc, month, year);
                return userdao.insertUser(user);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error creating a user");
        }
        return 0;

    }

    /**
     * This method will instantiate rent confirmation and set as visible and
     * will set the rent charge.
     */
    private void goRentConfirmation(Rent[] rent) {
        if (checkPromoCode() && newUser) {
            rentCharge = 0;
        } else {
            switch (numberOfMovies) {
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
        RentConfirmation rentConfirmation;
        rentConfirmation = new RentConfirmation(rent[0], rentCharge);
        this.view.dispose();
        rentConfirmation.setVisible(true);
    }
}
