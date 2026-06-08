package com.xworkz.learnInterface.outer;

import com.xworkz.learnInterface.inner.BankAccount;

public class SalaryAccount implements BankAccount {

    @Override
    public void deposit() {
        System.out.println("Minimum deposit 50Lack");
    }

    @Override
    public void withdraw() {
        System.out.println("Max withdraw 1cr");
    }

    @Override
    public void checkBalance() {
        System.out.println("hard");
    }
}

