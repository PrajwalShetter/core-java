package com.xworkz.learningMVC.inner;

public class Bot {

    public void orderDetails(String order){

        if(order != null && order.equalsIgnoreCase("laptop")){
            System.out.println("name of the laptop is HP15s");
            System.out.println("Price :72000 \n memory:1tb \n threads :16 core :8");
        }
        else if (order.equalsIgnoreCase("Mobile")) {
            System.out.println("Name :OPPO");
            System.out.println("storage :64gb and 6gb ram");

        } else if (order.equalsIgnoreCase("chair")) {
            System.out.println("chair belongs to prestige company ");
            System.out.println("The overall ratings is 4 out of 5");

        } else if (order.equalsIgnoreCase("Building")) {
            System.out.println("the building built on 40 years ago");
            System.out.println("The building has 40 flats");
        }
        else {
            System.out.println("couldn't respond this request");
        }
    }
}
