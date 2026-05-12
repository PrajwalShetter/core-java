package com.prajwal.library;

public class Book {
    private String name;
    private double cost;
    private int noOfPages;
    private String language;

    public void setName(String name){
        this.name=name;
    }
    public void setCost(double cost){
        this.cost=cost;
    }
    public void setNoOfPages(int pages){
        this.noOfPages=pages;
    }
    public void setLanguage(String lang){
        this.language=lang;
    }

    public String getName(){
        return this.name;
    }
    public double getCost(){
        return this.cost;
    }
    public  int getNoOfPages(){
        return this.noOfPages;
    }
    public  String getLanguage(){
        return this.language;
    }

    @Override
    public String toString(){
        return "@134frhg";
    }
}
