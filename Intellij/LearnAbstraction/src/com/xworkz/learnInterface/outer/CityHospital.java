package com.xworkz.learnInterface.outer;

import com.xworkz.learnInterface.inner.Hospital;

public class CityHospital implements Hospital {

    @Override
    public void admitPatient() {
        System.out.println("from city Hospital");
    }

    @Override
    public void provideTreatment() {
        System.out.println("good treatment");
    }

    @Override
    public void dischargePatient() {
        System.out.println("patient quers then dischange");
    }

    @Override
    public void hospitalPolicy() {
        System.out.println("Lot of complications");
    }
}
