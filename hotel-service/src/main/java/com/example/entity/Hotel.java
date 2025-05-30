package com.example.entity;

import lombok.Data;

@Data
public class Hotel {

    private Long id;
    private String name;
    private String address;
    private String city;
    private String description;
    private Double pricePerNight;

    public Hotel(Long id, String name, String address, String city, String description, Double pricePerNight, Integer availableRooms) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.description = description;
        this.pricePerNight = pricePerNight;
        this.availableRooms = availableRooms;
    }

    private Integer availableRooms;


}
