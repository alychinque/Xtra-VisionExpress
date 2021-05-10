/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.Cart;
import view.Checkout;

/**
 *
 * @author Alysson Chinque
 */
public class CheckoutController {
    private final Checkout view;

    public CheckoutController(Checkout view) {
        this.view = view;
    }

    public void backCart(int session) {
        Cart cart = new Cart(session);
        this.view.dispose();
        cart.setVisible(true);
    }
}
