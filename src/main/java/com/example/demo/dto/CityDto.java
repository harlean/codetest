package com.example.demo.dto;

public class CityDto {

    private String cityName;
    private String updatedTime;
    private String weather;
    private String temperature;
    private String wind;

    public CityDto(String cityName, String updatedTime, String weather,String temperature,String wind) {
        this.cityName = cityName;
        this.updatedTime = updatedTime;
        this.weather = weather;
        this.temperature = temperature;
        this.wind = wind;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }







}
