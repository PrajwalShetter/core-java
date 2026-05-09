package com.prajwal.details;

public class Runner {
    public static void main(String[] args) {

        PersonalDetails details = new PersonalDetails();

        details.setName("Prajwal Shetter");
        details.setAge(24);
        details.setGender("Male");

        System.out.println(details.getName());
        System.out.println(details.getAge());
        System.out.println(details.getGender());
    }
}