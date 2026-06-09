package com.xworkz.learnInterface.inner;

public interface Library {

    int maxBooks = 2000;

    void issueBook();

    void returnBook();

    void searchBook();

    default void libraryRules(){
        System.out.println("library will take care of it");
    }

    static  void libraryTiming(){
        System.out.println("library will fix it");
    }
}
