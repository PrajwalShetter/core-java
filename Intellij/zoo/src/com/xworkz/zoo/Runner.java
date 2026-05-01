package com.xworkz.zoo;
import com.xworkz.zoo.management.TicketManagement;
import com.xworkz.zoo.management.VehicleTickets;
import com.xworkz.zoo.management.WalkTickets;
import com.xworkz.zoo.service.GuideService;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Hi iam Prajwal");

        TicketManagement ticketManagement = new VehicleTickets();
        ticketManagement.paperQuality();

    }
}
