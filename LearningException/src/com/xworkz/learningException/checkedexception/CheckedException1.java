package com.xworkz.learningException.checkedexception;

import java.io.*;

public class CheckedException1 {

    public void readFile() throws FileNotFoundException {

        FileReader fileReader = new FileReader("config.js");
        System.out.println("file opened");
    }

    public void writeFile() throws IOException{

        FileWriter writer = new FileWriter("data.txt");
        writer.write("helo java");
        writer.close();
    }

    public void readClass() throws ClassNotFoundException{

        Class.forName("com.mysql.Driver");
        System.out.println("class is found");
    }

    public void sleep() throws InterruptedException{

        Thread.sleep(2000);
        System.out.println("program completes");

    }

}
