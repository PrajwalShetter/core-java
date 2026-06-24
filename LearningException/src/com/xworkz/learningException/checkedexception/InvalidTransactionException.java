package com.xworkz.learningException.checkedexception;

public class InvalidTransactionException extends Exception{

    public  InvalidTransactionException(String message){

        super(message);
    }
}
