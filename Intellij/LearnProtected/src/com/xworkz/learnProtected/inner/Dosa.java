package com.xworkz.learnProtected.inner;

public class Dosa {



    public static void main(String[] args) {



        Food food = new Food(); // creating reference of a food it will allow us to access protected things in that file but it should be in same package

        // this class is not extends any parent so, we can create instance of that class and able to access protected things
        food.process();
        System.out.println(food.spices);
    }
}