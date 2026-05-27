package com.prajwal.learnequlsmethod;

public class Icecream {

    private String flavor;
    private double price;
    private String brand;
    private int quantity;
    private boolean isAvailable;

    public Icecream() {
    }

    public Icecream(String flavor, double price, String brand, int quantity, boolean isAvailable) {
        this.flavor = flavor;
        this.price = price;
        this.brand = brand;
        this.quantity = quantity;
        this.isAvailable = isAvailable;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            if(obj instanceof Icecream){
                Icecream icecream = (Icecream) obj;
                if(this.flavor.equals(icecream.flavor) && this.brand.equals(icecream.brand)){
                    return true;
                }
            }
        }
        return false;
    }
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }




}
