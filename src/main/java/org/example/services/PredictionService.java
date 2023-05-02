package org.example.services;

import lombok.RequiredArgsConstructor;
import org.example.model.WardrobeItem;
import org.example.repositories.WardrobeItemRepository;
import org.example.services.weather.WeatherGateway;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PredictionService {

    private final static String PREDICTION_TEMPLATE = "Рекомендуемые элементы одежды на сегодня: %s";

    private final WeatherGateway weatherGateway;
    private final WardrobeItemRepository wardrobeItemRepository;

    public String getPrediction() {
        int currentTemperature = weatherGateway.getCurrentTemperature();
        List<WardrobeItem> items = wardrobeItemRepository.findAll();
        String predictedItems = items.stream()
                .filter(item -> item.getCategory().matchesTemperature(currentTemperature))
                .map(WardrobeItem::getName).collect(Collectors.joining(", "));
        return String.format(PREDICTION_TEMPLATE, predictedItems);
    }
}
