package com.xworkz.learningException.runner;

import com.xworkz.learningException.checkedexception.*;

public class CustomCheckedExceptionRunner {

    public static void main(String[] args) {

        CheckedCustomException checked =
                new CheckedCustomException();

        // Single Catch
        try {

            checked.drive(16);

        }
        catch (InvalidAgeException e){

            System.err.println(
                    "InvalidAgeException handled : "
                            + e.getMessage());
        }

        // Multiple Catch
        try {

            checked.withdraw(1000);
            checked.marriage(18);

        }
        catch (InvalidTransactionException e){

            System.err.println(
                    "InvalidTransactionException handled : "
                            + e.getMessage());
        }
        catch (InvalidAgeException e){

            System.err.println(
                    "InvalidAgeException handled : "
                            + e.getMessage());
        }

        // Multi Catch
        try {

            checked.orderLaptops("DELL-101",10);
            checked.login("prajwal","1234");

        }
        catch (InventoryShortageException |
               PasswordExpiredException e){

            System.out.println(
                    "Exception handled successfully : "
                            + e.getMessage());
        }
    }
}
