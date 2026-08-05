package com.xworkz.learningException.task;

import com.xworkz.learningException.checkedexception.InvalidAgeException;

public class Voter {

   public void  checkAge(int age)throws InvalidAgeException {
        if(age<18){
            throw  new InvalidAgeException("You are not eligible to vote");
        }
        else {
            System.out.println("Eligible for voting");
        }
    }
}
