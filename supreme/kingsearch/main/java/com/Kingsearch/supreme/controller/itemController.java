package com.Kingsearch.supreme.controller;

import com.Kingsearch.supreme.model.Item;
import com.Kingsearch.supreme.repository.itemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class itemController {

    private final itemRepository itemRepository;

    public itemController(itemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping("/test")
    public String test() {
        itemRepository.save(new Item(null, "Test Item", "Working"));
        return "Saved!";
    }
    @GetMapping("/search")
    public List<Item> searchByName(@RequestParam String name) {
        return itemRepository.findByName(name);
    }
    @GetMapping
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return itemRepository.save(item);
    }
    @DeleteMapping("/{id}")
    public String deleteItem(@PathVariable Long id) {
        itemRepository.deleteById(id);
        return "Item deleted!";
    }
    @GetMapping("/delete/{id}")
    public String deleteItemEasy(@PathVariable Long id) {
        itemRepository.deleteById(id);
        return "Item deleted!";
    }
    @PutMapping("/{id}")
    public Item updateItem(@PathVariable Long id, @RequestBody Item updatedItem) {
        Item item = itemRepository.findById(id).orElseThrow();

        item.setName(updatedItem.getName());
        item.setDescription(updatedItem.getDescription());

        return itemRepository.save(item);
    }
    @GetMapping("/update/{id}")
    public String updateItemEasy(@PathVariable Long id) {
        Item item = itemRepository.findById(id).orElseThrow();
        item.setName("Updated Name");
        item.setDescription("Updated Description");
        itemRepository.save(item);
        return "Item updated!";
    }
}