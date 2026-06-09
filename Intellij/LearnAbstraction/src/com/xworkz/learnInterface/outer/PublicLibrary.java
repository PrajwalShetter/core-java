package com.xworkz.learnInterface.outer;

import com.xworkz.learnInterface.inner.Library;

public class PublicLibrary implements Library {

    @Override
    public void issueBook() {
        System.out.println("issuing book from public Library");
    }

    @Override
    public void returnBook() {
        System.out.println("returning book to public Library");
    }

    @Override
    public void searchBook() {
        System.out.println("searching book in public Library");
    }

    @Override
    public void libraryRules() {
        System.out.println("simple");
    }
}
