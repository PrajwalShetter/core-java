package com.xworkz.learnInterface.outer;

import com.xworkz.learnInterface.inner.SmartDevice;

public class Tablet implements SmartDevice {

    @Override
    public void connectWifi() {
        System.out.println("wifi from tablet");
    }

    @Override
    public void powerOn() {
        System.out.println("powerOn from tablet");
    }

    @Override
    public void powerOff() {
        System.out.println("powerOff from tablet");
    }
}
