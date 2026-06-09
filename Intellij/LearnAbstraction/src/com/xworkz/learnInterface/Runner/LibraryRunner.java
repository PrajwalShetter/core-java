package com.xworkz.learnInterface.Runner;

import com.xworkz.learnInterface.inner.Library;
import com.xworkz.learnInterface.outer.NgoLibrary;
import com.xworkz.learnInterface.outer.PrivateLibrary;
import com.xworkz.learnInterface.outer.PublicLibrary;

public class LibraryRunner {

    public static void main(String[] args) {

        PublicLibrary library1= new PublicLibrary();
        library1.issueBook();
        library1.returnBook();
        library1.searchBook();
        library1.libraryRules();
        System.out.println(Library.maxBooks);

        NgoLibrary library2= new NgoLibrary();
        library2.issueBook();
        library2.returnBook();
        library2.searchBook();

        PrivateLibrary library3 = new PrivateLibrary();
        library3.issueBook();
        library3.returnBook();
        library3.searchBook();


    }
}
