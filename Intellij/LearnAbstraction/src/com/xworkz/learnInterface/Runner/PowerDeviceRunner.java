package com.xworkz.learnInterface.Runner;

import com.xworkz.learnInterface.inner.SmartDevice1;
import com.xworkz.learnInterface.outer.HomeAutomation;
import com.xworkz.learnInterface.outer.SmartTv;

public class PowerDeviceRunner {

    public static void main(String[] args) {

        SmartDevice1 device = new SmartTv();
        HomeAutomation home = new HomeAutomation(device);

        home.operate();
    }
}
