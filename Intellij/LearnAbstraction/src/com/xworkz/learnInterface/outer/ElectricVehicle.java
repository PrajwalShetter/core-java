package com.xworkz.learnInterface.outer;

import com.xworkz.learnInterface.inner.VehiclePark;

public class ElectricVehicle implements VehiclePark {

    @Override
    public int minCharge(){
        return 60;
    }

    @Override
    public void modeOfPayment(){
        System.out.println("payment Mode : Online");
    }

    @Override
    public void deposit() {

    }

    @Override
    public void withdraw() {

    }

    @Override
    public void checkBalance() {

    }

    @Override
    public void accountStatus() {
        VehiclePark.super.accountStatus();
    }

    @Override
    public void addToCart() {

    }

    @Override
    public void placeOrder() {

    }

    @Override
    public void cancelOrder() {

    }

    @Override
    public void OfferDetails() {
        VehiclePark.super.OfferDetails();
    }
}
