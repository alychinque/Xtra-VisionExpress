/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Alysson Chinque
 */
/**
 * 
 * @author Maicon
 * Creating a class and instantiating some variables that will be assigned to the movies
 */
public class Rent {
    private int idUser;
    private String[] idMovie;
    private int rentNumber;
    private String rentDate;
    private String returnDate;
    private boolean returned;
    private float rentCharge;
    private float extraCharge;

    public Rent(int idUser, String[] idMovie, int rentNumber, String rentDate, String returnDate, boolean returned, float rentCharge, float extraCharge) {
        this.idUser = idUser;
        this.idMovie = idMovie;
        this.rentNumber = rentNumber;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.returned = returned;
        this.extraCharge = extraCharge;
    }

    public Rent(int idUser, String[] idMovie, int rentNumber, String rentDate, String returnDate, boolean returned, float rentCharge) {
        this.idUser = idUser;
        this.idMovie = idMovie;
        this.rentNumber = rentNumber;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.returned = returned;
        this.rentCharge = rentCharge;
    }
    

    public int getIdUser() {
        return idUser;
    }

    public String[] getIdMovie() {
        return idMovie;
    }

    public int getRentNumber() {
        return rentNumber;
    }

    public String getRentDate() {
        return rentDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public boolean isReturned() {
        return returned;
    }

    public float getRentCharge() {
        return rentCharge;
    }
    
}
