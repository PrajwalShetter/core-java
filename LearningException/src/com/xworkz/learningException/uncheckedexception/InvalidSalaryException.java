package com.xworkz.learningException.uncheckedexception;

public class InvalidSalaryException extends RuntimeException {

    public InvalidSalaryException(String message) {

        super(message);
    }
}
