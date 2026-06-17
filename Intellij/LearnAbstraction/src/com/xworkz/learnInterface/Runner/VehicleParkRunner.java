package com.xworkz.learnInterface.Runner;

import com.xworkz.learnInterface.inner.VehiclePark;
import com.xworkz.learnInterface.outer.ElectricVehicle;
import com.xworkz.learnInterface.outer.OrionMall;

public class VehicleParkRunner {

    public static void main(String[] args) {

        VehiclePark rule = new ElectricVehicle();
        OrionMall OrionMall = new OrionMall(rule);
        OrionMall.allowPark();

    }
}
