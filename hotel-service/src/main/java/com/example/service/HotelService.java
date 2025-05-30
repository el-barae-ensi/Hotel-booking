package com.example.service;



import com.example.entity.Hotel;
import com.example.repository.HotelRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HotelService {

    private final HotelRepo hotelRepo;

    public List<Hotel> getAllHotels() {
        return hotelRepo.findAll();
    }

    public Hotel getHotelById(Long id) {
        Optional<Hotel> hotel = hotelRepo.findById(id);
        if (hotel.isPresent()) {
            return hotel.get();
        }
        throw new RuntimeException("Hotel not found with id: " + id);
    }

    public Hotel createHotel(Hotel hotel) {
        // Set id to null to ensure it's auto-generated
        hotel.setId(null);
        return hotelRepo.save(hotel);
    }

    public Hotel updateHotel(Long id, Hotel hotel) {
        Hotel existingHotel = getHotelById(id);

        // Update fields
        existingHotel.setName(hotel.getName());
        existingHotel.setAddress(hotel.getAddress());
        existingHotel.setCity(hotel.getCity());
        existingHotel.setDescription(hotel.getDescription());
        existingHotel.setPricePerNight(hotel.getPricePerNight());
        existingHotel.setAvailableRooms(hotel.getAvailableRooms());

        return hotelRepo.save(existingHotel);
    }

    public void deleteHotel(Long id) {
        Hotel hotel = getHotelById(id);
        hotelRepo.delete(hotel);
    }
}