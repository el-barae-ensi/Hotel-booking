package com.example.booking_service.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long hotelId;
    private String checkInDate;
    private String checkOutDate;
    private Integer numberOfGuests;
    private boolean bookingStatus;
}

