package com.xworkz.learningException.checkedexception;

import java.time.LocalDate;

public class CheckedCustomException {

    public void drive(int age) throws InvalidAgeException{

        if(age < 18){
            throw new InvalidAgeException("Not Eligible to drive");
        }
        else {
            System.out.println("Eligible to drive");
        }
    }

    public void marriage(int age) throws InvalidAgeException{

        if(age<21){
            throw new InvalidAgeException("Not eligible for marriage");
        }
        else {
            System.out.println("Eligible for marriage");
        }
    }

    private double balance =500.00;

    public void withdraw(double amount) throws InvalidTransactionException{

        if(amount > balance){
            throw new InvalidTransactionException("Withdrawal failed :Insufficient balance");

        }
        else{
            balance -= amount;
            System.out.println("Withdrawal Successful :"+balance);
        }
    }

    private int laptopStock = 3;

    public void orderLaptops(String sku, int quantity) throws InventoryShortageException {
        if (quantity > laptopStock) {
            throw new InventoryShortageException(sku, laptopStock, "Requested quantity is unavailable.");
        }
        laptopStock -= quantity;
        System.out.println("Order placed successfully for " + quantity + " units.");
    }


    private final LocalDate passwordExpiry = LocalDate.now().minusDays(5); // Expired 5 days ago

    public void login(String username, String password) throws PasswordExpiredException {
        // Assume credentials match, but check password age next
        if (passwordExpiry.isBefore(LocalDate.now())) {
            throw new PasswordExpiredException(passwordExpiry, "Your password expired on " + passwordExpiry);
        }
        System.out.println("Login successful for user: " + username);
    }
}
