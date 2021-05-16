package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alych
 */
/**
 * 
 * @author Maicon
 * A class with some variables that will be applied in the cart
 */
public class MoviesCart {
    private int session;
    private int movie1;
    private int movie2;
    private int movie3;
    private int movie4;
    /**
     * 
     * Every session will hold up to 4 movies
     */
    public MoviesCart(int session, int movie1, int movie2, int movie3, int movie4) {
        this.session = session;
        this.movie1 = movie1;
        this.movie2 = movie2;
        this.movie3 = movie3;
        this.movie4 = movie4;
    }

    public int getSession() {
        return session;
    }

    public void setSession(int session) {
        this.session = session;
    }

    public int getMovie1() {
        return movie1;
    }

    public void setMovie1(int movie1) {
        this.movie1 = movie1;
    }

    public int getMovie2() {
        return movie2;
    }

    public void setMovie2(int movie2) {
        this.movie2 = movie2;
    }

    public int getMovie3() {
        return movie3;
    }

    public void setMovie3(int movie3) {
        this.movie3 = movie3;
    }

    public int getMovie4() {
        return movie4;
    }

    public void setMovie4(int movie4) {
        this.movie4 = movie4;
    }
    
}
