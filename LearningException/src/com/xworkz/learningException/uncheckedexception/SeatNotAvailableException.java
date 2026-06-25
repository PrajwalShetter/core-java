package com.xworkz.learningException.uncheckedexception;

public class SeatNotAvailableException extends Exception{

    public SeatNotAvailableException(String message) {

        super(message);
    }
}
