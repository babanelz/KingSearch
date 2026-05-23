package com.Kingsearch.supreme;

import com.Kingsearch.supreme.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface itemRepository extends JpaRepository<Item, Long> {
    List<Item> findByName(String name);
}
