package mk.ukim.finki.emt.eshop.service;

import mk.ukim.finki.emt.eshop.model.Book;
import mk.ukim.finki.emt.eshop.model.Category;
import mk.ukim.finki.emt.eshop.model.dto.BookDto;

import java.util.List;
import java.util.Optional;

public interface BookService {


    List<Book> listAll();
    Optional<Book> findById(Long id);
    Optional<Book> create(String name, Category category, Long authorId, Integer availableCopies);
    Optional<Book> addBook(BookDto bookDto);
    Optional<Book> edit(Long id, BookDto bookDto);
    Optional<Book> delete(Long id);
    Optional<Book> markAsTaken(Long id);
}
