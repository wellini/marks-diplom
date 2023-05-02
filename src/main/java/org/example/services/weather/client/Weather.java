package org.example.services.weather.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Weather {

    @JsonProperty("current_weather")
    private CurrentWeather currentWeather;

    @Data
    public static class CurrentWeather {
        private double temperature;
    }
}
