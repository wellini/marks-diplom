package org.example.controllers.dto;

import lombok.Data;
import org.example.model.enums.Category;

@Data
public class AddWardrobeDto {

    private String name;

    private Category category;
}
