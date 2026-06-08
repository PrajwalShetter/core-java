package com.xworz.learnInterface.inner;


public interface Cloth {
    //interface does not support constructor same as abstract class , we can't create instance on interface

    // variables all are by default public, static, final
    String material = "cotton";
    double  gst= 12.5;

    //interface is 100% abstraction before introduce of java8 now, interface also support default function
    //every method in the interface , by default abstract methods

    void wear();

    void wash();

    void fold();

    default void display(){
        System.out.println("default method from cloth");

    }

    public static void info(){
        System.out.println("static method from cloth");
    }


}
