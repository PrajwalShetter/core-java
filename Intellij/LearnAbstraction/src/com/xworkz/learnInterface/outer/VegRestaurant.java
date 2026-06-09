package com.xworkz.learnInterface.outer;

import com.xworkz.learnInterface.inner.Restaurant;

public class VegRestaurant implements Restaurant {

    @Override
    public void takeOrder() {
        System.out.println("from vegRestaurant");


    }

    @Override
    public void prepareFood() {
        System.out.println("preparing food from veg Restaurant");
    }

    @Override
    public void serveFood() {
        System.out.println("serving food from veg Restaurant");
    }

    @Override
    public void customerFeedBack() {
        System.out.println("Good");
    }
}
