package com.example.demo.controller;

import com.example.demo.common.Result;
import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("city")
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/queryDetail")
    public Result queryDetail(String cityName){
        return Result.success(cityService.queryDetail(cityName));
    }

    @RequestMapping("/query")
    public Result query(){
        return Result.success(cityService.query());
    }
}
