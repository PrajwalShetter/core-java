package com.xworkz.learningException.runner;

import com.xworkz.learningException.uncheckedexception.UnCheckedException1;

public class UnCheckedExceptionRunner1 {

    public static void main(String[] args) {

        UnCheckedException1 unCheckedExce = new UnCheckedException1();


        //single catch
        try{
            unCheckedExce.divide();
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException handled");
        }

        //Multiple Exception

        try{
            unCheckedExce.convertNumber();
            unCheckedExce.accessArray();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        }

        //Multi
        try{
            unCheckedExce.accessString();
            unCheckedExce.divide();
            unCheckedExce.convertNumber();
        } catch (NumberFormatException | ArithmeticException | NullPointerException exception) {
            System.out.println("Exception handles successfully");
        }
    }
}
