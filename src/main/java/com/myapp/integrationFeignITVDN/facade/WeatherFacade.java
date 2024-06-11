package com.myapp.integrationFeignITVDN.facade;

import com.myapp.integrationFeignITVDN.client.ExternalWeatherApi;
import com.myapp.integrationFeignITVDN.model.WeatherRequest;
import com.myapp.integrationFeignITVDN.model.WeatherResponse;
import com.myapp.integrationFeignITVDN.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WeatherFacade {

    private final WeatherService weatherService;
    private final ExternalWeatherApi externalWeatherApi;

    public WeatherResponse getWeather(WeatherRequest request) {
        return
                weatherService.getWeather(request.longitude(), request.latitude(), request.date())
                        .map(weatherModel -> new WeatherResponse(weatherModel.date(), weatherModel.temperature()
                                + weatherModel.type().name()))
//                        .orElse(WeatherResponse.empty());
                        .orElse(getExternalWeatherApi(request))
    }

    private WeatherResponse getExternalWeatherApi(WeatherRequest request) {
        return Optional.ofNullable(externalWeatherApi.getWeather(request.longitude(), request.latitude()))
                .map(response -> new WeatherResponse(response.date(), response.value()))
                .orElse(WeatherResponse.empty());
    }
}
