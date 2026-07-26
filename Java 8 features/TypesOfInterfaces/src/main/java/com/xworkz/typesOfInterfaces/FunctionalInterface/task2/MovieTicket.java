package com.xworkz.typesOfInterfaces.FunctionalInterface.task2;

import com.xworkz.typesOfInterfaces.FunctionalInterface.task2.classes.Movie;
import com.xworkz.typesOfInterfaces.FunctionalInterface.task2.classes.Ticket;

@FunctionalInterface
public interface MovieTicket {

    Ticket display(Movie movie);

}
