package mk.ukim.finki.emt.eshop.service.impl;

import mk.ukim.finki.emt.eshop.model.Author;
import mk.ukim.finki.emt.eshop.model.exceptions.AuthorNotFoundException;
import mk.ukim.finki.emt.eshop.repository.AuthorRepository;
import mk.ukim.finki.emt.eshop.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> findAll(Long id) {
        return this.authorRepository.findAll();
    }

    @Override
    public List<Author> listAll() {
        return this.authorRepository.findAll();
    }

    @Override
    public Optional<Author> findById(Long id) {
        return Optional.of(this.authorRepository.findById(id))
                .orElseThrow(() -> new AuthorNotFoundException(id));
    }

    @Override
    public Optional<Author> create(Author author) {
        return Optional.of(this.authorRepository.save(author));
    }
}
