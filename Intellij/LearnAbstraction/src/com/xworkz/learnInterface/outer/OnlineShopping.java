package com.xworkz.learnInterface.outer;

import com.xworkz.learnInterface.inner.ECommerce;

public class OnlineShopping implements ECommerce {

    @Override
    public void addToCart() {
        System.out.println("added to cart");
    }

    @Override
    public void placeOrder() {
        System.out.println("Placed an order");
    }

    @Override
    public void cancelOrder() {
        System.out.println("cancelling the order");
    }

    @Override
    public void OfferDetails() {
        System.out.println("July month offer starts");
    }
}
