package com.xworkz.typesOfInterfaces.FunctionalInterface.task2;

import com.xworkz.typesOfInterfaces.FunctionalInterface.task2.classes.Planet;

@FunctionalInterface
public interface PlanetScanner {

    Planet details(Planet[] planets);
}
