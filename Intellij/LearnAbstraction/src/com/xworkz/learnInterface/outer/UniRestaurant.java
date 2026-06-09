package com.xworkz.learnInterface.outer;

import com.xworkz.learnInterface.inner.Restaurant;

public class UniRestaurant implements Restaurant {

    @Override
    public void takeOrder() {
        System.out.println("take order from uniRestaurant");
    }

    @Override
    public void prepareFood() {
        System.out.println("preparing food from uniRestaurant");
    }

    @Override
    public void serveFood() {
        System.out.println("serving food from Restaurant");
    }


}
