package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.model.enums.Category;

import javax.persistence.*;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "wardrobe_items")
public class WardrobeItem {

    @Id
    private UUID id = UUID.randomUUID();

    private String name;

    @Enumerated(EnumType.STRING)
    private Category category;

    public static WardrobeItem create(Category category, String name) {
        return new WardrobeItem(
                UUID.randomUUID(),
                name,
                category
        );
    }
}
