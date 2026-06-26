package com.xworkz.learningException.runner;

import com.xworkz.learningException.checkedexception.CheckedException;
import com.xworkz.learningException.checkedexception.CheckedException1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExeRunner {
    public static void main(String[] args) {
        // 1st day
        CheckedException exceptionDemo = new CheckedException();
            exceptionDemo.withdraw(-1500.00);
        System.out.println("Thank-you for using  application");


    }
}
