package com.example.repository;

import com.example.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HotelRepo extends JpaRepository<Hotel, Long> {
}
