package com.xworkz.Meta.dao;

import com.xworkz.Meta.dto.SignUpDto;

import java.util.List;

public interface SignUpDao {

    void register(SignUpDto user);

    void getAllData();

     List<SignUpDto> retrieveData();

}
