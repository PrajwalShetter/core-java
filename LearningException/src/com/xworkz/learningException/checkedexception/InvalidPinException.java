package com.xworkz.learningException.checkedexception;

public class InvalidPinException extends RuntimeException {
    public InvalidPinException(String message) {

        super(message);
    }
}
