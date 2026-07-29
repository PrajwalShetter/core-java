package com.xworkz.streamApi.task2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class CountryRunner {

    public static void main(String[] args) {

        List<String> countries = Arrays.asList("India","China","Japan","Nepal","Sri Lanka","South Africa","Australia","United States","United Kingdom",
                "New Zealand","Canada","Brazil","Argentina","Saudi Arabia","Bhutan","Pakistan","Afghanistan","Bangladesh","Germany"
                );

        //country starting with I
        System.out.println("Countries Starting with I");

        countries.stream().filter(country->country.startsWith("I"))
                .forEach(System.out::println);

        //countries Ending with A
        System.out.println("Countries end with A");
        countries.stream().filter(country->country.endsWith("A"))
                .forEach(System.out::println);

        //countries having two or more words
        System.out.println("countries having two or more words");
        countries.stream().filter(countr->countr.contains(" "))
                .forEach(System.out::println);

        //countries length morethan 10
        System.out.println("Countries length more than 10");
        countries.stream().filter(country->country.length()>10)
                .forEach(System.out::println);

        //countries length is less than equal to 5
        System.out.println("countries length is less than equal to 5");
        countries.stream().filter(country->country.length()<=5)
                .forEach(System.out::println);


        //print all countries
        System.out.println("Print all countries");
        countries.stream().forEach(System.out::println);

        //countries containing letter a
        System.out.println("countries containing letter a");
        countries.stream().filter(country->country.toLowerCase().contains("a"))
                .forEach(System.out::println);


    }

}
