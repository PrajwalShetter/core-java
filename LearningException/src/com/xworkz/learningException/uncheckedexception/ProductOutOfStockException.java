package com.xworkz.learningException.uncheckedexception;

public class ProductOutOfStockException extends Exception{

    public ProductOutOfStockException(String message) {

        super(message);
    }
}
