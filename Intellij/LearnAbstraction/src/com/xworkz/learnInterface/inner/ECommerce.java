package com.xworkz.learnInterface.inner;

public interface ECommerce {

    int maxOrders = 100000;


    void addToCart();

    void placeOrder();

    void cancelOrder();

    default  void OfferDetails(){
        System.out.println("when available");
    }

}
