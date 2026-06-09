package com.xworkz.learnInterface.outer;

import com.xworkz.learnInterface.inner.Hospital;

public class GovtHospital implements Hospital {

    @Override
    public void admitPatient() {
        System.out.println("They were not refere to admit");
    }

    @Override
    public void provideTreatment() {
        System.out.println("Normal");
    }

    @Override
    public void dischargePatient() {
        System.out.println("patient cure then only they will discharge");
    }
}
