package com.xworkz.Collections.genericclass;

public class Dish<T>{

    private T value;

    public Dish(T value){
        this.value = value;
    }

    public void display(){
        System.out.println("Value ="+this.value);
    }

}
