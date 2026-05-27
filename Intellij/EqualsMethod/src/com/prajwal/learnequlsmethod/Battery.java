package com.prajwal.learnequlsmethod;

public class Battery {
    private String brand;
    private int capacity;
    private double voltage;
    private boolean isRechargeable;
    private double price;

    public Battery() {
    }

    public Battery(String brand, int capacity, double voltage, boolean isRechargeable, double price) {
        this.brand = brand;
        this.capacity = capacity;
        this.voltage = voltage;
        this.isRechargeable = isRechargeable;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            if(obj instanceof Battery){
                Battery battery = (Battery) obj;
                if(this.brand.equals(battery.brand) && this.capacity==battery.capacity){
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public boolean isRechargeable() {
        return isRechargeable;
    }

    public void setRechargeable(boolean rechargeable) {
        isRechargeable = rechargeable;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
