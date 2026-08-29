package com.xworkz.typesOfInterfaces.FunctionalInterface.calculator;

@FunctionalInterface
public interface Addition {

    void add(int a, int b);

    default int add(int a){
        int total = 5;
        return total;
    }

    static void add(){
        System.out.println("adding the numbers");
    }
}
