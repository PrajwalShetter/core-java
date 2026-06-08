package com.xworkz.learnInterface.Runner;

import com.xworkz.learnInterface.inner.SmartDevice;
import com.xworkz.learnInterface.outer.SweepingMachine;
import com.xworkz.learnInterface.outer.Tablet;
import com.xworkz.learnInterface.outer.Watch;

public class SmartDeviceRunner {

    public static void main(String[] args) {

        SmartDevice smartDevice1= new Watch();
        smartDevice1.powerOn();
        smartDevice1.powerOff();
        smartDevice1.connectWifi();
        SmartDevice.showStatus();
        System.out.println(SmartDevice.company);

        Tablet smartDevice2 = new Tablet();
        smartDevice2.powerOff();
        smartDevice2.powerOn();
        smartDevice2.connectWifi();

        SweepingMachine smartDevice3 = new SweepingMachine();
        smartDevice3.connectWifi();
        smartDevice3.powerOff();
        smartDevice3.powerOn();
    }
}
