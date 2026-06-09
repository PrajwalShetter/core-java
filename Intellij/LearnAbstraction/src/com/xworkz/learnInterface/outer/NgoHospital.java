package com.xworkz.learnInterface.outer;

import com.xworkz.learnInterface.inner.Hospital;

public class NgoHospital implements Hospital {

    @Override
    public void admitPatient() {
        System.out.println("from NGO Hospital");
    }

    @Override
    public void provideTreatment() {
        System.out.println("they treat normal ");
    }

    @Override
    public void dischargePatient() {
        System.out.println("if the patient cure then they will");
    }


}
