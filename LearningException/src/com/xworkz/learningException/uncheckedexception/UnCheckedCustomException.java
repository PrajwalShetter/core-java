package com.xworkz.learningException.uncheckedexception;

public class UnCheckedCustomException {

    public void calculateSalary(double salary) throws InvalidSalaryException {

        if (salary < 10000) {

            throw new InvalidSalaryException(
                    "Salary must be above 10000");
        }

        System.out.println(
                "Salary processed");
    }

    public void bookTicket(int seats)throws SeatNotAvailableException {

        if (seats > 5) {

            throw new SeatNotAvailableException("Requested seats unavailable");
        }

        System.out.println(
                "Ticket booked successfully");
    }

    public void purchaseProduct(int quantity) throws ProductOutOfStockException{

        if (quantity > 3) {

            throw new ProductOutOfStockException(
                    "Product out of stock");
        }

        System.out.println(
                "Product purchased");
    }

    public void login(boolean blocked) throws AccountBlockedException {

        if (blocked) {

            throw new AccountBlockedException(
                    "Account is blocked");
        }

        System.out.println(
                "Login successful");
    }
}

