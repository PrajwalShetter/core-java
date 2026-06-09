package com.xworkz.learnInterface.inner;

public interface Restaurant {

    double gst=18.0;

    void takeOrder();

    void prepareFood();
     void serveFood();

     default void customerFeedBack(){
         System.out.println("Its importent");
     }

     static void restaurantInfo(){
         System.out.println("Describe your info");
     }
}
