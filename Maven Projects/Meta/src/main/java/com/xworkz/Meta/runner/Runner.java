package com.xworkz.Meta.runner;

import com.xworkz.Meta.controller.SignUpController;
import com.xworkz.Meta.dto.SignUpDto;

public class Runner {

    public static void main(String[] args) {

        SignUpDto user1 = new SignUpDto();
        user1.setUserName("Prajwal");
        user1.setAge(23);
        user1.setMobileNo("9908765432");
        user1.setPassword("praj@8769");
        user1.setConfirmPassword("praj@8769");
        user1.setNationality("Indian");

        SignUpController signUpController = new SignUpController();
        signUpController.register(user1);
    }
}
