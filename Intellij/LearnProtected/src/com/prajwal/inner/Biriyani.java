package com.prajwal.inner;

public class Biriyani extends Food {

    public void test(){
        System.out.println(spices);
        process(); // this method is protected in parent class but it access / invoke with help of method only

    }

    public static void main(String[] args) {
        Biriyani biriyani = new Biriyani();
        biriyani.test();
        biriyani.process(); // here we can access through variable(reference)
    }

}
