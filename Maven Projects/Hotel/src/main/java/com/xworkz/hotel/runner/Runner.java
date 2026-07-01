package com.xworkz.hotel.runner;

import com.xworkz.hotel.controller.HotelController;
import com.xworkz.hotel.dto.Hotel;

public class Runner {

    public static void main(String[] args) {

        System.out.println("lallallallallalalalallllaa");

        HotelController hotelController = new HotelController();

        Hotel hotel1 = new Hotel();
        hotel1.setHotelId(1);
        hotel1.setHotelName("Rameshwarm");
        hotel1.setAddress("beng");


        hotelController.saveData(hotel1);
        hotelController.editData();
        hotelController.delete();
    }
}
