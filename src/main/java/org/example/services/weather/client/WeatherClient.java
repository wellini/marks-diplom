package org.example.services.weather.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "weather", url="https://api.open-meteo.com/")
public interface WeatherClient {

    @GetMapping("/v1/forecast")
    Weather getWeather(@RequestParam("latitude") String latitude, @RequestParam("longitude") String longitude, @RequestParam("current_weather") Boolean currentWeather);
}
