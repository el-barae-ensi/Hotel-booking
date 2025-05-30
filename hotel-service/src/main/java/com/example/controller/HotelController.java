package com.example.controller;



import com.example.entity.Hotel;
import com.example.service.HotelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Hotels")
public class HotelController {

    private final HotelService service;

    public HotelController(HotelService service) {
        this.service = service;
    }

    @GetMapping
    public List<Hotel> getAllHotels() {
        return service.getAllHotels();
    }


    @DeleteMapping("/{id}")
    public void deleteHotel(@PathVariable Long id) {
        service.deleteHotel(id);
    }
}
