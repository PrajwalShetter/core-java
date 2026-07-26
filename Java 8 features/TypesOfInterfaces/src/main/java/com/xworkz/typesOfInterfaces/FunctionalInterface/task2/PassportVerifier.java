package com.xworkz.typesOfInterfaces.FunctionalInterface.task2;

import com.xworkz.typesOfInterfaces.FunctionalInterface.task2.classes.Passport;

@FunctionalInterface
public interface PassportVerifier {

    boolean verify(Passport passport);
}
