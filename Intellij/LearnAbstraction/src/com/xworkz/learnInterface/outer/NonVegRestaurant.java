package com.xworkz.learnInterface.outer;

import com.xworkz.learnInterface.inner.Restaurant;

public class NonVegRestaurant implements Restaurant {

    @Override
    public void takeOrder() {
        System.out.println("take order from nonVegRestaurant");
    }

    @Override
    public void prepareFood() {
        System.out.println("prepare food from nonVegRestaurant");
    }

    @Override
    public void serveFood() {
        System.out.println("serving food from nonvegRestaurant");
    }
}
