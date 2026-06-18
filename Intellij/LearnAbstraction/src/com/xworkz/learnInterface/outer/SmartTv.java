package com.xworkz.learnInterface.outer;

import com.xworkz.learnInterface.inner.SmartDevice1;

public class SmartTv implements SmartDevice1 {

    @Override
    public void updateSoftware() {

    }

    @Override
    public void restartDevice() {

    }

    @Override
    public void showStatus() {
        SmartDevice1.super.showStatus();
    }

    @Override
    public void connectInternet() {
        System.out.println("The device is connected");
    }

    @Override
    public void disConnectInternet() {
        System.out.println("the device is disconnected");

    }

    @Override
    public void switchOn() {
        System.out.println("switching on the device");
    }

    @Override
    public void switchOff() {
        System.out.println("switch off the device");

    }
}
