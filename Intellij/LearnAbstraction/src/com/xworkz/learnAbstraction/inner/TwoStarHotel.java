package com.xworkz.learnAbstraction.inner;

public class TwoStarHotel extends Hotel{

    public TwoStarHotel(String owner, int noOfStaff){

        super(owner, noOfStaff);
    }

    // we need not overRide the abstract method of parent class, then you have to declare the child class has abstract
    //if you override the abstract method of the parent class, then you need not declare the child class as abstract
    @Override
    public  void luxury(){

    }


    @Override
    public void display() {
        System.out.println("I am in 2 * hotel");
    }
}
