package com.xworkz.learningException.checkedexception;

public class CheckedException {




    public void withdraw(double amt)  {
    try {
        if (amt != 0 && amt > 0) {
        System.out.println("Processing withdrawal amount: " + amt);
        }else {
            throw new ClassNotFoundException();
        }
        }
    catch (ClassNotFoundException e){
            e.printStackTrace();
    }
    }
}
