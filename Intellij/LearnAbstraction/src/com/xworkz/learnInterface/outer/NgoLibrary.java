package com.xworkz.learnInterface.outer;

import com.xworkz.learnInterface.inner.Library;

public class NgoLibrary implements Library {

    @Override
    public void issueBook() {
        System.out.println("issuing book from NgoLibrary");
    }

    @Override
    public void returnBook() {
        System.out.println("returning book to ngoLibrary");
    }

    @Override
    public void searchBook() {
        System.out.println("searching book from NgoLibrary");
    }

}
