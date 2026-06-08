package com.xworkz.learnInterface.outer;

import com.xworkz.learnInterface.inner.Cloth;

public class Polo implements Cloth {

    @Override
    public void wear(){
        System.out.println("wear from polo ");
    }

    @Override
    public void fold() {
        System.out.println("fold from polo");
    }

    @Override
    public void wash() {
        System.out.println("wash from polo");
    }

    //we want to override the default method or else its based on developer wish
    @Override
    public void display() {
        System.out.println("display from polo");
    }


}
