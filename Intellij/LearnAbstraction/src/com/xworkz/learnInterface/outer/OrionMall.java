package com.xworkz.learnInterface.outer;

import com.xworkz.learnInterface.inner.VehiclePark;

// the associate class can use the interface with the help of implemented class
public class OrionMall extends ElectricVehicle {

    private VehiclePark vehiclePark;


    public OrionMall(VehiclePark vehiclePark){
        this.vehiclePark =vehiclePark;
    }

    public void allowPark(){

        if(vehiclePark != null){

            System.out.println("Vehicle Parking Allowed");

            int charge = vehiclePark.minCharge(); // abstraction

            System.out.println("Minimum Charge : " + charge);

            vehiclePark.modeOfPayment(); // abstraction
        }
        else{
            System.out.println("Parking Rule Not Found");
        }
        }
    }

