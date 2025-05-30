package com.example.booking_service.controller;




import com.example.booking_service.entity.Book;
import com.example.booking_service.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        Book b= new Book();
        b.setId(1L);
        b.setUserId(0L);
        b.setHotelId(0L);
        b.setCheckInDate("2023-10-01");
        b.setCheckOutDate("2023-10-05");
        b.setNumberOfGuests(2);
        b.setBookingStatus(true);
        // Assuming you want to return a list with just this one book for now
         books.add(b);
        return books;

      // return service.getAllBooks();
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return service.addBook(book);
    }

    @PutMapping
    public Book updateBook(@RequestBody Book book) {
        return service.updateBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        service.deleteBook(id);
    }
}
