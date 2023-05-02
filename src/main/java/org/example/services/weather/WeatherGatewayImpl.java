package org.example.services.weather;

import lombok.RequiredArgsConstructor;
import org.example.services.weather.client.Weather;
import org.example.services.weather.client.WeatherClient;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WeatherGatewayImpl implements WeatherGateway {

    private final WeatherClient weatherClient;

    @Override
    public int getCurrentTemperature() {
        Weather weather = weatherClient.getWeather("42.862683", "74.588602", true);
        return (int) weather.getCurrentWeather().getTemperature();
    }
}
