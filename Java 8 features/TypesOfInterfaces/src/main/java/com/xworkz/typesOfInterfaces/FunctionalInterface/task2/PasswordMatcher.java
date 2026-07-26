package com.xworkz.typesOfInterfaces.FunctionalInterface.task2;

@FunctionalInterface
public interface PasswordMatcher {

    boolean match(String pass1, String pass2);
}
