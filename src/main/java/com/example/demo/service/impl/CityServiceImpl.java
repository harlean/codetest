package com.example.demo.service.impl;

import com.example.demo.common.DataSource;
import com.example.demo.dto.CityDto;
import com.example.demo.service.CityService;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Override
    public List<String> query() {
        String[] cityNames = {"Sydney","Melbourne","Wollongong"};
        return Arrays.asList(cityNames);
    }

    @Override
    public CityDto queryDetail(String cityName) {
        return DataSource.cityDtoMap.get(cityName);
    }
}
