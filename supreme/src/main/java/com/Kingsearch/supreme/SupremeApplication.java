package com.Kingsearch.supreme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import com.Kingsearch.supreme.model.Item;
import com.Kingsearch.supreme.repository.itemRepository;

@SpringBootApplication
public class SupremeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupremeApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(itemRepository repository) {
        return (args) -> {
            System.out.println(">>> INSERTING DATA <<<");
            repository.save(new Item(null, "Phone", "Lost iPhone"));
            repository.save(new Item(null, "Bag", "Black backpack"));
        };
    }
}