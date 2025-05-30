package com.example.repository;


import com.example.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepo extends JpaRepository<Hotel, Long> {
    // JpaRepository provides all basic CRUD operations
    // Additional custom query methods can be added here if needed
}