package com.xworkz.learnAbstraction.inner;

abstract class Hotel {
     protected String owner;
     protected String location;
     protected int noOfStaff;

    public Hotel(String owner) {
        this.owner = owner;
    }

    public Hotel(String owner, int noOfStaff) {
        this.owner = owner;
        this.noOfStaff = noOfStaff;
    }

    public Hotel() {
    }

    abstract void luxury();

    public void display(){
        System.out.println("i am in hotel");
    }
}

