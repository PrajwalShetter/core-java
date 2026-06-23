package com.xworkz.learningException.runner;

import com.xworkz.learningException.checkedexception.CheckedException1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionRunner1 {
    public static void main(String[] args) {

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
