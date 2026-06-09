package com.xworkz.learnInterface.inner;

public interface Hospital {

    String hospitalName= "Ramahaya hospital";
    int noOfBeds = 250;

    void admitPatient();

    void provideTreatment();

    void dischargePatient();

    default void hospitalPolicy(){
        System.out.println("must and should follow the policy");
    }

    static  void emergencyContact(){
        System.out.println("108");
    }


}
