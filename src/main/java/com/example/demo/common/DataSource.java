package com.example.demo.common;

import com.example.demo.dto.CityDto;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DataSource {

    public static final Map<String,CityDto> cityDtoMap = new ConcurrentHashMap<>();

    static {
        CityDto sydney = new CityDto("Sydney","Thursday 11:00 AM","Mostly Cloudy","9°C","32km/h");
        CityDto melbourne = new CityDto("Melbourne","Thursday 10:00 AM","Mostly Cloudy","11°C","10km/h");
        CityDto wollongong = new CityDto("Wollongong","Thursday 08:00 AM","Mostly Cloudy","12°C","11km/h");
        cityDtoMap.put("Sydney",sydney);
        cityDtoMap.put("Melbourne",melbourne);
        cityDtoMap.put("Wollongong",wollongong);
    }
}
