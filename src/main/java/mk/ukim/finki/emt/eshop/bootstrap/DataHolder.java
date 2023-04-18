package mk.ukim.finki.emt.eshop.bootstrap;

import mk.ukim.finki.emt.eshop.model.Author;
import mk.ukim.finki.emt.eshop.model.Book;
import mk.ukim.finki.emt.eshop.model.Country;
import mk.ukim.finki.emt.eshop.repository.AuthorRepository;
import mk.ukim.finki.emt.eshop.repository.BookRepository;
import mk.ukim.finki.emt.eshop.repository.CountryRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import static mk.ukim.finki.emt.eshop.model.Category.*;

@Component
public class DataHolder {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final CountryRepository countryRepository;

    public DataHolder(BookRepository bookRepository, AuthorRepository authorRepository, CountryRepository countryRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.countryRepository = countryRepository;
    }

    @PostConstruct
    public void init() {

        Country country_1 = new Country("USA", "North America");
        Country country_2 = new Country("England", "Europe");
        Country country_3 = new Country("Germany", "Europe");
        Country country_4 = new Country("France", "Europe");
        Country country_5 = new Country("Macedonia", "Europe");
        Country country_6 = new Country("Japan", "Asia");

        this.countryRepository.save(country_1);
        this.countryRepository.save(country_2);
        this.countryRepository.save(country_3);
        this.countryRepository.save(country_4);
        this.countryRepository.save(country_5);
        this.countryRepository.save(country_6);


        Author author_1 = new Author("Mark", "Twain", country_1);
        Author author_2 = new Author("Slavko", "Janevski", country_5);
        Author author_3 = new Author("J.R.R", "Tolkien", country_2);
        Author author_4 = new Author("Slavko", "Janevski", country_5);
        Author author_5 = new Author("Albert", "Camus", country_4);
        Author author_6 = new Author("Charles", "Dickens", country_2);
        Author author_7 = new Author("Akira", "Toriyama", country_6);

        this.authorRepository.save(author_1);
        this.authorRepository.save(author_2);
        this.authorRepository.save(author_3);
        this.authorRepository.save(author_4);
        this.authorRepository.save(author_5);
        this.authorRepository.save(author_6);
        this.authorRepository.save(author_7);

        Book book_1 = new Book("Adventures of Huckleberry Finn", NOVEL, author_1, 150);
        Book book_2 = new Book("Dve Mari", NOVEL, author_2, 20);
        Book book_3 = new Book("Selo zad sedum jaseni", NOVEL, author_2, 45);
        Book book_4 = new Book("Divo Meso", DRAMA, author_4, 340);
        Book book_5 = new Book("Oliver Twist", NOVEL, author_6, 135);
        Book book_6 = new Book("A Christmas Carol", DRAMA, author_6, 220);
        Book book_7 = new Book("Dragon Ball", FANTASY, author_7, 800);
        Book book_8 = new Book("The Stranger", NOVEL, author_5, 180);
        Book book_9 = new Book("The Hobbits", FANTASY, author_3, 355);
        Book book_10 = new Book("The Plague", NOVEL, author_5, 260);

        this.bookRepository.save(book_1);
        this.bookRepository.save(book_2);
        this.bookRepository.save(book_3);
        this.bookRepository.save(book_4);
        this.bookRepository.save(book_5);
        this.bookRepository.save(book_6);
        this.bookRepository.save(book_7);
        this.bookRepository.save(book_8);
        this.bookRepository.save(book_9);
        this.bookRepository.save(book_10);
    }
}