package com.xworkz.learningException;

import com.xworkz.learningException.checkedexception.CheckedException;
import com.xworkz.learningException.checkedexception.CheckedException1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;

public class CheckedExeRunner {
    public static void main(String[] args) {
        // 1st day
        CheckedException exceptionDemo = new CheckedException();
            exceptionDemo.withdraw(-1500.00);
        System.out.println("Thank-you for using  application");

        //2nd day -- Inbuilt checked
        CheckedException1 checkedExce = new CheckedException1();

        //single catch
        try{
            checkedExce.readFile();
        }catch (FileNotFoundException e){
            System.err.println("FileNotFoundException  handled");
        }

        //multiple catch
        try{
            checkedExce.readFile();
            checkedExce.readClass();
        }
        catch (FileNotFoundException e){
            System.err.println("FileNotFoundException  handled");
        }
        catch (ClassNotFoundException e){
        System.err.println("ClassNotFoundException  handled");
        }

        //Multi
        try{
            checkedExce.sleep();
            checkedExce.writeFile();
            checkedExce.readClass();
        }
        catch(IOException | ClassNotFoundException | InterruptedException exception){
            System.out.println("Exception handled succesfully");
        }

    }
}
