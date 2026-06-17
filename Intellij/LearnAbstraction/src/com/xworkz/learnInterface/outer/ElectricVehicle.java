package com.xworkz.learnInterface.outer;

import com.xworkz.learnInterface.inner.VehiclePark;

public class ElectricVehicle implements VehiclePark {

    @Override
    public int minCharge(){
        return 60;
    }

    @Override
    public void modeOfPayment(){
        System.out.println("Online");
    }
}
