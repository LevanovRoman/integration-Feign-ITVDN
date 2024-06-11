package com.myapp.integrationFeignITVDN.model;

import java.time.LocalDateTime;

public record WeatherResponse(LocalDateTime date, String temperature) {

    public static WeatherResponse empty(){
        return new WeatherResponse(LocalDateTime.now(), "no data found");
    }
}
