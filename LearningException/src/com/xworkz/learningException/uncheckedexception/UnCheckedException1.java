package com.xworkz.learningException.uncheckedexception;

public class UnCheckedException1 {

    public void divide() throws ArithmeticException{

        int result =10/0;
        System.out.println(result);
    }

    public void accessArray() throws ArrayIndexOutOfBoundsException{

        int[] arr={1,2,3};

        System.out.println(arr[6]);
    }

    public void convertNumber() throws NumberFormatException{

        int num = Integer.parseInt("hello");

        System.out.println(num);
    }

    public void accessString() throws NullPointerException{

        String str= null;

        System.out.println(str.length());
    }
}

