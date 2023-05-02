package org.example.controllers;

import lombok.RequiredArgsConstructor;
import org.example.controllers.dto.AddWardrobeDto;
import org.example.services.WardrobeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/wardrobe")
@RequiredArgsConstructor
public class WardrobeController {

    private final WardrobeService wardrobeService;

    @GetMapping
    public String wardrobe(Model model) {
        model.addAttribute("items", wardrobeService.getAllItems());
        return "wardrobe";
    }

    @GetMapping("/add")
    public String getAddWardrobeItem() {
        return "wardrobe-add-item";
    }

    @PostMapping
    public String addWardrobeItem(@ModelAttribute("dto") AddWardrobeDto addWardrobeDto) {
        wardrobeService.addWardrobeItem(addWardrobeDto.getCategory(), addWardrobeDto.getName());
        return "redirect:/wardrobe";
    }
}
