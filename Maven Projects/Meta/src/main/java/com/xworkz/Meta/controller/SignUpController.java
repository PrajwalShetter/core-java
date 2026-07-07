package com.xworkz.Meta.controller;

import com.xworkz.Meta.dto.SignUpDto;
import com.xworkz.Meta.services.Impl.SignUpServicesImpl;
import com.xworkz.Meta.services.SignUpServices;

import java.util.List;

public class SignUpController {

    SignUpServices signUpServices = new SignUpServicesImpl();

    public void register(SignUpDto user) {

        System.out.println("Controller register() Invoked");

        signUpServices.register(user);

    }


    public void getAllData() {

        System.out.println("Controller getAllData() Invoked");

        signUpServices.getAllData();

    }

    public List<SignUpDto> retrieveData(){

        return  signUpServices.retrieveData();
    }

}