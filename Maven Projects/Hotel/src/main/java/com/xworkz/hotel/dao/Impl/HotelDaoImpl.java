package com.xworkz.hotel.dao.Impl;

import com.xworkz.hotel.dao.HotelDao;
import com.xworkz.hotel.dto.Hotel;

public class HotelDaoImpl implements HotelDao {


    @Override
    public void save(Hotel hotel) {
        System.out.println("hotel Doa save");
    }

    @Override
    public void edit() {
        System.out.println("hotelDao edit");
    }

    @Override
    public void delete() {
        System.out.println("hotelDao delete");
    }
}
