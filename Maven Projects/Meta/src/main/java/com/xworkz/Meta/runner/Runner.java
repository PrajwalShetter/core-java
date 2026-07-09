package com.xworkz.Meta.runner;

import com.xworkz.Meta.controller.SignUpController;
import com.xworkz.Meta.dto.SignUpDto;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        SignUpDto user = new SignUpDto();

//        user.setUserName("Prajwal");
//        user.setAge(23);
//        user.setMobileNo("9908765432");
//        user.setPassword("Praj@8769");
//        user.setConfirmPassword("Praj@8769");
//        user.setNationality("Indian");

        SignUpController controller = new SignUpController();

        //controller.register(user);

       // controller.getAllData();

        List<SignUpDto> list = controller.retrieveData();

        for (SignUpDto dto : list) {

            System.out.println(dto.getUserName());
            System.out.println(dto.getAge());
            System.out.println(dto.getMobileNo());
            System.out.println(dto.getPassword());
            System.out.println(dto.getNationality());

            System.out.println("------------------");
        }

//        System.out.println("calling getById in controller");
//        controller.getById(4);

        System.out.println("Calling getByIdAndName in controller");
        controller.getByIdAndName(3,"prajwal");


        System.out.println("calling update() in controller");
        controller.update();

        System.out.println("calling delete() in controller");
        controller.delete();
    }

}

