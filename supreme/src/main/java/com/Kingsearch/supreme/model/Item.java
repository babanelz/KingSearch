package com.Kingsearch.supreme.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String category;
    private String location;
    private String phoneNumber;
    private String date;
    private String status;

    // ✅ EMPTY CONSTRUCTOR (VERY IMPORTANT)
    public Item() {
    }


    public Item(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;


    }

    // getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}