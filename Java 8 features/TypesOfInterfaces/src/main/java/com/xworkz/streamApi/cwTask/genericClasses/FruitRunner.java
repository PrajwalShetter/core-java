package com.xworkz.streamApi.cwTask.genericClasses;

public class FruitRunner {
    public static void main(String[] args) {

       Fruit<String, Integer>cost= new Fruit<>("Apple",120);
       Fruit<String, Boolean> bitter = new Fruit<String, Boolean>("Pinapple", true);

       cost.display();
       bitter.display();
    }
}
