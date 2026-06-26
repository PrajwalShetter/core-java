package com.xworkz.learningException.runner;

import com.xworkz.learningException.uncheckedexception.*;

public class UnCheckedCustomExceptionRunner {

    public static void main(String[] args) {

        UnCheckedCustomException unchecked =
                new UnCheckedCustomException();

        // Single Catch
        try {

            unchecked.calculateSalary(5000);

        }
        catch (InvalidSalaryException e){

            System.err.println(
                    "InvalidSalaryException handled : "
                            + e.getMessage());
        }

        // Multiple Catch
        try {

            unchecked.bookTicket(10);
            unchecked.purchaseProduct(5);

        }
        catch (SeatNotAvailableException e){

            System.err.println(
                    "SeatNotAvailableException handled : "
                            + e.getMessage());
        }
        catch (ProductOutOfStockException e){

            System.err.println(
                    "ProductOutOfStockException handled : "
                            + e.getMessage());
        }

        // Multi Catch
        try {

            unchecked.purchaseProduct(10);
            unchecked.login(true);

        }
        catch (ProductOutOfStockException |
               AccountBlockedException e){

            System.out.println(
                    "Exception handled successfully : "
                            + e.getMessage());
        }
    }
}
