package com.xworkz.typesOfInterfaces.FunctionalInterface.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Runner {
    public static void main(String[] args) {


        Addition addition = (a,b) ->{
            System.out.println(a+b);
        };
        addition.add(2,9);

        Substraction substraction =(a,b) ->{
            System.out.println(a-b);
        };
        substraction.sub(90,8);

        Multiplication mul = (a,b) ->{
            System.out.println(a*b);
        };
        mul.multi(2,9);

        Division division = (a,b) ->{
            System.out.println(a/b);
        };
        division.div(6,3);

        Moduleus mod =(a,b) ->{
            System.out.println(a%b);
        };
        mod.module(2,9);


        //predictae -- boolean
        //consumer -- void
        //function --
        //Biconsumer -- accept
        //suplier -- get()
        List<String> list = new ArrayList<>();
        list.add("Babu");
        list.add("put");
        list.add("Nail Cutter");

        Consumer consumer = (str) ->{
            System.out.println(str);
        };
        list.forEach(consumer);

        list.forEach(str ->{
            System.out.println(str);
        });

        Supplier<String> comp= () ->{
            return "prajwal";
        };
        comp.get();


    }



}
