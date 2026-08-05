package com.xworkz.learningException.runner;

import com.xworkz.learningException.checkedexception.InvalidAgeException;
import com.xworkz.learningException.checkedexception.InvalidPinException;
import com.xworkz.learningException.task.ATM;
import com.xworkz.learningException.task.Voter;

public class TaskRunner {

    public static void main(String[] args) {

        Voter p1 = new Voter();
        Voter p2= new Voter();

        try{
            p1.checkAge(20);
            p2.checkAge(15);
        }
        catch (InvalidAgeException e) {
            System.err.println("InValid age Exception handled :"+e.getMessage());
        }

        ATM pin1=new ATM();
        ATM pin2=new ATM();
        try{
            pin1.validatePin(1234);
            pin2.validatePin(1278);
        } catch (InvalidPinException e) {
            System.err.println("InvalidPinException handled :"+e.getMessage());
        }


    }
}
