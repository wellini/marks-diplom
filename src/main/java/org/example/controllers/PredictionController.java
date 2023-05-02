package org.example.controllers;

import lombok.RequiredArgsConstructor;
import org.example.services.PredictionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/prediction")
public class PredictionController {

    private final PredictionService predictionService;

    @GetMapping
    public String prediction(Model model) {
        model.addAttribute("prediction", predictionService.getPrediction());
        return "prediction";
    }
}
