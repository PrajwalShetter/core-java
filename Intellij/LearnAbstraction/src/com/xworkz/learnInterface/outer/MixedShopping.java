package com.xworkz.learnInterface.outer;

import com.xworkz.learnInterface.inner.ECommerce;

public class MixedShopping implements ECommerce {

    @Override
    public void addToCart() {
        System.out.println( "from mixed shopping");
    }

    @Override
    public void placeOrder() {
        System.out.println("from mixed shopping");
    }

    @Override
    public void cancelOrder() {
        System.out.println("from mixed shopping");
    }


}
