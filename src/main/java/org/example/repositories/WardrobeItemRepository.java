package org.example.repositories;

import org.example.model.WardrobeItem;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;
import java.util.UUID;

@RepositoryDefinition(domainClass = WardrobeItem.class, idClass = UUID.class)
public interface WardrobeItemRepository {

    List<WardrobeItem> findAll();

    void save(WardrobeItem item);
}
