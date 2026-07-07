package com.xworkz.Meta.services.Impl;

import com.xworkz.Meta.dao.Impl.SignUpDaoImpl;
import com.xworkz.Meta.dto.SignUpDto;
import com.xworkz.Meta.services.SignUpServices;

import java.util.List;

public class SignUpServicesImpl implements SignUpServices {

    SignUpDaoImpl signUpDaoImpl = new SignUpDaoImpl();

    @Override
    public void register(SignUpDto user) {

        boolean isUsernameValid = false;
        boolean isAgeValid = false;
        boolean isMobileNoValid = false;
        boolean isPasswordValid = false;
        boolean isConfirmPasswordValid = false;
        boolean isNationalityValid = false;

        if (user != null) {

            if (user.getUserName() != null &&
                    user.getUserName().matches("^[a-zA-Z ]{3,16}$")) {

                isUsernameValid = true;
            }

            if (user.getAge() > 16) {
                isAgeValid = true;
            }

            if (user.getMobileNo() != null &&
                    user.getMobileNo().matches("^[6-9][0-9]{9}$")) {

                isMobileNoValid = true;
            }

            if (user.getPassword() != null &&
                    user.getPassword().matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&]).{8,}$")) {

                isPasswordValid = true;
            }

            if (user.getConfirmPassword() != null &&
                    user.getConfirmPassword().equals(user.getPassword())) {

                isConfirmPasswordValid = true;
            }

            if (user.getNationality() != null &&
                    user.getNationality().matches("^[a-zA-Z]{3,20}$")) {

                isNationalityValid = true;
            }

        } else {
            System.out.println("User Object is Null");
            return;
        }

        System.out.println("Username Valid : " + isUsernameValid);
        System.out.println("Age Valid      : " + isAgeValid);
        System.out.println("Mobile Valid   : " + isMobileNoValid);
        System.out.println("Password Valid : " + isPasswordValid);
        System.out.println("Confirm Valid  : " + isConfirmPasswordValid);
        System.out.println("Nationality    : " + isNationalityValid);

        if (isUsernameValid &&
                isAgeValid &&
                isMobileNoValid &&
                isPasswordValid &&
                isConfirmPasswordValid &&
                isNationalityValid) {

            System.out.println("All Validations Passed");

            signUpDaoImpl.register(user);

        } else {

            System.out.println("Validation Failed");

        }

    }

    @Override
    public void getAllData() {

        System.out.println("Service getAllData() Invoked");

        signUpDaoImpl.getAllData();

    }

    @Override
    public List<SignUpDto> retrieveData(){
        return signUpDaoImpl.retrieveData();
    }
}