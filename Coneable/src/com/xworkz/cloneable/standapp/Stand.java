package com.xworkz.cloneable.standapp;

import java.util.Objects;

public class Stand implements Cloneable{

    private int standId;
    private String brand;

    public int getStandId() {
        return standId;
    }

    public void setStandId(int standId) {
        this.standId = standId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Stand{" +
                "standId=" + standId +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Stand stand = (Stand) o;
        return standId == stand.standId && Objects.equals(brand, stand.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(standId, brand);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();


    }

    public Stand getClone()throws CloneNotSupportedException{
//        Stand stand = new Stand();
//        stand.setStandId(1);
//        stand.setBrand("");
//        System.out.println(stand);

        Stand stand1 = (Stand) clone(); //dont confuse here casting is done
        return stand1;
    }
}
