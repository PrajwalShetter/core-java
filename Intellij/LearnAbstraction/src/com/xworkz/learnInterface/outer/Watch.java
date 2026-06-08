package com.xworkz.learnInterface.outer;

import com.xworkz.learnInterface.inner.SmartDevice;

public class Watch implements SmartDevice {

    @Override
    public void powerOn() {
        System.out.println("powerOn from watch");
    }

    @Override
    public void connectWifi() {
        System.out.println("wifi from watch");
    }

    @Override
    public void powerOff() {
        System.out.println("powerOff from watch");

    }

    @Override
    public void info() {
        System.out.println("info from watch");
    }

}
