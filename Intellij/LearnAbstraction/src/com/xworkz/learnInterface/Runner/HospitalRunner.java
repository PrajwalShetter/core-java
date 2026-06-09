package com.xworkz.learnInterface.Runner;

import com.xworkz.learnInterface.inner.Hospital;
import com.xworkz.learnInterface.outer.CityHospital;
import com.xworkz.learnInterface.outer.GovtHospital;
import com.xworkz.learnInterface.outer.NgoHospital;

public class HospitalRunner {

    public static void main(String[] args) {

        CityHospital hospital1= new CityHospital();
        hospital1.admitPatient();
        hospital1.provideTreatment();
        hospital1.dischargePatient();
        hospital1.hospitalPolicy();
        System.out.println(Hospital.hospitalName);

        NgoHospital hospital2= new NgoHospital();
        hospital2.admitPatient();
        hospital2.provideTreatment();
        hospital2.dischargePatient();

        GovtHospital hospital3 = new GovtHospital();
        hospital3.admitPatient();
        hospital3.provideTreatment();
        hospital3.dischargePatient();
    }
}
