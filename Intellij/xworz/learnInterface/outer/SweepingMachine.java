package com.xworz.learnInterface.outer;

import com.xworz.learnInterface.inner.SmartDevice;

public class SweepingMachine implements SmartDevice {

    @Override
    public void connectWifi() {
        System.out.println("wifi from sweepingMchine");
    }

    @Override
    public void powerOff() {
        System.out.println("powerOff from sweepingMchine");
    }

    @Override
    public void powerOn() {
        System.out.println("powerOn from sweepingMchine");
    }
}

