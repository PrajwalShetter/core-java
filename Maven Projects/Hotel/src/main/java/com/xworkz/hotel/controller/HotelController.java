package com.xworkz.hotel.controller;

import com.xworkz.hotel.dto.Hotel;
import com.xworkz.hotel.service.HotelService;
import com.xworkz.hotel.service.impl.HotelServiceImpl;

public class HotelController {

    HotelService hotelService = new HotelServiceImpl();

    public void saveData(Hotel hotel ){
//        System.out.println( hotel.getHotelName());
//        hotel.getHotelId();
//        hotel.getAddress();
        System.out.println("controller save method");
        hotelService.save(hotel);
    }

    public void editData(){
        System.out.println("edit method called");
        hotelService.edit();
    }

    public void delete(){
        System.out.println("delete method called");
        hotelService.delete();
    }


}
