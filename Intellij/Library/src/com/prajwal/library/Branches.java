package com.prajwal.library;

public class Branches {
    private  String location;
    private String name;
    private double sqft;
    private boolean govt;

    public void setName(String name) {
        this.name = name;
    }

    public void setGovt(boolean govt) {
        this.govt = govt;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setSqft(double sqft) {
        this.sqft = sqft;
    }

    public String toString(){
        return "Name :"+name + " govt :"+govt + " location :"+location + " sqrt :"+sqft;
    }

    public String getName(){
        return this.name;
    }
    public boolean getGovt(){
        return this.govt;
    }
    public String getLocation() {
        return location;
    }
    public double getSqft() {
        return sqft;
    }
}
