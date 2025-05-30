package com.example.booking_service.service;


import com.example.booking_service.entity.Book;
import org.springframework.stereotype.Service;
import com.example.booking_service.repository.BookRepository;
import java.util.List;

@Service
public class BookService {

    private final BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    public Book addBook(Book book) {
        book.setBookingStatus(true);
        return repo.save(book);
    }

    public void deleteBook(Long id) {
        repo.deleteById(id);
    }

    public Book updateBook(Book book) {
        return repo.save(book);
    }
}
