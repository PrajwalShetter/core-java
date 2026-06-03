package com.prajwal.inner;

public class Food {

    private String oilBrand;
    private String chilliPowder;
    int vegetables;
    protected String spices;


    protected Food() {
    }

    protected Food(String oilBrand, String chilliPowder, int vegetables, String spices) {
        this.oilBrand = oilBrand;
        this.chilliPowder = chilliPowder;
        this.vegetables = vegetables;
        this.spices = spices;
    }

    protected void process(){
        System.out.println("First we should follow the steps");
    }

}


