package com.myapp.integrationFeignITVDN.controller;

import com.myapp.integrationFeignITVDN.facade.WeatherFacade;
import com.myapp.integrationFeignITVDN.model.WeatherRequest;
import com.myapp.integrationFeignITVDN.model.WeatherResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherFacade weatherFacade;

    @PostMapping
    public WeatherResponse getWeather(@RequestBody final WeatherRequest request){
        return weatherFacade.getWeather(request);
    }
}
