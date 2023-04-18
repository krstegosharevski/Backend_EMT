package mk.ukim.finki.emt.eshop.service;

import mk.ukim.finki.emt.eshop.model.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    List<Author> findAll(Long id);

    List<Author> listAll();

    Optional<Author> findById(Long id);

    Optional<Author> create(Author author);
}
