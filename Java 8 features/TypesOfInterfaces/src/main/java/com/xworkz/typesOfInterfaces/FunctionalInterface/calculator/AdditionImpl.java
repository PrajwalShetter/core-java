package com.xworkz.typesOfInterfaces.FunctionalInterface.calculator;

public class AdditionImpl implements Addition{
    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
    }

    @Override
    public  int add(int a){
        return 5;
    }


}
