package com.xworkz.typesOfInterfaces.FunctionalInterface.task2;

import com.xworkz.typesOfInterfaces.FunctionalInterface.task2.classes.Rocket;

@FunctionalInterface
public interface RocketLaunch {

    boolean launch(Rocket rocket);
}
