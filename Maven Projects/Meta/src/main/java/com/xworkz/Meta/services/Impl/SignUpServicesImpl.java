package com.xworkz.Meta.services.Impl;

import com.xworkz.Meta.dao.Impl.SignUpDaoImpl;
import com.xworkz.Meta.dto.SignUpDto;
import com.xworkz.Meta.services.SignUpServices;

public class SignUpServicesImpl  implements SignUpServices {

    SignUpDaoImpl signUpDaoImpl = new SignUpDaoImpl();

    @Override
    public void register(SignUpDto user) {
boolean isUsernameValid =false;
boolean isAgeValid =false;
boolean isMobileNo =false;
boolean isPassword = false;
boolean isConfirmPassword = false;
boolean isNationality = false;
        if(user != null ){

            if(user.getUserName() != null && user.getUserName().matches("^[a-zA-Z]{3,16}$") && user.getUserName().matches("^[a-zA-Z\\s]+$")){
                boolean isUserNameValid = true;
            }
            if( user.getAge() >16){
                isAgeValid = true;
            }
            if(user.getMobileNo() != null && user.getMobileNo().matches("^\\+?[1-9]\\d{1,14}$") ){
                isMobileNo = true;
            }

            if (user.getPassword() != null && user.getPassword().matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$")){
                isPassword = true;
            }
            if(user.getConfirmPassword().equals(user.getPassword())){
                isConfirmPassword = true;
            }
            if ( user.getNationality().matches("^[a-zA-Z]{3,16}$")){

            }
        }
        else{
            System.out.println("user should not be null");
        }
        if (is)
    }
}
