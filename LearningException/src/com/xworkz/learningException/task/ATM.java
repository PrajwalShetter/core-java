package com.xworkz.learningException.task;

import com.xworkz.learningException.checkedexception.InvalidPinException;

public class ATM {

    int correctPin= 1234;

    public void validatePin(int pin)throws InvalidPinException {

        if(pin != correctPin){
            throw new InvalidPinException("Yor pin is wrong");
        }
        else {
            System.out.println("Login successfull");
        }

    }
}
