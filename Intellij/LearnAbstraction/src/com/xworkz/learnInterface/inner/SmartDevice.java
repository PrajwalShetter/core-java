package com.xworkz.learnInterface.inner;

public interface SmartDevice {

    String company="SamSung";
    int warranty_year=2;

    void powerOn();

    void powerOff();

    void connectWifi();

    default void info(){
        System.out.println("Info from SmartDevice");
    }

    static void showStatus(){
        System.out.println("showStatus from smartDevice");
    }

}
