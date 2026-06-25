package com.xworkz.Collections.genericclass;

public class DishRunner {

    public static void main(String[] args) {

        Dish<String> dish1= new Dish<>("Burger");

        Dish<Integer> dish2 = new Dish<>(100);

        dish2.display();
        dish1.display();
    }
}
