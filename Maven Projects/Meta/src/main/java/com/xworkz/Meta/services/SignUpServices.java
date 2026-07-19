package com.xworkz.Meta.services;

import com.xworkz.Meta.dto.SignUpDto;

import java.util.List;

public interface SignUpServices {

boolean register(SignUpDto user);

    void getAllData();

    List<SignUpDto> retrieveData();

    void getById(int id);

    void getByIdAndName(int id, String name);

    void update();

     void delete();

     void save(SignUpDto user);

      int droptTable();
}


