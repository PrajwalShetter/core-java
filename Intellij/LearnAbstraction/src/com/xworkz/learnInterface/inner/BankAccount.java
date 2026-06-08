package com.xworkz.learnInterface.inner;

public interface BankAccount {

    String bankName= "SBI";
    double minBalance = 1000.00;

    void deposit();

    void withdraw();

    void checkBalance();

    default void accountStatus(){
        System.out.println("Active");
    }

    static void bankRules(){
        System.out.println("lot of rules are there to maintain");
    }
}
