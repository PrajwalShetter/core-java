package com.xworkz.learningMVC.inner;

import java.util.Scanner;

public class KeyboardInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;
        double height;
        boolean isActive;
        int age;
        long phoneNumber;
        float width;


        System.out.println("Enter your name :");
        name=scanner.nextLine();
        System.out.println("Enter your age :");
        age=scanner.nextInt();
        System.out.println("Enter your height :");
        height=scanner.nextDouble();
        System.out.println("Active status :");
        isActive = scanner.nextBoolean();
        System.out.println("phoneNumber :");
        phoneNumber = scanner.nextLong();
        System.out.println("width :");
        width= scanner.nextFloat();



        System.out.println("Name ="+name);
        System.out.println("age ="+age);
        System.out.println("height ="+height);
        System.out.println("Active status ="+isActive);
        System.out.println("phoneNumber ="+phoneNumber);
        System.out.println("width = "+width);



    }
}
