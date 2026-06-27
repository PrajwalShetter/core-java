package com.xworkz.cloneable.standapp;

public class StandRunner {

    public static void main(String[] args) {

        Stand stand = new Stand();
        stand.setStandId(3);
        stand.setBrand("BMW");
        System.out.println(stand);
        try{
            Stand stand1 = stand.getClone();
            stand1.setStandId(4);
            stand1.setBrand("toyota");
            System.out.println(stand1);
        }catch (CloneNotSupportedException e){
            e.printStackTrace();

        }
    }
}
