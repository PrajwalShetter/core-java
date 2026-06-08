package com.xworkz.learnInterface.Runner;

import com.xworkz.learnInterface.inner.BankAccount;
import com.xworkz.learnInterface.outer.CurrentAccount;
import com.xworkz.learnInterface.outer.SalaryAccount;
import com.xworkz.learnInterface.outer.SavingAccount;

public class BankAccountRunner {

    public static void main(String[] args) {

        BankAccount account1= new SavingAccount();
        account1.deposit();
        account1.withdraw();
        account1.checkBalance();
        account1.accountStatus();
        BankAccount.bankRules();
        System.out.println(BankAccount.minBalance);

        CurrentAccount account2 = new CurrentAccount();
        account2.deposit();
        account2.withdraw();
        account2.checkBalance();
        account2.accountStatus();

        SalaryAccount account3 = new SalaryAccount();
        account3.withdraw();
        account3.deposit();
        account3.checkBalance();
    }
}
