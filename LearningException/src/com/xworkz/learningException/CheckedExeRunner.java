package com.xworkz.learningException;

import com.xworkz.learningException.checkedexception.CheckedException;

public class CheckedExeRunner {
    public static void main(String[] args) {

        CheckedException exceptionDemo = new CheckedException();


            exceptionDemo.withdraw(-1500.00);

        System.out.println("Thank-you for using  application");
    }
}
