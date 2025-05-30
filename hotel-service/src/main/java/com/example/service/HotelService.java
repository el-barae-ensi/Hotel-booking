package com.example.service;

import com.example.entity.Hotel;
import com.example.repository.HotelRepo;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class HotelService {

    private final HotelRepo hotelRepo;

    public HotelService(HotelRepo hotelRepo) {this.hotelRepo = hotelRepo;}

    public List<Hotel> getAllHotels(){ return hotelRepo.findAll(); };
    public Hotel  getHotelById(Long id){ return hotelRepo.findById(id).orElse(null); };
    public Hotel createHotel(Hotel hotel){ return hotelRepo.save(hotel); };
//    public updateHotel(Long id, Hotel hotel){ return hotelRepo. };
    public  void deleteHotel(Long id){ hotelRepo.deleteById(id); };;
}
