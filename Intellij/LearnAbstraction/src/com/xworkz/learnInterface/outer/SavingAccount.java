package com.xworkz.learnInterface.outer;

import com.xworkz.learnInterface.inner.BankAccount;

public class SavingAccount implements BankAccount {

    @Override
    public void deposit() {
        System.out.println("Minimum deposit is 500000");
    }

    @Override
    public void withdraw() {
        System.out.println("Max withdraw is 300000");
    }

    @Override
    public void checkBalance() {
        System.out.println("Easy");
    }

    @Override
    public void accountStatus() {
        System.out.println("Active");
    }
}
