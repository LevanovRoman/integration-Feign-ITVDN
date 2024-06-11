package com.myapp.integrationFeignITVDN.client.model;

import java.time.LocalDateTime;

public record WeatherApiResponse(LocalDateTime date, String value) {
}
