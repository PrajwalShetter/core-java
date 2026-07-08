package com.xworkz.Meta.services;

import com.xworkz.Meta.dto.SignUpDto;

import java.util.List;

public interface SignUpServices {

void register(SignUpDto user);

    void getAllData();

    List<SignUpDto> retrieveData();

    void getById(int id);

    void getByIdAndName(int id, String name);
}
