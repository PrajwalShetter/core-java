package com.xworkz.hotel.service.impl;

import com.xworkz.hotel.dao.HotelDao;
import com.xworkz.hotel.dao.Impl.HotelDaoImpl;
import com.xworkz.hotel.dto.Hotel;
import com.xworkz.hotel.service.HotelService;

public class HotelServiceImpl implements HotelService {

HotelDao hotelDao = new HotelDaoImpl();

    @Override
    public void save(Hotel hotel) {
        System.out.println("service save");
        hotelDao.save(hotel);
    }

    @Override
    public void edit() {
        System.out.println("service edit");
        hotelDao.edit();
    }

    @Override
    public void delete() {
        System.out.println("service delete");
        hotelDao.delete();
    }
}
