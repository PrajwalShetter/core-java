package com.prajwal.inner;

public class Pizza {

    private String pizzaName;
    private double cost;
    private String size;

    // public:
    // Accessible anywhere in the project
    // (inside package and outside package)

    // default:
    // Accessible only within the same package

    // protected:
    // Accessible within the same package
    // and outside package through inheritance

    // private:
    // Accessible only inside the same class

    protected Pizza() {

        ingriedent();
    }

    private void ingriedent(){
        System.out.println("I am private method");

    }


}

