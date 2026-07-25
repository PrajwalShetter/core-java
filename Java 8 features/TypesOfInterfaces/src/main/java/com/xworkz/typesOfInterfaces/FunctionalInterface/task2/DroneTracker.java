package com.xworkz.typesOfInterfaces.FunctionalInterface.task2;

import com.xworkz.typesOfInterfaces.FunctionalInterface.task2.classes.Drone;
import com.xworkz.typesOfInterfaces.FunctionalInterface.task2.classes.Location;

@FunctionalInterface
public interface DroneTracker {


    Location track(Drone drone);
}
