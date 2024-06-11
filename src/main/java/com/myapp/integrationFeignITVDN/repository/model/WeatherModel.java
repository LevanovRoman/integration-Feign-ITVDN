package com.myapp.integrationFeignITVDN.repository.model;

import java.time.LocalDateTime;

public record WeatherModel(LocalDateTime date, Double temperature, TemperatureType type) {
}
