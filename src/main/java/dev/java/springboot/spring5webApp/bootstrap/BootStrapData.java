package dev.java.springboot.spring5webApp.bootstrap;

import dev.java.springboot.spring5webApp.domain.Author;
import dev.java.springboot.spring5webApp.domain.Book;
import dev.java.springboot.spring5webApp.domain.Publisher;
import dev.java.springboot.spring5webApp.respositories.AuthorRepository;
import dev.java.springboot.spring5webApp.respositories.BookRepository;
import dev.java.springboot.spring5webApp.respositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher publisher = new Publisher("NaiEin","68/22","Talad-Yai","Phuket","84210");
        publisherRepository.save(publisher);
        Author rod = new Author("Rod","Johnson");
        Book noEJB = new Book("J2EE Development without EJB","3934256762");

        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Driver Design","123123");

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);


        authorRepository.save(eric);
        bookRepository.save(ddd);
        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Publisher Number of Books: " + publisher.getBooks().size());



    }
}
