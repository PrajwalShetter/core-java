package com.xworkz.learnProtected.outer;

import com.xworkz.learnProtected.inner.Food;

public class ChilliChicken {

    public static void main(String[] args) {
        Food food = new Food();
        // Food() constructor is protected.
        // ChilliChicken is in a different package and is NOT a subclass of Food.
        // Therefore, the protected constructor cannot be accessed.

        System.out.println(food.spices);
        food.process();
    }
}
