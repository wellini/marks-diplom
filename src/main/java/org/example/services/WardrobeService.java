package org.example.services;

import lombok.RequiredArgsConstructor;
import org.example.model.WardrobeItem;
import org.example.model.enums.Category;
import org.example.repositories.WardrobeItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WardrobeService {

    private final WardrobeItemRepository wardrobeItemRepository;

    public List<WardrobeItem> getAllItems() {
        return wardrobeItemRepository.findAll();
    }

    public void addWardrobeItem(Category category, String name) {
        wardrobeItemRepository.save(WardrobeItem.create(category, name));
    }
}
