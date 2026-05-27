package com.prajwal.learnequlsmethod;

public class Camera {

    private String brand;
    private int megapixel;
    private double price;
    private boolean isDigital;
    private String color;

    public Camera(String brand, int megapixel, double price, boolean isDigital, String color) {
        this.brand = brand;
        this.megapixel = megapixel;
        this.price = price;
        this.isDigital = isDigital;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            if(obj instanceof Camera){
                Camera camera = (Camera) obj;
                if(this.brand.equals(camera.brand) && this.price==camera.price){
                    return true;
                }
            }
        }
        return false;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMegapixel() {
        return megapixel;
    }

    public void setMegapixel(int megapixel) {
        this.megapixel = megapixel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDigital() {
        return isDigital;
    }

    public void setDigital(boolean digital) {
        isDigital = digital;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Camera() {

    }




}
