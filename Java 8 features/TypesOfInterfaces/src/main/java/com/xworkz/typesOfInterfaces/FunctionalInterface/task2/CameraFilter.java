package com.xworkz.typesOfInterfaces.FunctionalInterface.task2;

import com.xworkz.typesOfInterfaces.FunctionalInterface.task2.classes.Photo;

@FunctionalInterface
public interface CameraFilter {

    Photo details(Photo photo);
}
