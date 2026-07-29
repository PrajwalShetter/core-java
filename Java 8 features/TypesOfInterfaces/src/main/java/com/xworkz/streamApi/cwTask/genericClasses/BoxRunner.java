package com.xworkz.streamApi.cwTask.genericClasses;

public class BoxRunner {

    public static void main(String[] args) {
        Box<String> box1=new Box<>("Java");
        Box<Integer> box2=new Box<>(23);

        box1.display();
        box2.display();

    }
}
