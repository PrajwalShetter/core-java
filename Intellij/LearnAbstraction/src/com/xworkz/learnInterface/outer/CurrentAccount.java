package com.xworkz.learnInterface.outer;

import com.xworkz.learnInterface.inner.BankAccount;

public class CurrentAccount implements BankAccount {

    @Override
    public void deposit() {
        System.out.println("Minimum deposit 1cr");
    }

    @Override
    public void withdraw() {
        System.out.println("No limit");
    }

    @Override
    public void checkBalance() {
        System.out.println("Modrate");
    }

    @Override
    public void accountStatus() {
        System.out.println("De Active");
    }
}
