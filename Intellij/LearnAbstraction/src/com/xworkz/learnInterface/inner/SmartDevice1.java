package com.xworkz.learnInterface.inner;

public interface SmartDevice1 extends PowerDevice,InterNetDevice{

    void updateSoftware();

    void restartDevice();

    default void showStatus(){
        System.out.println("Going well");
    }

    static void companyInfo(){
        System.out.println("bolt");
    }
}


