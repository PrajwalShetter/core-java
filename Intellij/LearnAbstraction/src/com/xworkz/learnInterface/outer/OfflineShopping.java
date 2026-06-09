package com.xworkz.learnInterface.outer;

import com.xworkz.learnInterface.inner.ECommerce;

public class OfflineShopping implements ECommerce {

    @Override
    public void placeOrder() {
        System.out.println("buy products directly");
    }

    @Override
    public void addToCart() {
        System.out.println("collecting items from the shelfs");
    }

    @Override
    public void cancelOrder() {
        System.out.println("return the product");
    }


}
