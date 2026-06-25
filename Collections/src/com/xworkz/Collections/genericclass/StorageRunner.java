package com.xworkz.Collections.genericclass;

public class StorageRunner {

    public static void main(String[] args) {

        Storage<Integer, String> storage1= new Storage<>(1024,"HDD");

        Storage<Integer, String> storage2 = new Storage<>(512,"SSD");

        storage1.print();
        storage2.print();


    }
}
