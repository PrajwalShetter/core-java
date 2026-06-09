package com.xworkz.learnInterface.Runner;

import com.xworkz.learnInterface.inner.Restaurant;
import com.xworkz.learnInterface.outer.NonVegRestaurant;
import com.xworkz.learnInterface.outer.UniRestaurant;
import com.xworkz.learnInterface.outer.VegRestaurant;

public class RestaurantRunner {

    public static void main(String[] args) {

        Restaurant restaurant1= new VegRestaurant();
        restaurant1.takeOrder();
        restaurant1.prepareFood();
        restaurant1.serveFood();
        restaurant1.customerFeedBack();
        System.out.println(Restaurant.gst);

        NonVegRestaurant restaurant2= new NonVegRestaurant();
        restaurant2.takeOrder();
        restaurant2.prepareFood();
        restaurant2.serveFood();


        UniRestaurant restaurant3= new UniRestaurant();
        restaurant3.prepareFood();
        restaurant3.takeOrder();
        restaurant3.serveFood();


    }


}
