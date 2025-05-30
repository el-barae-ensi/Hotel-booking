package com.example.booking_service.controller;



import com.example.booking_service.entity.Book;
import com.example.booking_service.service.BookService;
import org.springframework.web.bind.annotation.*;

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
        return service.getAllBooks();
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
