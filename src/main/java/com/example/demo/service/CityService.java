package com.example.demo.service;

import com.example.demo.dto.CityDto;

import java.util.List;

public interface CityService {

    List<String> query();


    CityDto queryDetail(String cityName);
}
