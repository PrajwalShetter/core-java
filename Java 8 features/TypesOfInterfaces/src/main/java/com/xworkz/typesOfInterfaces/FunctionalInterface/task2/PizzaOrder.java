package com.xworkz.typesOfInterfaces.FunctionalInterface.task2;

import com.xworkz.typesOfInterfaces.FunctionalInterface.task2.classes.Bill;
import com.xworkz.typesOfInterfaces.FunctionalInterface.task2.classes.Pizza;

@FunctionalInterface
public interface PizzaOrder {

    Bill order(Pizza pizza);
}
