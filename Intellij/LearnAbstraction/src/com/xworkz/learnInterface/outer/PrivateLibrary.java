package com.xworkz.learnInterface.outer;

import com.xworkz.learnInterface.inner.Library;

public class PrivateLibrary implements Library {

    @Override
    public void issueBook() {
        System.out.println("issuing book from private Library");
    }

    @Override
    public void returnBook() {
        System.out.println("returning book to private Library");
    }

    @Override
    public void searchBook() {
        System.out.println("searching book in private Library");
    }
}
